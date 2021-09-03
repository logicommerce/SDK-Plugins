package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderTax;
import com.logicommerce.sdk.models.order.implementations.OrderTaxImpl;

public class OrderTaxBuilder<T> {

	private T parentBuilder;

	protected double taxRate;

	protected double reRate;

	protected double base;

	protected double taxPrice;

	protected double rePrice;

	protected double totalPrice;

	protected double baseWithoutDiscounts;

	protected double discount;

	public OrderTaxBuilder() {

	}

	public OrderTaxBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderTaxBuilder<T> taxRate(double taxRate) {
		this.taxRate = taxRate;
		return this;
	}

	public OrderTaxBuilder<T> reRate(double reRate) {
		this.reRate = reRate;
		return this;
	}

	public OrderTaxBuilder<T> base(double base) {
		this.base = base;
		return this;
	}

	public OrderTaxBuilder<T> taxPrice(double taxPrice) {
		this.taxPrice = taxPrice;
		return this;
	}

	public OrderTaxBuilder<T> rePrice(double rePrice) {
		this.rePrice = rePrice;
		return this;
	}

	public OrderTaxBuilder<T> totalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
		return this;
	}

	public OrderTaxBuilder<T> baseWithoutDiscounts(double baseWithoutDiscounts) {
		this.baseWithoutDiscounts = baseWithoutDiscounts;
		return this;
	}

	public OrderTaxBuilder<T> discount(double discount) {
		this.discount = discount;
		return this;
	}

	public OrderTax build() {
		OrderTaxImpl information = new OrderTaxImpl();
		information.setTaxRate(taxRate);
		information.setReRate(reRate);
		information.setBase(base);
		information.setTaxPrice(taxPrice);
		information.setRePrice(rePrice);
		information.setTotalPrice(totalPrice);
		information.setBaseWithoutDiscounts(baseWithoutDiscounts);
		information.setDiscount(discount);
		return information;
	}

	public T done() {
		return parentBuilder;
	}
}