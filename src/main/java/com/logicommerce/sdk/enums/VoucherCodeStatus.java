package com.logicommerce.sdk.enums;

/**
 * <p>Status of a voucher code (a discount code or a balance voucher code) on a basket.</p>
 *
 * <p>Returned by {@link com.logicommerce.sdk.models.basket.VoucherCodeResult#getStatus()}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public enum VoucherCodeStatus {
	/**
	 * The code is on the basket and its discount applies.
	 */
	APPLIED,
	/**
	 * The code was refused and is not on the basket; the reason is in
	 * {@link com.logicommerce.sdk.models.basket.VoucherCodeResult#getErrorCode()}.
	 */
	REJECTED,
	/**
	 * The code is on the basket but its discount does not apply at the moment (a condition stopped being met).
	 */
	NOT_APPLYING,
	/**
	 * The code is a usable balance (gift) voucher. A requested one is not redeemed by the resource; one already on the
	 * basket was redeemed in the storefront and is counted in
	 * {@link com.logicommerce.sdk.models.basket.TotalsView#getVouchers()}.
	 */
	BALANCE_VOUCHER;
}
