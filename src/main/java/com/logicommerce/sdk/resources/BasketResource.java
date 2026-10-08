package com.logicommerce.sdk.resources;

import java.util.Map;
import java.util.Set;
import com.logicommerce.sdk.models.basket.BasketChanges;
import com.logicommerce.sdk.models.basket.BasketContext;
import com.logicommerce.sdk.models.basket.BasketView;
import com.logicommerce.sdk.models.basket.ClientInfo;

/**
 * <p>Basket resource interface: creates, reads, changes and deletes guest baskets of the commerce by their token, from
 * any plugin request.</p>
 *
 * <p>Every method works in a context built from the basket (country, language, currency and customer) and the given
 * {@link ClientInfo}, never from the caller's request headers. Tokens of another commerce's baskets behave as unknown
 * tokens.</p>
 *
 * <p>A plugin request serves at most one basket: once {@link #create create}, {@link #get get}, {@link #apply apply}
 * or {@link #delete delete} has loaded or created a basket, calling any of them for another token in the same request
 * throws an {@link IllegalStateException}. A call that found no basket, or a failed {@link #create create}, keeps none.
 * {@link #putStorage putStorage}, {@link #removeStorage removeStorage} and {@link CatalogResource} calls are not
 * limited.</p>
 *
 * <p>Business refusals (a row that cannot be added, a rejected voucher code or currency) are returned as data in the
 * {@link BasketView}; {@link PluginResourceException} is only thrown for infrastructure failures. Invalid arguments
 * throw an {@link IllegalArgumentException} before anything is changed.</p>
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
	 * Creates a guest basket in the given context, applies the changes as {@link #apply apply} does and writes
	 * {@link BasketChanges#getStorage()} as {@link #putStorage putStorage} does. The basket is created even when no row
	 * could be added. A failed call leaves no basket behind.
	 *
	 * @param context the country, language, currency hint and client of the new basket; not null
	 * @param changes the initial rows, voucher codes, customer and storage entries; not null; its country, language and
	 *        currency hint are ignored in favour of the context's
	 * @return the new basket, with the rejections of the changes
	 * @throws PluginResourceException if the basket cannot be created or saved, or its storage cannot be written
	 */
	BasketView create(BasketContext context, BasketChanges changes) throws PluginResourceException;

	/**
	 * Reads a basket as it was last saved, without recalculating or saving it.
	 *
	 * @param token the basket token; not null
	 * @param client the buyer's client, used for the context; may be null
	 * @return the basket, or null when there is no such basket or it belongs to another commerce
	 * @throws PluginResourceException if the basket cannot be read
	 */
	BasketView get(String token, ClientInfo client) throws PluginResourceException;

	/**
	 * Applies changes to a basket, then recalculates and saves it. Each change that cannot be applied comes back as a
	 * rejection or, for voucher codes, as a {@link com.logicommerce.sdk.models.basket.VoucherCodeResult}.
	 * {@link BasketChanges#getStorage()} is ignored.
	 *
	 * @param token the basket token; not null
	 * @param changes the changes; not null; its null fields leave the basket unchanged
	 * @param client the buyer's client, used for the context; may be null
	 * @return the recalculated basket, or null when there is no such basket or it belongs to another commerce
	 * @throws PluginResourceException if the basket cannot be read, recalculated or saved
	 */
	BasketView apply(String token, BasketChanges changes, ClientInfo client) throws PluginResourceException;

	/**
	 * Deletes a basket.
	 *
	 * @param token the basket token; not null
	 * @return true when a basket was deleted, false when there is no such basket or it belongs to another commerce
	 * @throws PluginResourceException if the basket cannot be deleted
	 */
	boolean delete(String token) throws PluginResourceException;

	/**
	 * Writes entries in the calling plugin's {@link Storage} of a basket, without loading or saving the basket. Other
	 * entries are kept.
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
	 * Removes entries from the calling plugin's {@link Storage} of a basket, without loading or saving the basket.
	 * Missing keys are ignored.
	 *
	 * @param token the basket token; not null
	 * @param keys the keys to remove; not null
	 * @return true when the token is a basket of the commerce (whether or not the keys existed), false otherwise (nothing
	 *         is written)
	 * @throws PluginResourceException if the storage cannot be written
	 */
	boolean removeStorage(String token, Set<String> keys) throws PluginResourceException;

}
