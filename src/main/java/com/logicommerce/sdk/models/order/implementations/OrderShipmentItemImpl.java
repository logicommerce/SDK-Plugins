package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderShipmentItem;

/**
 * <p>OrderShipmentItemImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShipmentItemImpl implements OrderShipmentItem {

	private Integer id;

	private int quantity;

	private Integer orderItemId;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>quantity</code>.</p>
	 *
	 * @return a int
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <p>Getter for the field <code>orderItemId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getOrderItemId() {
		return orderItemId;
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
	 * <p>Setter for the field <code>quantity</code>.</p>
	 *
	 * @param quantity a int
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * <p>Setter for the field <code>orderItemId</code>.</p>
	 *
	 * @param orderItemId a {@link java.lang.Integer} object
	 */
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}
}
