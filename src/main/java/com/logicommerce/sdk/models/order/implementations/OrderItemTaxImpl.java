package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderItemTax;

public class OrderItemTaxImpl implements OrderItemTax {

	private double base;

	private double taxValue;

	public double getBase() {
		return base;
	}

	public double getTaxValue() {
		return taxValue;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}

}