package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.enums.AmountType;
import com.logicommerce.sdk.models.order.OrderPaymentSystem;
import com.logicommerce.sdk.models.order.implementations.OrderPaymentSystemImpl;

/**
 * <p>OrderPaymentSystemBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderPaymentSystemBuilder<T> {

	private T parentBuilder;

	protected Integer id;
	
	protected int paymentSystemId;

	protected List<OrderTaxBuilder<OrderPaymentSystemBuilder<T>>> taxes;

	protected String name;

	protected AmountType increaseType;

	protected double increaseValue;

	protected double price;

	protected double increaseMin;

	protected boolean cashOnDelivery;

	protected String property;

	/**
	 * <p>Constructor for OrderPaymentSystemBuilder.</p>
	 */
	public OrderPaymentSystemBuilder() {
		taxes = new ArrayList<>();
	}

	/**
	 * <p>Constructor for OrderPaymentSystemBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderPaymentSystemBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>paymentSystemId.</p>
	 *
	 * @param paymentSystemId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<T> paymentSystemId(int paymentSystemId) {
		this.paymentSystemId = paymentSystemId;
		return this;
	}

	/**
	 * <p>tax.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<OrderPaymentSystemBuilder<T>> tax() {
		OrderTaxBuilder<OrderPaymentSystemBuilder<T>> tax = new OrderTaxBuilder<>(this);
		taxes.add(tax);
		return tax;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>increaseType.</p>
	 *
	 * @param increaseType a {@link com.logicommerce.sdk.enums.AmountType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<T> increaseType(AmountType increaseType) {
		this.increaseType = increaseType;
		return this;
	}

	/**
	 * <p>increaseValue.</p>
	 *
	 * @param increaseValue a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<T> increaseValue(double increaseValue) {
		this.increaseValue = increaseValue;
		return this;
	}

	/**
	 * <p>price.</p>
	 *
	 * @param price a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<T> price(double price) {
		this.price = price;
		return this;
	}

	/**
	 * <p>increaseMin.</p>
	 *
	 * @param increaseMin a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<T> increaseMin(double increaseMin) {
		this.increaseMin = increaseMin;
		return this;
	}

	/**
	 * <p>cashOnDelivery.</p>
	 *
	 * @param cashOnDelivery a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<T> cashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
		return this;
	}

	/**
	 * <p>property.</p>
	 *
	 * @param property a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<T> property(String property) {
		this.property = property;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderPaymentSystem} object
	 */
	public OrderPaymentSystem build() {
		OrderPaymentSystemImpl paymentSystem = new OrderPaymentSystemImpl();
		paymentSystem.setId(null);
		paymentSystem.setPaymentSystemId(paymentSystemId);
		paymentSystem.setTaxes(taxes.stream().map(OrderTaxBuilder::build).collect(Collectors.toList()));
		paymentSystem.setName(name);
		paymentSystem.setIncreaseType(increaseType);
		paymentSystem.setIncreaseValue(increaseValue);
		paymentSystem.setPrice(price);
		paymentSystem.setIncreaseMin(increaseMin);
		paymentSystem.setCashOnDelivery(cashOnDelivery);
		paymentSystem.setProperty(property);
		return paymentSystem;
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
