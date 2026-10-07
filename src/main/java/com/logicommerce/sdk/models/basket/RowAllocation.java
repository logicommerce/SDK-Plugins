package com.logicommerce.sdk.models.basket;

/**
 * <p>One row's share of one discount, seen from the discount ({@link AppliedDiscountView#getRows()}): the same amount
 * as the {@link Allocation} of that discount on that row.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface RowAllocation {

	/**
	 * Returns the hash of the row the share is allocated to.
	 *
	 * @return the row hash, as in {@link BasketRowView#getHash()} or
	 *         {@link com.logicommerce.sdk.models.order.OrderItemAmounts#getHash()}
	 */
	String getRowHash();

	/**
	 * Returns the discounted amount.
	 *
	 * @return a non-negative amount in minor units, rounded once
	 */
	long getAmount();

}
