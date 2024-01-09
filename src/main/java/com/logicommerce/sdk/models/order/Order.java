package com.logicommerce.sdk.models.order;

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

}
