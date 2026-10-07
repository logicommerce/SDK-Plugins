package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.OrderStatusType;

/**
 * <p>Order interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Order extends Document {

	/**
	 * Returns the status.
	 *
	 * @return a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 */
	OrderStatusType getStatus();

	/**
	 * Returns the substatus id.
	 *
	 * @return a int
	 */
	int getSubstatusId();

	/**
	 * Returns the total converted.
	 * 
	 * @return an {@link com.logicommerce.sdk.models.order.OrderTotalCurrency} object
	 */
	OrderTotalCurrency getTotalCurrency();

	/**
	 * Returns whether the order's prices are shown with taxes included (the commerce's {@code showTaxesIncluded},
	 * overridable per country and account group, for the order's country and account group), as
	 * {@link com.logicommerce.sdk.models.basket.BasketView#isTaxesIncluded()} for baskets. The amounts of
	 * {@link #getPurchaseCurrencyAmounts()} follow it: when true they are gross,
	 * {@link com.logicommerce.sdk.models.basket.TotalsView#getTax()} is 0 and
	 * {@link com.logicommerce.sdk.models.basket.TotalsView#getAppliedTaxes()} lists the included taxes; when false they
	 * are net and the taxes are added in {@link com.logicommerce.sdk.models.basket.TotalsView#getTax()}.
	 *
	 * <p>Filled only by {@link com.logicommerce.sdk.resources.OrderResource#getOrder(int)} and
	 * {@link com.logicommerce.sdk.resources.OrderResource#getOrder(String)}: null in the orders hooks receive and in the
	 * orders a plugin builds.</p>
	 *
	 * @return true when prices include taxes, or null when not available
	 * @since 2.8.5
	 */
	default Boolean isTaxesIncluded() {
		return null;
	}

	/**
	 * Returns the order's amounts in its purchase currency, as integer minor units computed by the platform from the
	 * headquarter currency amounts of this order, with the currency values stored on the order.
	 *
	 * <p>Filled only by {@link com.logicommerce.sdk.resources.OrderResource#getOrder(int)} and
	 * {@link com.logicommerce.sdk.resources.OrderResource#getOrder(String)}: null in the orders hooks receive and in the
	 * orders a plugin builds.</p>
	 *
	 * @return the purchase currency amounts, or null when not available
	 * @since 2.8.5
	 */
	default OrderPurchaseCurrencyAmounts getPurchaseCurrencyAmounts() {
		return null;
	}

	/**
	 * Returns the return merchandise authorizations (RMAs) of the order, sorted by id.
	 *
	 * <p>Filled only by {@link com.logicommerce.sdk.resources.OrderResource#getOrder(int)} and
	 * {@link com.logicommerce.sdk.resources.OrderResource#getOrder(String)} (empty when the order has none): null in the
	 * orders hooks receive and in the orders a plugin builds.</p>
	 *
	 * @return the RMAs, or null when not available
	 * @since 2.8.5
	 */
	default List<OrderRMA> getRMAs() {
		return null;
	}

	/**
	 * Returns the credit notes issued for the order, sorted by id. Their amounts are in
	 * {@link OrderPurchaseCurrencyAmounts#getCreditNotes()}.
	 *
	 * <p>Filled only by {@link com.logicommerce.sdk.resources.OrderResource#getOrder(int)} and
	 * {@link com.logicommerce.sdk.resources.OrderResource#getOrder(String)} (empty when the order has none): null in the
	 * orders hooks receive and in the orders a plugin builds.</p>
	 *
	 * @return the credit notes, or null when not available
	 * @since 2.8.5
	 */
	default List<OrderCreditNote> getCreditNotes() {
		return null;
	}

	/**
	 * Returns the storefront's guest order page ({@code <store>/orders/<id>?token=<token>}), built by the platform, never
	 * from the request: {@code <store>} is the storefront version route resolution picks for the order's language and
	 * its shipping (else invoicing) country; when none matches, the first version of the order's language for any
	 * country; else the store URL setting of the order's language.
	 *
	 * <p>Filled only by {@link com.logicommerce.sdk.resources.OrderResource#getOrder(int)} and
	 * {@link com.logicommerce.sdk.resources.OrderResource#getOrder(String)}: null in the orders hooks receive and in the
	 * orders a plugin builds.</p>
	 *
	 * @return an absolute URL, or null when not available
	 * @since 2.8.5
	 */
	default String getPermalinkUrl() {
		return null;
	}

}
