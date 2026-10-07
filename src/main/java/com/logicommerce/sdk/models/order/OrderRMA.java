package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.enums.RMAStatusType;

/**
 * <p>A return merchandise authorization (RMA) of an order ({@link Order#getRMAs()}).</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderRMA {

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
	 * Returns the RMA date, as stored (like {@link Document#getDate()}).
	 *
	 * @return the date
	 */
	LocalDateTime getDate();

	/**
	 * Returns the returned items, one entry per RMA row.
	 *
	 * @return the items, never null
	 */
	List<OrderRMAItem> getItems();

}
