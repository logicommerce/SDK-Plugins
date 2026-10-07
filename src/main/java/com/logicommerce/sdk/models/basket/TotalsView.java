package com.logicommerce.sdk.models.basket;

import java.util.List;

/**
 * <p>The totals of a basket ({@link BasketView#getTotals()}) or of an order
 * ({@link com.logicommerce.sdk.models.order.OrderPurchaseCurrencyAmounts#getTotals()}). For an order, the view is its
 * purchase currency amounts, in the tax mode of {@link com.logicommerce.sdk.models.order.Order#isTaxesIncluded()}.</p>
 *
 * <p>Every amount is a non-negative magnitude in minor units of the enclosing view's currency, and every total is the
 * sum of rounded parts, so by construction:</p>
 *
 * <pre>
 * subtotal      = sum of the rows' subtotals
 * rowsDiscount  = sum of the rows' discount allocations
 * total         = subtotal - rowsDiscount + delivery - discount + paymentSystem + tax - vouchers
 * </pre>
 *
 * <p>Unlike the usual LogiCommerce meaning of subtotal and total (without and with taxes, as in
 * {@link com.logicommerce.sdk.models.CartTotals}), {@link #getSubtotal()} is the rows' amount before discounts, in the
 * view's tax mode (gross when the view's prices include taxes), and {@link #getTotal()} is the amount due after every
 * discount.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface TotalsView {

	/**
	 * Returns the sum of the rows' subtotals: the rows' amount before discounts. It is not the amount without taxes: it
	 * follows the view's tax mode.
	 *
	 * @return the subtotal, before discounts
	 */
	long getSubtotal();

	/**
	 * Returns the sum of the row discounts (the rows' discount allocations).
	 *
	 * @return the rows discount
	 */
	long getRowsDiscount();

	/**
	 * Returns the shipping price before its discounts. On a basket it is only known when core has already selected a
	 * shipping (a single eligible option, or the commerce's default selection); it is an estimate until the buyer enters
	 * the address in the storefront. On an order it is the shipments' shipping prices plus the pickup price.
	 *
	 * @return the shipping price, 0 when no shipping is selected (or the selected one is free: see
	 *         {@link #isDeliverySelected()})
	 */
	long getDelivery();

	/**
	 * Returns whether a shipping is selected, which tells a free selected shipping from no shipping at all when
	 * {@link #getDelivery()} is 0. On a basket it is true when core has already selected a shipping; on an order,
	 * when the order has at least one shipment with a shipping type, or is a pickup order.
	 *
	 * @return true when {@link #getDelivery()} is the price of a selected shipping
	 */
	boolean isDeliverySelected();

	/**
	 * Returns the basket-level and shipping discounts.
	 *
	 * @return the discount
	 */
	long getDiscount();

	/**
	 * Returns the payment system surcharge (on a basket, present when core selected the only eligible payment system).
	 *
	 * @return the payment system surcharge, 0 when none
	 */
	long getPaymentSystem();

	/**
	 * Returns the sum of the taxes added to net prices.
	 *
	 * @return the tax, always 0 when prices include taxes
	 */
	long getTax();

	/**
	 * Returns the amount paid with balance (gift) vouchers, deducted after the total like a payment.
	 *
	 * @return the balance voucher amount, 0 when none
	 */
	long getVouchers();

	/**
	 * Returns the amount due, after every discount (see the formula of {@link TotalsView}).
	 *
	 * @return the total, after discounts
	 */
	long getTotal();

	/**
	 * Returns the taxes, one entry per tax and rate. With net prices their amounts sum to {@link #getTax()}; with prices
	 * that include taxes they are the taxes included in the total (their amounts are then not added to it).
	 *
	 * @return the applied taxes, empty when no tax applies
	 */
	List<AppliedTaxView> getAppliedTaxes();

}
