package com.logicommerce.sdk.models.order;

import java.time.LocalDate;
import java.util.List;
import com.logicommerce.sdk.enums.OrderShipmentStatusType;
import com.logicommerce.sdk.models.basket.Allocation;

/**
 * <p>A shipment of an order ({@link OrderView#getShipments()}). Amounts are minor units of the order's purchase
 * currency.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderShipmentView {

	/**
	 * Returns the shipment id.
	 *
	 * @return the id
	 */
	int getId();

	/**
	 * Returns the shipment status.
	 *
	 * @return the status, or null when core's status has no counterpart in
	 *         {@link OrderShipmentStatusType} (core's {@code NONE})
	 */
	OrderShipmentStatusType getStatus();

	/**
	 * Returns the shipped quantities, by order row.
	 *
	 * @return the rows, never null
	 */
	List<RowQuantity> getRows();

	/**
	 * Returns the shipping type id.
	 *
	 * @return the shipping type id
	 */
	int getShippingTypeId();

	/**
	 * Returns the shipping type name in the order's language.
	 *
	 * @return the name, or null
	 */
	String getShippingTypeName();

	/**
	 * Returns the shipper (carrier) name.
	 *
	 * @return the shipper name, or null
	 */
	String getShipperName();

	/**
	 * Returns the shipping price before its discounts, rounded once.
	 *
	 * @return the price
	 */
	long getShippingPrice();

	/**
	 * Returns the shipping discounts allocated to this shipment, one entry per discount, rounded once.
	 *
	 * @return the allocations, never null
	 */
	List<Allocation> getShippingDiscounts();

	/**
	 * Returns the tracking number a carrier plugin wrote.
	 *
	 * @return the tracking number, or null
	 */
	String getTrackingNumber();

	/**
	 * Returns the tracking URL as stored. Core sets it to the shipper's generic tracking URL when the order is created,
	 * and a carrier plugin may replace it, so without a {@link #getTrackingNumber()} it may track nothing.
	 *
	 * @return the tracking URL, or null
	 */
	String getTrackingUrl();

	/**
	 * Returns the date the shipment's goods are expected to be available for shipping (core's incoming date).
	 *
	 * @return the date, or null
	 */
	LocalDate getIncomingDate();

	/**
	 * Returns the shipment's status history, in chronological order.
	 *
	 * @return the history, never null
	 */
	List<StatusHistory> getStatusHistory();

}
