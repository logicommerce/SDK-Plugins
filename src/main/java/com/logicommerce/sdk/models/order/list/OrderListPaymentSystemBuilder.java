package com.logicommerce.sdk.models.order.list;

import com.logicommerce.sdk.enums.AmountType;
import com.logicommerce.sdk.enums.PaymentType;

/**
 * OrderListPaymentSystem model builder.
 *
 * @author LogiCommerce
 * @see OrderListPaymentSystem
 * @since 2.8.5
 */
public class OrderListPaymentSystemBuilder {

	private String name;

	private Integer paymentSystemId;

	private Integer paymentSystemPluginId;

	private AmountType increaseType;

	private double increaseValue;

	private double price;

	private double increaseMin;

	private PaymentType paymentType;

	private String property;

	/**
	 * Sets the name.
	 *
	 * @param name a String
	 * @return a {@link OrderListPaymentSystemBuilder} object
	 */
	public OrderListPaymentSystemBuilder name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Sets the paymentSystemId.
	 *
	 * @param paymentSystemId a Integer
	 * @return a {@link OrderListPaymentSystemBuilder} object
	 */
	public OrderListPaymentSystemBuilder paymentSystemId(Integer paymentSystemId) {
		this.paymentSystemId = paymentSystemId;
		return this;
	}

	/**
	 * Sets the paymentSystemPluginId.
	 *
	 * @param paymentSystemPluginId a Integer
	 * @return a {@link OrderListPaymentSystemBuilder} object
	 */
	public OrderListPaymentSystemBuilder paymentSystemPluginId(Integer paymentSystemPluginId) {
		this.paymentSystemPluginId = paymentSystemPluginId;
		return this;
	}

	/**
	 * Sets the increaseType.
	 *
	 * @param increaseType a AmountType
	 * @return a {@link OrderListPaymentSystemBuilder} object
	 */
	public OrderListPaymentSystemBuilder increaseType(AmountType increaseType) {
		this.increaseType = increaseType;
		return this;
	}

	/**
	 * Sets the increaseValue.
	 *
	 * @param increaseValue a double
	 * @return a {@link OrderListPaymentSystemBuilder} object
	 */
	public OrderListPaymentSystemBuilder increaseValue(double increaseValue) {
		this.increaseValue = increaseValue;
		return this;
	}

	/**
	 * Sets the price.
	 *
	 * @param price a double
	 * @return a {@link OrderListPaymentSystemBuilder} object
	 */
	public OrderListPaymentSystemBuilder price(double price) {
		this.price = price;
		return this;
	}

	/**
	 * Sets the increaseMin.
	 *
	 * @param increaseMin a double
	 * @return a {@link OrderListPaymentSystemBuilder} object
	 */
	public OrderListPaymentSystemBuilder increaseMin(double increaseMin) {
		this.increaseMin = increaseMin;
		return this;
	}

	/**
	 * Sets the paymentType.
	 *
	 * @param paymentType a PaymentType
	 * @return a {@link OrderListPaymentSystemBuilder} object
	 */
	public OrderListPaymentSystemBuilder paymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
		return this;
	}

	/**
	 * Sets the property.
	 *
	 * @param property a String
	 * @return a {@link OrderListPaymentSystemBuilder} object
	 */
	public OrderListPaymentSystemBuilder property(String property) {
		this.property = property;
		return this;
	}

	/**
	 * Builds a {@link OrderListPaymentSystemImpl} object.
	 *
	 * @return a {@link OrderListPaymentSystem} object
	 */
	public OrderListPaymentSystem build() {
		OrderListPaymentSystemImpl orderListPaymentSystem = new OrderListPaymentSystemImpl();
		orderListPaymentSystem.setName(name);
		orderListPaymentSystem.setPaymentSystemId(paymentSystemId);
		orderListPaymentSystem.setPaymentSystemPluginId(paymentSystemPluginId);
		orderListPaymentSystem.setIncreaseType(increaseType);
		orderListPaymentSystem.setIncreaseValue(increaseValue);
		orderListPaymentSystem.setPrice(price);
		orderListPaymentSystem.setIncreaseMin(increaseMin);
		orderListPaymentSystem.setPaymentType(paymentType);
		orderListPaymentSystem.setProperty(property);
		return orderListPaymentSystem;
	}

}
