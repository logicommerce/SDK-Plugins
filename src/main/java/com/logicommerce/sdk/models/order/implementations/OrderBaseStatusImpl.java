package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.models.order.OrderBaseStatus;
import com.logicommerce.sdk.models.order.OrderStatusAction;
import com.logicommerce.utilities.annotations.Uses;

/**
 * <p>OrderBaseStatusImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderBaseStatusImpl<T> implements OrderBaseStatus<T>  {

	private Integer id;

	@Uses(value = OrderStatusActionImpl.class)
	private List<OrderStatusAction> actions;

	private LocalDateTime currentDateTime;
	
	private T status;

	private int substatusId;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>actions</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderStatusAction> getActions() {
		return actions;
	}

	/**
	 * <p>Getter for the field <code>currentDateTime</code>.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	public LocalDateTime getCurrentDateTime() {
		return currentDateTime;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a T object
	 */
	public T getStatus() {
		return status;
	}

	/**
	 * <p>Getter for the field <code>substatusId</code>.</p>
	 *
	 * @return a int
	 */
	public int getSubstatusId() {
		return substatusId;
	}

	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <p>Setter for the field <code>actions</code>.</p>
	 *
	 * @param actions a {@link java.util.List} object
	 */
	public void setActions(List<OrderStatusAction> actions) {
		this.actions = actions;
	}

	/**
	 * <p>Setter for the field <code>currentDateTime</code>.</p>
	 *
	 * @param currentDateTime a {@link java.time.LocalDateTime} object
	 */
	public void setCurrentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
	}

	/**
	 * <p>Setter for the field <code>substatusId</code>.</p>
	 *
	 * @param substatusId a int
	 */
	public void setSubstatusId(int substatusId) {
		this.substatusId = substatusId;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a T object
	 */
	public void setStatus(T status) {
		this.status = status;
	}
}
