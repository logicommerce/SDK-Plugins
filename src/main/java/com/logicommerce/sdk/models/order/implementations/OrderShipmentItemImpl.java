package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderShipmentItem;

public class OrderShipmentItemImpl implements OrderShipmentItem {

	private Integer id;

	private int quantity;

	private Integer orderItemId;

	public Integer getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}
}