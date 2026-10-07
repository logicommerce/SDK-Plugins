package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.models.basket.AppliedDiscountView;
import com.logicommerce.sdk.models.basket.TotalsView;

/**
 * <p>The amounts of an order in its purchase currency ({@link Order#getPurchaseCurrencyAmounts()}), filled only by
 * {@link com.logicommerce.sdk.resources.OrderResource}.</p>
 *
 * <p>The amounts of {@link Order} are unrounded headquarter currency values. These are the same amounts as integer
 * minor units of the purchase currency ({@link #getCurrencyCode()}), converted by the platform with the currency values
 * stored on the order and rounded as for baskets: each unit price and each discount allocation once, and every total as
 * the sum of its rounded parts (see {@link TotalsView}). They are gross or net per {@link Order#isTaxesIncluded()}, and
 * the total is the amount the platform charged. Lists are never null.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderPurchaseCurrencyAmounts {

	/**
	 * Returns the purchase currency of the order, the currency of every amount here.
	 *
	 * @return the ISO 4217 code, upper case
	 */
	String getCurrencyCode();

	/**
	 * Returns the amounts of the order rows, one entry per row of {@link Document#getItems()}, matched by
	 * {@link OrderItemAmounts#getHash()}. The items of a bundle ({@link OrderItem#getBundleItems()}) have no entry of
	 * their own: the bundle row's entry covers them.
	 *
	 * @return the row amounts
	 */
	List<OrderItemAmounts> getItems();

	/**
	 * Returns the discounts applied to the order, one entry per discount. A row allocation
	 * ({@link com.logicommerce.sdk.models.basket.RowAllocation#getRowHash()}) refers to {@link OrderItemAmounts#getHash()}.
	 *
	 * @return the applied discounts
	 */
	List<AppliedDiscountView> getDiscounts();

	/**
	 * Returns the order totals. The delivery total is the shipments' shipping prices plus the pickup price, and a pickup
	 * order ({@link com.logicommerce.sdk.enums.DeliveryType#PICKING}) counts as a selected delivery
	 * ({@link TotalsView#isDeliverySelected()}).
	 *
	 * @return the totals, never null
	 */
	TotalsView getTotals();

	/**
	 * Returns the shipping amounts of the order's shipments, one entry per shipment of
	 * {@link OrderDelivery#getShipments()}, matched by {@link OrderShipmentAmounts#getShipmentId()} and sorted by it.
	 *
	 * @return the shipment amounts
	 */
	List<OrderShipmentAmounts> getShipments();

	/**
	 * Returns the amounts of the order's credit notes, one entry per credit note of {@link Order#getCreditNotes()},
	 * matched by {@link OrderCreditNoteAmounts#getCreditNoteId()} and sorted by it.
	 *
	 * @return the credit note amounts
	 */
	List<OrderCreditNoteAmounts> getCreditNotes();

}
