package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderTax;

public class OrderTaxImpl implements OrderTax {

	private double taxRate;

	private double reRate;

	private double base;

	private double taxPrice;

	private double rePrice;

	private double totalPrice;

	private double baseWithoutDiscounts;

	private double discount;
	
	@Override
	public double getTaxRate() {
		return taxRate;
	}

	@Override
	public double getReRate() {
		return reRate;
	}

	@Override
	public double getBase() {
		return base;
	}

	@Override
	public double getTaxPrice() {
		return taxPrice;
	}

	@Override
	public double getRePrice() {
		return rePrice;
	}

	@Override
	public double getTotalPrice() {
		return totalPrice;
	}

	@Override
	public double getBaseWithoutDiscounts() {
		return baseWithoutDiscounts;
	}

	@Override
	public double getDiscount() {
		return discount;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public void setReRate(double reRate) {
		this.reRate = reRate;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setTaxPrice(double taxPrice) {
		this.taxPrice = taxPrice;
	}

	public void setRePrice(double rePrice) {
		this.rePrice = rePrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setBaseWithoutDiscounts(double baseWithoutDiscounts) {
		this.baseWithoutDiscounts = baseWithoutDiscounts;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}