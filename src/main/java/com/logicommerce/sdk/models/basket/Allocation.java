package com.logicommerce.sdk.models.basket;

/**
 * <p>One row's share of one discount, or one shipment's share of a shipping discount. The amount is in minor units of
 * the enclosing view's currency, and the allocations of a discount add up to
 * {@link AppliedDiscountView#getAmount()}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface Allocation {

	/**
	 * Returns the id of the discount.
	 *
	 * @return the discount id, as in {@link AppliedDiscountView#getDiscountId()}
	 */
	int getDiscountId();

	/**
	 * Returns the discounted amount.
	 *
	 * @return a non-negative amount in minor units
	 */
	long getAmount();

}
