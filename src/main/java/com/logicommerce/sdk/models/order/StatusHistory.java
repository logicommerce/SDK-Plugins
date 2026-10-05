package com.logicommerce.sdk.models.order;

import java.time.Instant;

/**
 * <p>One entry of a status history: of an order ({@link OrderView#getStatusHistory()}) or of a shipment
 * ({@link OrderShipmentView#getStatusHistory()}).</p>
 *
 * <p>Statuses are core's status names as text (for an order, the names of
 * {@link com.logicommerce.sdk.enums.OrderStatusType}; for a shipment, those of
 * {@link com.logicommerce.sdk.enums.OrderShipmentStatusType} plus core's {@code NONE}), so an entry never fails to map.
 * Entries are in chronological order.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface StatusHistory {

	/**
	 * Returns the id of the history entry, stable over time.
	 *
	 * @return the entry id
	 */
	long getId();

	/**
	 * Returns the status before the change. Core records an entry only when the status changes (none when the order or
	 * the shipment is created), so the first entry has one too.
	 *
	 * @return the status name, or null when core recorded none
	 */
	String getFromStatus();

	/**
	 * Returns the status after the change.
	 *
	 * @return the status name
	 */
	String getToStatus();

	/**
	 * Returns when the change happened.
	 *
	 * @return the date and time (UTC)
	 */
	Instant getCurrentDateTime();

}
