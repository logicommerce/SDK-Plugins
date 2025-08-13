package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderTotalCurrency;
import com.logicommerce.sdk.models.order.implementations.OrderTotalCurrencyImpl;

public class OrderTotalCurrencyBuilder<T> {

	private T parentBuilder;

	protected OrderTotalBuilder<OrderTotalCurrencyBuilder<T>> totals;

	protected String currencyCode;
	
	protected String currencyCodeNumber;

	public OrderTotalCurrencyBuilder(T parentBuilder) {
		this.parentBuilder = parentBuilder;
		totals = new OrderTotalBuilder<>(this);
	}

	/**
	 * <p>totals.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<OrderTotalCurrencyBuilder<T>> totals() {
		return totals;
	}

	/**
	 * <p>
	 * currencyCode.
	 * </p>
	 *
	 * @param currencyCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalCurrencyBuilder} object
	 */
	public OrderTotalCurrencyBuilder<T> currencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
		return this;
	}

	/**
	 * <p>currencyCodeNumber.</p>
	 *
	 * @param currencyCodeNumber a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalCurrencyBuilder} object
	 */
	public OrderTotalCurrencyBuilder<T> currencyCodeNumber(String currencyCodeNumber) {
		this.currencyCodeNumber = currencyCodeNumber;
		return this;
	}
	
	public OrderTotalCurrency build() {
		OrderTotalCurrencyImpl orderTotalCurrency = new OrderTotalCurrencyImpl();
		orderTotalCurrency.setCurrencyCode(currencyCode);
		orderTotalCurrency.setCurrencyCodeNumer(currencyCodeNumber);
		orderTotalCurrency.setTotals(totals.build());
		return orderTotalCurrency;
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
