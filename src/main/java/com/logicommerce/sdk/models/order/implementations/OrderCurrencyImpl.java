package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.CurrencyMode;
import com.logicommerce.sdk.models.order.OrderCurrency;

/**
 * <p>OrderCurrencyImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderCurrencyImpl implements OrderCurrency {

	private Integer id;

	private CurrencyMode mode;

	private int currencyId;

	private String name;

	private String code;

	private String codeNumber;

	private String symbol;

	private double usdValue;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>mode</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.CurrencyMode} object
	 */
	public CurrencyMode getMode() {
		return mode;
	}

	/**
	 * <p>Getter for the field <code>currencyId</code>.</p>
	 *
	 * @return a int
	 */
	public int getCurrencyId() {
		return currencyId;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <p>Getter for the field <code>codeNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getCodeNumber() {
		return codeNumber;
	}

	/**
	 * <p>Getter for the field <code>symbol</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <p>Getter for the field <code>usdValue</code>.</p>
	 *
	 * @return a double
	 */
	public double getUsdValue() {
		return usdValue;
	}

	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <p>Setter for the field <code>mode</code>.</p>
	 *
	 * @param mode a {@link com.logicommerce.sdk.enums.CurrencyMode} object
	 */
	public void setMode(CurrencyMode mode) {
		this.mode = mode;
	}

	/**
	 * <p>Setter for the field <code>currencyId</code>.</p>
	 *
	 * @param currencyId a int
	 */
	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Setter for the field <code>codeNumber</code>.</p>
	 *
	 * @param codeNumber a {@link java.lang.String} object
	 */
	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}

	/**
	 * <p>Setter for the field <code>symbol</code>.</p>
	 *
	 * @param symbol a {@link java.lang.String} object
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * <p>Setter for the field <code>usdValue</code>.</p>
	 *
	 * @param usdValue a double
	 */
	public void setUsdValue(double usdValue) {
		this.usdValue = usdValue;
	}
}
