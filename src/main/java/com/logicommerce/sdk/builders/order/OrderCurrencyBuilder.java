package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.CurrencyMode;
import com.logicommerce.sdk.models.order.OrderCurrency;
import com.logicommerce.sdk.models.order.implementations.OrderCurrencyImpl;

public class OrderCurrencyBuilder<T> {

	private T parentBuilder;
	
	protected Integer id;

	protected CurrencyMode mode;

	protected int currencyId;

	protected String name;

	protected String code;

	protected String codeNumber;

	protected String symbol;

	protected double usdValue;

	public OrderCurrencyBuilder() {

	}

	public OrderCurrencyBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	public OrderCurrencyBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}
	
	public OrderCurrencyBuilder<T> mode(CurrencyMode mode) {
		this.mode = mode;
		return this;
	}

	public OrderCurrencyBuilder<T> currencyId(int currencyId) {
		this.currencyId = currencyId;
		return this;
	}

	public OrderCurrencyBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	public OrderCurrencyBuilder<T> code(String code) {
		this.code = code;
		return this;
	}

	public OrderCurrencyBuilder<T> codeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
		return this;
	}

	public OrderCurrencyBuilder<T> symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	public OrderCurrencyBuilder<T> usdValue(double usdValue) {
		this.usdValue = usdValue;
		return this;
	}

	public OrderCurrency build() {
		OrderCurrencyImpl currency = new OrderCurrencyImpl();
		currency.setId(null);
		currency.setMode(mode);
		currency.setCurrencyId(currencyId);
		currency.setName(name);
		currency.setCode(code);
		currency.setCodeNumber(codeNumber);
		currency.setSymbol(symbol);
		currency.setUsdValue(usdValue);
		return currency;
	}

	public T done() {
		return parentBuilder;
	}
}