package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.models.basket.Allocation;

/**
 * <p>The amounts of one order row in the order's purchase currency ({@link OrderPurchaseCurrencyAmounts#getItems()}).</p>
 *
 * <p>Amounts are minor units, gross or net per {@link Order#isTaxesIncluded()}. Unlike {@link OrderItemPrices},
 * subtotal and total are the row amount before and after its discounts, not without and with taxes.</p>
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
	 * Returns the unit price.
	 *
	 * @return the unit price
	 */
	long getUnitPrice();

	/**
	 * Returns the unit price times the row quantity.
	 *
	 * @return the subtotal, before discounts
	 */
	long getSubtotal();

	/**
	 * Returns the row's share of each discount applied to it.
	 *
	 * @return the allocations, never null
	 */
	List<Allocation> getDiscounts();

	/**
	 * Returns the subtotal minus the row's discount allocations.
	 *
	 * @return the total, after discounts
	 */
	long getTotal();

}
