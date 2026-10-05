package com.logicommerce.sdk.models.basket;

import java.util.List;
import java.util.Map;

/**
 * <p>The changes to apply to a basket in one call ({@link com.logicommerce.sdk.resources.BasketResource#create create}
 * and {@link com.logicommerce.sdk.resources.BasketResource#apply apply}). Every null field leaves that part of the
 * basket unchanged. Build it with {@link com.logicommerce.sdk.builders.basket.BasketChangesBuilder}.</p>
 *
 * <p>The changes are applied in this order: country and language, rows, customer, voucher codes, then the currency rule; the
 * basket is recalculated once and saved.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketChanges {

	/**
	 * Returns the requested rows. When not null they replace the basket's rows: rows not requested are removed
	 * (removing a row also removes its linked rows), except the rows the business owns (automatic gifts), which the
	 * recalculation derives again.
	 *
	 * @return the rows, or null to leave the rows unchanged
	 */
	List<RowChange> getRows();

	/**
	 * Returns the requested voucher codes (discount codes and balance voucher codes). When not null they replace the
	 * basket's voucher codes, compared case-insensitively: missing codes are removed and new ones added. Balance (gift)
	 * voucher codes are not redeemed ({@link com.logicommerce.sdk.enums.VoucherCodeStatus#BALANCE_VOUCHER}).
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
	 * Returns the new navigation country, applied as {@link BasketContext#getCountryCode()} is on creation. Ignored by
	 * {@link com.logicommerce.sdk.resources.BasketResource#create create}, which takes it from the context.
	 *
	 * @return the ISO 3166-1 alpha-2 code, or null to leave it unchanged
	 */
	String getCountryCode();

	/**
	 * Returns the new language. Ignored by {@link com.logicommerce.sdk.resources.BasketResource#create create}, which
	 * takes it from the context.
	 *
	 * @return the language code (ISO 639-1, lower case, as {@link BasketContext#getLanguageCode()}), or null to leave it
	 *         unchanged
	 */
	String getLanguageCode();

	/**
	 * Returns the preferred currency, applied with the rule of {@link BasketContext#getCurrencyHint()}. Ignored by
	 * {@link com.logicommerce.sdk.resources.BasketResource#create create}, which takes it from the context.
	 *
	 * @return the ISO 4217 code, or null for no preference (the currency is still re-evaluated when the country changes)
	 */
	String getCurrencyHint();

	/**
	 * Returns entries to write in the calling plugin's per-basket {@link com.logicommerce.sdk.resources.Storage} of the
	 * new basket, as {@link com.logicommerce.sdk.resources.BasketResource#putStorage putStorage} does. Only used by
	 * {@link com.logicommerce.sdk.resources.BasketResource#create create}; ignored by
	 * {@link com.logicommerce.sdk.resources.BasketResource#apply apply}.
	 *
	 * @return the entries, or null for none
	 */
	Map<String, String> getStorage();

}
