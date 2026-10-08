package com.logicommerce.sdk.models.basket;

import java.util.List;
import com.logicommerce.sdk.enums.DiscountApplyTo;

/**
 * <p>A discount applied to a basket or to an order.</p>
 *
 * <p>Amounts are non-negative, in minor units of the enclosing view's currency, and follow the view's tax mode, except
 * {@link DiscountApplyTo#TOTAL} discounts of a net-priced view when the commerce applies them after taxes: those are
 * gross and do not reduce the tax.</p>
 *
 * <p>Every discount referenced by an {@link Allocation} of the view is listed, including the automatic discount that
 * makes a gift row free.</p>
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
	 * Returns the voucher code that activated the discount.
	 *
	 * @return the code, or null for an automatic discount
	 */
	String getCode();

	/**
	 * Returns what the discount reduces: the rows ({@link DiscountApplyTo#PRODUCT}), the shipping price
	 * ({@link DiscountApplyTo#SHIPPING}) or the basket as a whole ({@link DiscountApplyTo#TOTAL}).
	 *
	 * @return what the discount applies to
	 */
	DiscountApplyTo getApplyTo();

	/**
	 * Returns the discounted amount. For {@link DiscountApplyTo#PRODUCT} it is the sum of {@link #getRows()}.
	 *
	 * @return a non-negative amount in minor units
	 */
	long getAmount();

	/**
	 * Returns the allocation of a {@link DiscountApplyTo#PRODUCT} discount to each row it applies to.
	 *
	 * @return the allocations, empty for any other {@link #getApplyTo()}
	 */
	List<RowAllocation> getRows();

}
