package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderItemPrices;
import com.logicommerce.sdk.models.order.implementations.OrderItemPricesImpl;

public class OrderItemPricesBuilder<T> {

	private T parentBuilder;

	protected double productPrice;

	protected double optionsPrice;

	protected double previousPrice;

	protected double price;

	protected double totalTaxes;

	protected double total;

	public OrderItemPricesBuilder() {
	}

	public OrderItemPricesBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderItemPricesBuilder<T> productPrice(double productPrice) {
		this.productPrice = productPrice;
		return this;
	}

	public OrderItemPricesBuilder<T> optionsPrice(double optionsPrice) {
		this.optionsPrice = optionsPrice;
		return this;
	}

	public OrderItemPricesBuilder<T> previousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
		return this;
	}

	public OrderItemPricesBuilder<T> price(double price) {
		this.price = price;
		return this;
	}

	public OrderItemPricesBuilder<T> totalTaxes(double totalTaxes) {
		this.totalTaxes = totalTaxes;
		return this;
	}

	public OrderItemPricesBuilder<T> total(double total) {
		this.total = total;
		return this;
	}

	public OrderItemPrices build() {
		OrderItemPricesImpl prices = new OrderItemPricesImpl();
		prices.setProductPrice(productPrice);
		prices.setOptionsPrice(optionsPrice);
		prices.setPreviousPrice(previousPrice);
		prices.setPrice(price);
		prices.setTotalTaxes(totalTaxes);
		prices.setTotal(total);
		return prices;
	}

	public T done() {
		return parentBuilder;
	}
}