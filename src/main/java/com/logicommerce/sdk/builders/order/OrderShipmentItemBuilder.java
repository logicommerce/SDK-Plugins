package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderShipmentItem;
import com.logicommerce.sdk.models.order.implementations.OrderShipmentItemImpl;

public class OrderShipmentItemBuilder<T> {

	private T parentBuilder;
	
	protected Integer id;

	protected int quantity;

	protected Integer orderItemId;

	public OrderShipmentItemBuilder() {
	}

	public OrderShipmentItemBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderShipmentItemBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}
	
	public OrderShipmentItemBuilder<T> quantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public OrderShipmentItemBuilder<T> orderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
		return this;
	}

	public OrderShipmentItem build() {
		OrderShipmentItemImpl item = new OrderShipmentItemImpl();
		item.setId(null);
		item.setQuantity(quantity);
		item.setOrderItemId(orderItemId);
		return item;
	}

	public T done() {
		return parentBuilder;
	}
}