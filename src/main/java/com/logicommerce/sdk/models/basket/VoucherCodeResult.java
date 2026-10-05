package com.logicommerce.sdk.models.basket;

import com.logicommerce.sdk.enums.VoucherCodeStatus;

/**
 * <p>The result of a voucher code (a discount code or a balance voucher code) on a basket ({@link BasketView#getVoucherCodes()}).</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface VoucherCodeResult {

	/**
	 * Returns the code, as requested (or as stored on the basket when no code was requested by the call). Codes are
	 * matched against the basket case-insensitively.
	 *
	 * @return the code
	 */
	String getCode();

	/**
	 * Returns the outcome.
	 *
	 * @return the status
	 */
	VoucherCodeStatus getStatus();

	/**
	 * Returns why core refused the code: the name of core's client error code (for instance
	 * {@code VOUCHER_CODE_NOT_FOUND}, {@code VOUCHER_CODE_EXPIRED}, {@code VOUCHER_CODE_EXHAUSTED},
	 * {@code DISCOUNT_CODE_EXISTS}, {@code VOUCHER_CAN_NOT_BE_APPLIED}).
	 *
	 * @return the error code, or null unless the status is {@link VoucherCodeStatus#REJECTED}
	 */
	String getErrorCode();

}
