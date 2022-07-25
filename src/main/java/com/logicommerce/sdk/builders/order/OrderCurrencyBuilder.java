package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.CurrencyMode;
import com.logicommerce.sdk.models.order.OrderCurrency;
import com.logicommerce.sdk.models.order.implementations.OrderCurrencyImpl;

/**
 * <p>OrderCurrencyBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Constructor for OrderCurrencyBuilder.</p>
	 */
	public OrderCurrencyBuilder() {

	}

	/**
	 * <p>Constructor for OrderCurrencyBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderCurrencyBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderCurrencyBuilder} object
	 */
	public OrderCurrencyBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}
	
	/**
	 * <p>mode.</p>
	 *
	 * @param mode a {@link com.logicommerce.sdk.enums.CurrencyMode} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderCurrencyBuilder} object
	 */
	public OrderCurrencyBuilder<T> mode(CurrencyMode mode) {
		this.mode = mode;
		return this;
	}

	/**
	 * <p>currencyId.</p>
	 *
	 * @param currencyId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderCurrencyBuilder} object
	 */
	public OrderCurrencyBuilder<T> currencyId(int currencyId) {
		this.currencyId = currencyId;
		return this;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderCurrencyBuilder} object
	 */
	public OrderCurrencyBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>code.</p>
	 *
	 * @param code a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderCurrencyBuilder} object
	 */
	public OrderCurrencyBuilder<T> code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * <p>codeNumber.</p>
	 *
	 * @param codeNumber a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderCurrencyBuilder} object
	 */
	public OrderCurrencyBuilder<T> codeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
		return this;
	}

	/**
	 * <p>symbol.</p>
	 *
	 * @param symbol a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderCurrencyBuilder} object
	 */
	public OrderCurrencyBuilder<T> symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	/**
	 * <p>usdValue.</p>
	 *
	 * @param usdValue a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderCurrencyBuilder} object
	 */
	public OrderCurrencyBuilder<T> usdValue(double usdValue) {
		this.usdValue = usdValue;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderCurrency} object
	 */
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

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
