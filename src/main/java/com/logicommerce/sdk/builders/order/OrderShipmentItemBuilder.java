package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderShipmentItem;
import com.logicommerce.sdk.models.order.implementations.OrderShipmentItemImpl;

/**
 * <p>OrderShipmentItemBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShipmentItemBuilder<T> {

	private T parentBuilder;

	private int quantity;

	private Integer orderItemId;

	private double weight;

	/**
	 * <p>Constructor for OrderShipmentItemBuilder.</p>
	 */
	public OrderShipmentItemBuilder() {
	}

	/**
	 * <p>Constructor for OrderShipmentItemBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderShipmentItemBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>quantity.</p>
	 *
	 * @param quantity a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentItemBuilder} object
	 */
	public OrderShipmentItemBuilder<T> quantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * <p>orderItemId.</p>
	 *
	 * @param orderItemId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentItemBuilder} object
	 */
	public OrderShipmentItemBuilder<T> orderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
		return this;
	}

	/**
	 * <p>weight.</p>
	 *
	 * @param weight a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentItemBuilder} object
	 */
	public OrderShipmentItemBuilder<T> weight(double weight) {
		this.weight = weight;
		return this;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShipmentItem} object
	 */
	public OrderShipmentItem build() {
		OrderShipmentItemImpl item = new OrderShipmentItemImpl();
		item.setId(null);
		item.setQuantity(quantity);
		item.setOrderItemId(orderItemId);
		item.setWeight(weight);
		return item;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
