package com.logicommerce.sdk.models.basket;

/**
 * <p>One row's share of one discount, seen from the row ({@link BasketRowView#getDiscounts()},
 * {@link com.logicommerce.sdk.models.order.OrderItemAmounts#getDiscounts()}), or one shipment's share of a shipping
 * discount ({@link com.logicommerce.sdk.models.order.OrderShipmentAmounts#getShippingDiscounts()}).</p>
 *
 * <p>The amount is rounded once to minor units of the enclosing view's currency and is the unit every discount total is
 * summed from, so the allocations of a discount add up to {@link AppliedDiscountView#getAmount()} exactly.</p>
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
