package com.logicommerce.sdk.resources;

import java.util.Map;
import java.util.Set;
import com.logicommerce.sdk.models.basket.BasketChanges;
import com.logicommerce.sdk.models.basket.BasketContext;
import com.logicommerce.sdk.models.basket.BasketView;
import com.logicommerce.sdk.models.basket.ClientInfo;

/**
 * <p>Basket resource interface: creates, reads, changes and deletes guest baskets of the commerce, identified by their
 * token, from any plugin request, without the basket being the request's own session.</p>
 *
 * <p>Every method works in a context core rebuilds from the basket (its country, language, currency and customer) and
 * from the given {@link ClientInfo}, never from the caller's request headers: the user agent and IP come from the
 * client, the client is never treated as a bot, and plugin filters by country, zone and group apply as on the
 * storefront. Tokens of baskets of another commerce behave as tokens of no basket.</p>
 *
 * <p>A plugin request serves at most one basket: once {@link #create create}, {@link #get get}, {@link #apply apply}
 * or {@link #delete delete} has loaded or created a basket, calling any of them for another token in the same request
 * throws an {@link IllegalStateException} (a programming error, not retryable). A call that found no basket loads none,
 * and a failed {@link #create create} keeps none, so the caller can retry with another token.
 * {@link #putStorage putStorage} and {@link #removeStorage removeStorage} do not load the basket and are not limited. {@link CatalogResource} calls are not limited either: they may run in the same
 * request before or after these calls, never inject, replace or save a basket, and leave the served basket and its
 * context unchanged.</p>
 *
 * <p>Each mutating call applies all its changes, recalculates the basket once and saves it synchronously, with an update
 * that never recreates a basket deleted in the meantime. Business refusals (a row that cannot be added, a rejected
 * voucher code, a rejected currency) are data in the returned {@link BasketView}; {@link PluginResourceException} is only thrown
 * for infrastructure failures. Misuse (a null token, context or changes where one is required, a row with a
 * non-positive product id or quantity, a storage key that breaks the rules of {@link #putStorage putStorage}) throws an
 * {@link IllegalArgumentException} before anything is changed.</p>
 *
 * <pre>
 * &#64;Resource
 * private BasketResource basketResource;
 * </pre>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketResource {

	/**
	 * Creates a guest basket in the given context, applies the changes as {@link #apply apply} does, recalculates it
	 * once, inserts it, and then writes {@link BasketChanges#getStorage()} to the calling plugin's per-basket storage as
	 * {@link #putStorage putStorage} does. The basket is created even when no row could be added (the caller deletes it if it
	 * does not want it). When the storage write fails, core deletes the inserted basket before throwing, so a failed call
	 * leaves no basket behind, and it does not count towards the one-basket limit: the request may create or load
	 * another basket.
	 *
	 * @param context the country, language, currency hint and client of the new basket; not null
	 * @param changes the initial rows, voucher codes, customer and storage entries; not null; its country, language and currency
	 *        hint are ignored in favour of the context's
	 * @return the new basket, with the rejections of the changes
	 * @throws PluginResourceException if the basket cannot be created or saved, or its storage cannot be written
	 */
	BasketView create(BasketContext context, BasketChanges changes) throws PluginResourceException;

	/**
	 * Reads a basket as it was last saved. It never recalculates, never calls basket or tax plugins and never saves: the
	 * totals and warnings are the ones stored with the basket, plus the order-time checks evaluated as a dry run.
	 *
	 * @param token the basket token; not null
	 * @param client the buyer's client, used for the context; may be null
	 * @return the basket, or null when there is no such basket or it belongs to another commerce
	 * @throws PluginResourceException if the basket cannot be read
	 */
	BasketView get(String token, ClientInfo client) throws PluginResourceException;

	/**
	 * Applies changes to a basket in one call. Everything valid is applied, then the basket is recalculated once and
	 * saved; each requested item that cannot be applied comes back as a rejection (a row that cannot be added, a
	 * personalised product without its value, a rejected currency hint or country, a registered email) or, for voucher
	 * codes, as a {@link com.logicommerce.sdk.models.basket.VoucherCodeResult}. The changes are applied in this order:
	 * country and language, rows, customer, voucher codes, the currency rule. {@link BasketChanges#getStorage()} is ignored.
	 *
	 * @param token the basket token; not null
	 * @param changes the changes; not null; its null fields leave the basket unchanged
	 * @param client the buyer's client, used for the context; may be null
	 * @return the recalculated basket, or null when there is no such basket or it belongs to another commerce
	 * @throws PluginResourceException if the basket cannot be read, recalculated or saved
	 */
	BasketView apply(String token, BasketChanges changes, ClientInfo client) throws PluginResourceException;

	/**
	 * Deletes a basket, as the session reaper would.
	 *
	 * @param token the basket token; not null
	 * @return true when a basket was deleted, false when there is no such basket or it belongs to another commerce
	 * @throws PluginResourceException if the basket cannot be deleted
	 */
	boolean delete(String token) throws PluginResourceException;

	/**
	 * Writes entries in the calling plugin's per-basket {@link Storage} of a basket (the store a plugin reads with
	 * {@code @Resource Storage} in a request of that basket), without loading or saving the basket. The entries are set
	 * one by one ({@code $set}): other entries are kept, and the storage is created when the basket has none. The
	 * storage is always the calling plugin's.
	 *
	 * @param token the basket token; not null
	 * @param entries the entries to set; not null; keys must be non-empty, must not contain {@code '.'} nor the NUL
	 *        character and must not start with {@code '$'}, and values must not be null (else
	 *        {@link IllegalArgumentException})
	 * @return true when the entries were written, false when the token is not a basket of the commerce (nothing is
	 *         written)
	 * @throws PluginResourceException if the storage cannot be written
	 */
	boolean putStorage(String token, Map<String, String> entries) throws PluginResourceException;

	/**
	 * Removes entries from the calling plugin's per-basket {@link Storage} of a basket, without loading or saving the
	 * basket. The keys are removed one by one ({@code $unset}): other entries are kept, and keys that do not exist are
	 * ignored.
	 *
	 * @param token the basket token; not null
	 * @param keys the keys to remove; not null
	 * @return true when the token is a basket of the commerce (whether or not the keys existed), false otherwise (nothing
	 *         is written)
	 * @throws PluginResourceException if the storage cannot be written
	 */
	boolean removeStorage(String token, Set<String> keys) throws PluginResourceException;

}
