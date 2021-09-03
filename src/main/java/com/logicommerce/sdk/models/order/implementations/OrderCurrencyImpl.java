package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.CurrencyMode;
import com.logicommerce.sdk.models.order.OrderCurrency;

public class OrderCurrencyImpl implements OrderCurrency {

	private Integer id;

	private CurrencyMode mode;

	private int currencyId;

	private String name;

	private String code;

	private String codeNumber;

	private String symbol;

	private double usdValue;

	public Integer getId() {
		return id;
	}

	public CurrencyMode getMode() {
		return mode;
	}

	public int getCurrencyId() {
		return currencyId;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getCodeNumber() {
		return codeNumber;
	}

	public String getSymbol() {
		return symbol;
	}

	public double getUsdValue() {
		return usdValue;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMode(CurrencyMode mode) {
		this.mode = mode;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setUsdValue(double usdValue) {
		this.usdValue = usdValue;
	}
}
