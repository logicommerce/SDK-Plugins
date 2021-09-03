package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderItemPrices;

public class OrderItemPricesImpl implements OrderItemPrices {

	private double productPrice;

	private double optionsPrice;

	private double previousPrice;

	private double price;

	private double totalTaxes;

	private double total;

	@Override
	public double getProductPrice() {
		return productPrice;
	}

	@Override
	public double getOptionsPrice() {
		return optionsPrice;
	}

	@Override
	public double getPreviousPrice() {
		return previousPrice;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public double getTotalTaxes() {
		return totalTaxes;
	}

	@Override
	public double getTotal() {
		return total;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public void setOptionsPrice(double optionsPrice) {
		this.optionsPrice = optionsPrice;
	}

	public void setPreviousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTotalTaxes(double totalTaxes) {
		this.totalTaxes = totalTaxes;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}