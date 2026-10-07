package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.models.basket.Allocation;

/**
 * <p>The amounts of one order row in the order's purchase currency ({@link OrderPurchaseCurrencyAmounts#getItems()}).</p>
 *
 * <p>Amounts are minor units of {@link OrderPurchaseCurrencyAmounts#getCurrencyCode()}, gross or net per
 * {@link Order#isTaxesIncluded()}. Discount amounts are non-negative magnitudes, so
 * {@code getTotal() == getSubtotal() - sum(getDiscounts().amount)}.</p>
 *
 * <p>Unlike the usual LogiCommerce meaning of subtotal and total (without and with taxes, as in
 * {@link OrderItemPrices}), {@link #getSubtotal()} and {@link #getTotal()} are the row amount before and after its
 * discounts, both in the order's tax mode.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderItemAmounts {

	/**
	 * Returns the hash of the row these amounts belong to.
	 *
	 * @return the row hash, as in {@link OrderItem#getHash()}
	 */
	String getHash();

	/**
	 * Returns the unit price, rounded once to minor units.
	 *
	 * @return the unit price
	 */
	long getUnitPrice();

	/**
	 * Returns the unit price times the row quantity, before discounts. It is not the amount without taxes: it follows
	 * {@link Order#isTaxesIncluded()}.
	 *
	 * @return the subtotal, before discounts
	 */
	long getSubtotal();

	/**
	 * Returns the row's share of each discount applied to it, one entry per discount, each rounded once.
	 *
	 * @return the allocations, never null
	 */
	List<Allocation> getDiscounts();

	/**
	 * Returns the subtotal minus the row's discount allocations: the row amount after discounts. It is not the amount
	 * with taxes: it follows {@link Order#isTaxesIncluded()}.
	 *
	 * @return the total, after discounts
	 */
	long getTotal();

}
