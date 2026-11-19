package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.enums.RMAStatusType;

/**
 * <p>A return merchandise authorization (RMA) of an order ({@link Order#getRMAs()}).</p>
 *
 * <p>It is a summary of the RMA. {@link com.logicommerce.sdk.resources.RMAResource#getRMA(int)} with
 * {@link #getId()} returns the whole {@link com.logicommerce.sdk.models.rma.RMA}.</p>
 *
 * @author Logicommerce
 * @since 2.9.0
 */
public interface OrderRMA {

	/**
	 * Returns the RMA id.
	 *
	 * @return the id
	 */
	int getId();

	/**
	 * Returns the RMA document number, the one {@link com.logicommerce.sdk.resources.RMAResource#getRMA(String)} finds.
	 *
	 * @return the document number, or null when the RMA has none
	 * @since 2.9.1
	 */
	String getDocumentNumber();

	/**
	 * Returns the RMA status.
	 *
	 * @return the status
	 */
	RMAStatusType getStatus();

	/**
	 * Returns the RMA date.
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
