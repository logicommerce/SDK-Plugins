package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.models.basket.Allocation;

/**
 * <p>The shipping amounts of one shipment of an order in the order's purchase currency
 * ({@link OrderPurchaseCurrencyAmounts#getShipments()}). Amounts are minor units of
 * {@link OrderPurchaseCurrencyAmounts#getCurrencyCode()}, gross or net per {@link Order#isTaxesIncluded()}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderShipmentAmounts {

	/**
	 * Returns the id of the shipment these amounts belong to.
	 *
	 * @return the shipment id, as in {@link OrderShipment#getId()}
	 */
	int getShipmentId();

	/**
	 * Returns the shipping price before its discounts, rounded once.
	 *
	 * @return the shipping price
	 */
	long getShippingPrice();

	/**
	 * Returns the shipment's share of each shipping discount, one entry per discount, each rounded once.
	 *
	 * @return the allocations, never null
	 */
	List<Allocation> getShippingDiscounts();

}
