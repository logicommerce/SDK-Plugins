package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderItemTax;
import com.logicommerce.sdk.models.order.implementations.OrderItemTaxImpl;

public class OrderItemTaxBuilder<T> {

	private T parentBuilder;

	protected double base;

	protected double taxValue;

	public OrderItemTaxBuilder() {
	}

	public OrderItemTaxBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderItemTaxBuilder<T> base(double base) {
		this.base = base;
		return this;
	}

	public OrderItemTaxBuilder<T> taxValue(double taxValue) {
		this.taxValue = taxValue;
		return this;
	}

	public OrderItemTax build() {
		OrderItemTaxImpl tax = new OrderItemTaxImpl();
		tax.setBase(base);
		tax.setTaxValue(taxValue);
		return tax;
	}

	public T done() {
		return parentBuilder;
	}

}
