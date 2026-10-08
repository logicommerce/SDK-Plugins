package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.models.basket.AppliedDiscountView;
import com.logicommerce.sdk.models.basket.TotalsView;

/**
 * <p>The amounts of an order in its purchase currency ({@link Order#getPurchaseCurrencyAmounts()}), filled only by
 * {@link com.logicommerce.sdk.resources.OrderResource}.</p>
 *
 * <p>Amounts are integer minor units of {@link #getCurrencyCode()}, rounded as for baskets (see {@link TotalsView}),
 * gross or net per {@link Order#isTaxesIncluded()}. Lists are never null.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderPurchaseCurrencyAmounts {

	/**
	 * Returns the purchase currency of the order.
	 *
	 * @return the ISO 4217 code, upper case
	 */
	String getCurrencyCode();

	/**
	 * Returns the amounts of the order rows, one entry per row of {@link Document#getItems()} (bundle items have no
	 * entry of their own).
	 *
	 * @return the row amounts
	 */
	List<OrderItemAmounts> getItems();

	/**
	 * Returns the discounts applied to the order, one entry per discount.
	 *
	 * @return the applied discounts
	 */
	List<AppliedDiscountView> getDiscounts();

	/**
	 * Returns the order totals.
	 *
	 * @return the totals, never null
	 */
	TotalsView getTotals();

	/**
	 * Returns the shipping amounts of the order's shipments, sorted by shipment id.
	 *
	 * @return the shipment amounts
	 */
	List<OrderShipmentAmounts> getShipments();

	/**
	 * Returns the amounts of the order's credit notes, sorted by credit note id.
	 *
	 * @return the credit note amounts
	 */
	List<OrderCreditNoteAmounts> getCreditNotes();

}
