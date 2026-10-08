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
	 * Returns whether the amounts of {@link #getPurchaseCurrencyAmounts()} include taxes, as
	 * {@link com.logicommerce.sdk.models.basket.BasketView#isTaxesIncluded()} does for baskets.
	 *
	 * <p>Only filled by {@link com.logicommerce.sdk.resources.OrderResource}; null otherwise.</p>
	 *
	 * @return true when prices include taxes, or null when not available
	 * @since 2.8.5
	 */
	default Boolean isTaxesIncluded() {
		return null;
	}

	/**
	 * Returns the order's amounts as integer minor units of its purchase currency.
	 *
	 * <p>Only filled by {@link com.logicommerce.sdk.resources.OrderResource}; null otherwise.</p>
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
	 * <p>Only filled by {@link com.logicommerce.sdk.resources.OrderResource}; null otherwise.</p>
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
	 * <p>Only filled by {@link com.logicommerce.sdk.resources.OrderResource}; null otherwise.</p>
	 *
	 * @return the credit notes, or null when not available
	 * @since 2.8.5
	 */
	default List<OrderCreditNote> getCreditNotes() {
		return null;
	}

	/**
	 * Returns the storefront's guest order page ({@code <store>/orders/<id>?token=<token>}).
	 *
	 * <p>Only filled by {@link com.logicommerce.sdk.resources.OrderResource}; null otherwise.</p>
	 *
	 * @return an absolute URL, or null when not available
	 * @since 2.8.5
	 */
	default String getPermalinkUrl() {
		return null;
	}

}
