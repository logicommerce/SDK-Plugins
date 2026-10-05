package com.logicommerce.sdk.models.order;

import java.time.Instant;
import java.util.List;
import com.logicommerce.sdk.enums.RMAStatusType;

/**
 * <p>A return merchandise authorization (RMA) of an order ({@link OrderView#getRMAs()}).</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface RMAView {

	/**
	 * Returns the RMA id.
	 *
	 * @return the id
	 */
	int getId();

	/**
	 * Returns the RMA status.
	 *
	 * @return the status
	 */
	RMAStatusType getStatus();

	/**
	 * Returns the RMA date.
	 *
	 * @return the date (UTC)
	 */
	Instant getDate();

	/**
	 * Returns the returned quantities, by order row.
	 *
	 * @return the rows, never null
	 */
	List<RowQuantity> getRows();

}
