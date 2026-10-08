package com.logicommerce.sdk.models.basket;

import java.util.List;
import java.util.Map;

/**
 * <p>The changes to apply to a basket in one call. A null field leaves that part of the basket unchanged. Build it
 * with {@link com.logicommerce.sdk.builders.basket.BasketChangesBuilder}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketChanges {

	/**
	 * Returns the requested rows. When not null they replace the basket's rows: rows not requested are removed, with
	 * their linked rows, except automatic gifts.
	 *
	 * @return the rows, or null to leave the rows unchanged
	 */
	List<RowChange> getRows();

	/**
	 * Returns the requested voucher codes. When not null they replace the basket's voucher codes, compared
	 * case-insensitively. Balance voucher codes are not redeemed
	 * ({@link com.logicommerce.sdk.enums.VoucherCodeStatus#BALANCE_VOUCHER}).
	 *
	 * @return the voucher codes, or null to leave the voucher codes unchanged
	 */
	List<String> getVoucherCodes();

	/**
	 * Returns the customer data to set.
	 *
	 * @return the customer change, or null to leave the customer unchanged
	 */
	CustomerChange getCustomer();

	/**
	 * Returns the new navigation country. Ignored by {@link com.logicommerce.sdk.resources.BasketResource#create create},
	 * which takes it from the context.
	 *
	 * @return the ISO 3166-1 alpha-2 code, or null to leave it unchanged
	 */
	String getCountryCode();

	/**
	 * Returns the new language. Ignored by {@link com.logicommerce.sdk.resources.BasketResource#create create}, which
	 * takes it from the context.
	 *
	 * @return the ISO 639-1 code in lower case, or null to leave it unchanged
	 */
	String getLanguageCode();

	/**
	 * Returns the preferred currency (see {@link BasketContext#getCurrencyHint()}). Ignored by
	 * {@link com.logicommerce.sdk.resources.BasketResource#create create}, which takes it from the context.
	 *
	 * @return the ISO 4217 code, or null for no preference
	 */
	String getCurrencyHint();

	/**
	 * Returns entries to write in the calling plugin's per-basket {@link com.logicommerce.sdk.resources.Storage} of the
	 * new basket. Only used by {@link com.logicommerce.sdk.resources.BasketResource#create create}.
	 *
	 * @return the entries, or null for none
	 */
	Map<String, String> getStorage();

}
