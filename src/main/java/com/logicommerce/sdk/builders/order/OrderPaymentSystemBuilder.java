package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.enums.AmountType;
import com.logicommerce.sdk.models.order.OrderPaymentSystem;
import com.logicommerce.sdk.models.order.implementations.OrderPaymentSystemImpl;

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

	public OrderPaymentSystemBuilder() {
		taxes = new ArrayList<>();
	}

	public OrderPaymentSystemBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderPaymentSystemBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderPaymentSystemBuilder<T> paymentSystemId(int paymentSystemId) {
		this.paymentSystemId = paymentSystemId;
		return this;
	}

	public OrderTaxBuilder<OrderPaymentSystemBuilder<T>> tax() {
		OrderTaxBuilder<OrderPaymentSystemBuilder<T>> tax = new OrderTaxBuilder<>(this);
		taxes.add(tax);
		return tax;
	}

	public OrderPaymentSystemBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	public OrderPaymentSystemBuilder<T> increaseType(AmountType increaseType) {
		this.increaseType = increaseType;
		return this;
	}

	public OrderPaymentSystemBuilder<T> increaseValue(double increaseValue) {
		this.increaseValue = increaseValue;
		return this;
	}

	public OrderPaymentSystemBuilder<T> price(double price) {
		this.price = price;
		return this;
	}

	public OrderPaymentSystemBuilder<T> increaseMin(double increaseMin) {
		this.increaseMin = increaseMin;
		return this;
	}

	public OrderPaymentSystemBuilder<T> cashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
		return this;
	}

	public OrderPaymentSystemBuilder<T> property(String property) {
		this.property = property;
		return this;
	}

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

	public T done() {
		return parentBuilder;
	}
}