package com.logicommerce.sdk.models.basket;

import java.util.List;
import com.logicommerce.sdk.enums.DiscountApplyTo;

/**
 * <p>A discount applied to a basket or an order.</p>
 *
 * <p>Amounts are non-negative magnitudes in minor units of the enclosing view's currency. They follow the view's tax
 * mode, except basket-level ({@link DiscountApplyTo#TOTAL}) discounts of a net-priced view when the commerce subtracts
 * them after taxes (core's {@code TAX.discountsBeforeTax=false}, the default): those are gross, and they do not reduce
 * the tax.</p>
 *
 * <p>Every discount that any {@link Allocation} of the view refers to (by {@link Allocation#getDiscountId()}) is listed
 * in the view's discounts, the automatic discount that makes a gift row free included (as a
 * {@link DiscountApplyTo#PRODUCT} discount allocated to that row).</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface AppliedDiscountView {

	/**
	 * Returns the discount id.
	 *
	 * @return the discount id
	 */
	int getDiscountId();

	/**
	 * Returns the discount name in the view's language.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Returns the code that activated the discount, when the discount has a voucher condition and that code is on the
	 * basket.
	 *
	 * @return the code, or null for an automatic discount
	 */
	String getCode();

	/**
	 * Returns what the discount reduces: {@link DiscountApplyTo#PRODUCT} for a discount that reduces rows (its
	 * allocations to each row are listed in {@link #getRows()}), {@link DiscountApplyTo#SHIPPING} for one that reduces
	 * the shipping price, and {@link DiscountApplyTo#TOTAL} for one that reduces the basket as a whole (basket-level,
	 * after the rows).
	 *
	 * @return what the discount applies to
	 */
	DiscountApplyTo getApplyTo();

	/**
	 * Returns the discounted amount: for {@link DiscountApplyTo#PRODUCT} the sum of {@link #getRows()}; for
	 * {@link DiscountApplyTo#SHIPPING} on an order, the sum of its allocations to the shipments
	 * ({@link com.logicommerce.sdk.models.order.OrderShipmentView#getShippingDiscounts()}); otherwise the discount's own
	 * amount, rounded once.
	 *
	 * @return a non-negative amount in minor units
	 */
	long getAmount();

	/**
	 * Returns the allocation of a {@link DiscountApplyTo#PRODUCT} discount to each row it applies to; their amounts sum to
	 * {@link #getAmount()}.
	 *
	 * @return the allocations, empty for any other {@link #getApplyTo()}
	 */
	List<RowAllocation> getRows();

}
