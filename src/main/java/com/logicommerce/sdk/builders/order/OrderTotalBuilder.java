package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderTotal;
import com.logicommerce.sdk.models.order.implementations.OrderTotalImpl;

public class OrderTotalBuilder<T> {

	private T parentBuilder;

	protected double subtotal;

	protected double subtotalItems;

	protected double subtotalPaymentSystem;

	protected double subtotalShippings;

	protected double total;

	protected double totalDiscounts;

	protected double totalItems;

	protected double totalPaymentSystem;

	protected double totalShippings;

	protected double totalTaxes;

	protected double totalVouchers;

	public OrderTotalBuilder() {

	}

	public OrderTotalBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderTotalBuilder<T> subtotal(double subtotal) {
		this.subtotal = subtotal;
		return this;
	}

	public OrderTotalBuilder<T> subtotalItems(double subtotalItems) {
		this.subtotalItems = subtotalItems;
		return this;
	}

	public OrderTotalBuilder<T> subtotalPaymentSystem(double subtotalPaymentSystem) {
		this.subtotalPaymentSystem = subtotalPaymentSystem;
		return this;
	}

	public OrderTotalBuilder<T> subtotalShippings(double subtotalShippings) {
		this.subtotalShippings = subtotalShippings;
		return this;
	}

	public OrderTotalBuilder<T> total(double total) {
		this.total = total;
		return this;
	}

	public OrderTotalBuilder<T> totalDiscounts(double totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
		return this;
	}

	public OrderTotalBuilder<T> totalItems(double totalItems) {
		this.totalItems = totalItems;
		return this;
	}

	public OrderTotalBuilder<T> totalPaymentSystem(double totalPaymentSystem) {
		this.totalPaymentSystem = totalPaymentSystem;
		return this;
	}

	public OrderTotalBuilder<T> totalShippings(double totalShippings) {
		this.totalShippings = totalShippings;
		return this;
	}

	public OrderTotalBuilder<T> totalTaxes(double totalTaxes) {
		this.totalTaxes = totalTaxes;
		return this;
	}

	public OrderTotalBuilder<T> totalVouchers(double totalVouchers) {
		this.totalVouchers = totalVouchers;
		return this;
	}

	public OrderTotal build() {
		OrderTotalImpl totals = new OrderTotalImpl();
		totals.setSubtotal(subtotal);
		totals.setSubtotalItems(subtotalItems);
		totals.setSubtotalPaymentSystem(subtotalPaymentSystem);
		totals.setSubtotalShippings(subtotalShippings);
		totals.setTotal(total);
		totals.setTotalDiscounts(totalDiscounts);
		totals.setTotalItems(totalItems);
		totals.setTotalPaymentSystem(totalPaymentSystem);
		totals.setTotalShippings(totalShippings);
		totals.setTotalTaxes(totalTaxes);
		totals.setTotalVouchers(totalVouchers);
		return totals;
	}

	public T done() {
		return parentBuilder;
	}
}