package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.order.Order;

/**
 * <p>OrderImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderImpl extends DocumentImpl implements Order  {

	private OrderStatusType status;

	private int substatusId;

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 */
	@Override
	public OrderStatusType getStatus() {
		return status;
	}

	/**
	 * <p>Getter for the field <code>substatusId</code>.</p>
	 *
	 * @return a int
	 */
	@Override
	public int getSubstatusId() {
		return substatusId;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 */
	public void setStatus(OrderStatusType status) {
		this.status = status;
	}

	/**
	 * <p>Setter for the field <code>substatusId</code>.</p>
	 *
	 * @param substatusId a int
	 */
	public void setSubstatusId(int substatusId) {
		this.substatusId = substatusId;
	}
}
