package com.logicommerce.sdk.models.basket;

import java.util.List;

/**
 * <p>The totals of a basket ({@link BasketView#getTotals()}) or of an order
 * ({@link com.logicommerce.sdk.models.order.OrderPurchaseCurrencyAmounts#getTotals()}, in the tax mode of
 * {@link com.logicommerce.sdk.models.order.Order#isTaxesIncluded()}).</p>
 *
 * <p>Every amount is a non-negative magnitude in minor units of the enclosing view's currency, and every total is the
 * sum of rounded parts, so:</p>
 *
 * <pre>
 * subtotal      = sum of the rows' subtotals
 * rowsDiscount  = sum of the rows' discount allocations
 * total         = subtotal - rowsDiscount + delivery - discount + paymentSystem + tax - vouchers
 * </pre>
 *
 * <p>Unlike {@link com.logicommerce.sdk.models.CartTotals}, {@link #getSubtotal()} and {@link #getTotal()} are the
 * amounts before and after discounts, not without and with taxes.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface TotalsView {

	/**
	 * Returns the sum of the rows' subtotals, in the view's tax mode.
	 *
	 * @return the subtotal, before discounts
	 */
	long getSubtotal();

	/**
	 * Returns the sum of the rows' discount allocations.
	 *
	 * @return the rows discount
	 */
	long getRowsDiscount();

	/**
	 * Returns the shipping price before its discounts. On a basket it is only known once a shipping is selected (a
	 * single eligible option, or the default selection), and is an estimate until the buyer enters an address.
	 *
	 * @return the shipping price, 0 when no shipping is selected or it is free (see {@link #isDeliverySelected()})
	 */
	long getDelivery();

	/**
	 * Returns whether a shipping is selected, to tell a free shipping from no shipping when {@link #getDelivery()} is 0.
	 *
	 * @return true when a shipping is selected
	 */
	boolean isDeliverySelected();

	/**
	 * Returns the basket-level and shipping discounts.
	 *
	 * @return the discount
	 */
	long getDiscount();

	/**
	 * Returns the payment system surcharge (on a basket, only when a single payment system is eligible).
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
	 * Returns the amount due, after every discount.
	 *
	 * @return the total, after discounts
	 */
	long getTotal();

	/**
	 * Returns the taxes, one entry per tax and rate. With net prices their amounts sum to {@link #getTax()}; with
	 * prices that include taxes they are the taxes included in the total.
	 *
	 * @return the applied taxes, empty when no tax applies
	 */
	List<AppliedTaxView> getAppliedTaxes();

}
