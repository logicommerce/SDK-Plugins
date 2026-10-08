package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.models.basket.Allocation;

/**
 * <p>The shipping amounts of one shipment of an order in the order's purchase currency
 * ({@link OrderPurchaseCurrencyAmounts#getShipments()}).</p>
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
	 * Returns the shipping price before its discounts.
	 *
	 * @return the shipping price
	 */
	long getShippingPrice();

	/**
	 * Returns the shipment's share of each shipping discount.
	 *
	 * @return the allocations, never null
	 */
	List<Allocation> getShippingDiscounts();

}
