package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.DocumentConversionCurrency;
import com.logicommerce.sdk.models.order.implementations.DocumentConversionCurrencyImpl;

/**
 * <p>DocumentConversionCurrencyBuilder class.</p>
 *
 * @author Logicommerce
 * @since 2.5.0
 */
public class DocumentConversionCurrencyBuilder<T> {

	private T parentBuilder;

	protected Integer id;

	protected boolean defaultCurrency;

	protected int currencyId;

	protected String name;

	protected String code;

	protected String codeNumber;

	protected String symbol;

	protected double usdValue;

	/**
	 * <p>Constructor for OrderCurrencyBuilder.</p>
	 */
	public DocumentConversionCurrencyBuilder() {

	}

	/**
	 * <p>Constructor for OrderCurrencyBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public DocumentConversionCurrencyBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentConversionCurrencyBuilder} object
	 */
	public DocumentConversionCurrencyBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>defaultCurrency.</p>
	 * 
	 * * @param defaultCurrency a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentConversionCurrencyBuilder} object
	 */
	public DocumentConversionCurrencyBuilder<T> defaultCurrency(boolean defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
		return this;
	}

	/**
	 * <p>currencyId.</p>
	 *
	 * @param currencyId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentConversionCurrencyBuilder} object
	 */
	public DocumentConversionCurrencyBuilder<T> currencyId(int currencyId) {
		this.currencyId = currencyId;
		return this;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentConversionCurrencyBuilder} object
	 */
	public DocumentConversionCurrencyBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>code.</p>
	 *
	 * @param code a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentConversionCurrencyBuilder} object
	 */
	public DocumentConversionCurrencyBuilder<T> code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * <p>codeNumber.</p>
	 *
	 * @param codeNumber a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentConversionCurrencyBuilder} object
	 */
	public DocumentConversionCurrencyBuilder<T> codeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
		return this;
	}

	/**
	 * <p>symbol.</p>
	 *
	 * @param symbol a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentConversionCurrencyBuilder} object
	 */
	public DocumentConversionCurrencyBuilder<T> symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	/**
	 * <p>usdValue.</p>
	 *
	 * @param usdValue a double
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentConversionCurrencyBuilder} object
	 */
	public DocumentConversionCurrencyBuilder<T> usdValue(double usdValue) {
		this.usdValue = usdValue;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.DocumentConversionCurrency} object
	 */
	public DocumentConversionCurrency build() {
		DocumentConversionCurrencyImpl currency = new DocumentConversionCurrencyImpl();
		currency.setId(null);
		currency.setDefaultCurrency(defaultCurrency);
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
