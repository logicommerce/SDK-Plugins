package com.logicommerce.sdk.enums;

/**
 * <p>Why a requested basket change was not applied.</p>
 *
 * <p>Returned by {@link com.logicommerce.sdk.models.basket.ChangeRejection#getCode()}. Rejected voucher codes are
 * reported as {@link com.logicommerce.sdk.models.basket.VoucherCodeResult}, not with these codes.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public enum RejectionCode {
	/**
	 * The requested row does not identify an orderable combination (unknown product, invalid option values, or
	 * {@link StockStatus#NOT_ORDERABLE}). The row is not added, and an existing row it names is removed.
	 */
	ROW_NOT_BUYABLE,
	/**
	 * The product has a required non-combinable option, which can only be given in the storefront. The row is not
	 * added.
	 */
	ROW_REQUIRES_NON_COMBINABLE_OPTION,
	/**
	 * The row could not be added or updated for another reason, named by
	 * {@link com.logicommerce.sdk.models.basket.ChangeRejection#getDetail()}.
	 */
	ROW_ADD_FAILED,
	/**
	 * The currency hint is not available for the basket's country; the basket keeps its default currency.
	 */
	CURRENCY_NOT_AVAILABLE,
	/**
	 * The country is not a country of the commerce; the basket uses the commerce's default country.
	 */
	COUNTRY_NOT_COMMERCE,
	/**
	 * The email belongs to a registered account. Only the email is refused (the basket's previous email is cleared); the
	 * other fields of the {@link com.logicommerce.sdk.models.basket.CustomerChange} are applied.
	 */
	CUSTOMER_EMAIL_REGISTERED;
}
