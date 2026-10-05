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
	 * The requested row does not identify an orderable combination: unknown or not visible product, a product with
	 * combinable options requested without them, option values that are not a combination of the product, or a
	 * combination that cannot be ordered in the basket's context ({@link StockStatus#NOT_ORDERABLE}). It is checked
	 * before {@link #ROW_REQUIRES_NON_COMBINABLE_OPTION}. The row is not added, and an existing row it names is removed
	 * like a row that was not requested.
	 */
	ROW_NOT_BUYABLE,
	/**
	 * The product has a required option that is not combinable (text, date, boolean, attachment, multiple
	 * selection...): it is not added, because its value can only be given in the storefront.
	 */
	ROW_REQUIRES_NON_COMBINABLE_OPTION,
	/**
	 * Core refused to add or update the row for another reason; {@link
	 * com.logicommerce.sdk.models.basket.ChangeRejection#getDetail()} names the core error code.
	 */
	ROW_ADD_FAILED,
	/**
	 * The currency hint is not available for the basket's country and headquarter; the basket keeps the currency the
	 * rule chose.
	 */
	CURRENCY_NOT_AVAILABLE,
	/**
	 * The country is not a country of the commerce; the basket uses the commerce's default country.
	 */
	COUNTRY_NOT_COMMERCE,
	/**
	 * The email belongs to a registered account of a commerce that identifies users by email. Only the email is refused:
	 * it is not set and the basket's previous email is cleared, because the request replaced it; the names and phone of
	 * the same {@link com.logicommerce.sdk.models.basket.CustomerChange} are applied.
	 */
	CUSTOMER_EMAIL_REGISTERED;
}
