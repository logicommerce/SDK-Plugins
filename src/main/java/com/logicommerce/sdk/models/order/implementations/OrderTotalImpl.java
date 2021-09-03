package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderTotal;

public class OrderTotalImpl implements OrderTotal {

	private double subtotal;

	private double subtotalItems;

	private double subtotalPaymentSystem;

	private double subtotalShippings;

	private double total;

	private double totalDiscounts;

	private double totalItems;

	private double totalPaymentSystem;

	private double totalShippings;

	private double totalTaxes;

	private double totalVouchers;

	public double getSubtotal() {
		return subtotal;
	}

	public double getSubtotalItems() {
		return subtotalItems;
	}

	public double getSubtotalPaymentSystem() {
		return subtotalPaymentSystem;
	}

	public double getSubtotalShippings() {
		return subtotalShippings;
	}

	public double getTotal() {
		return total;
	}

	public double getTotalDiscounts() {
		return totalDiscounts;
	}

	public double getTotalItems() {
		return totalItems;
	}

	public double getTotalPaymentSystem() {
		return totalPaymentSystem;
	}

	public double getTotalShippings() {
		return totalShippings;
	}

	public double getTotalTaxes() {
		return totalTaxes;
	}

	public double getTotalVouchers() {
		return totalVouchers;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public void setSubtotalItems(double subtotalItems) {
		this.subtotalItems = subtotalItems;
	}

	public void setSubtotalPaymentSystem(double subtotalPaymentSystem) {
		this.subtotalPaymentSystem = subtotalPaymentSystem;
	}

	public void setSubtotalShippings(double subtotalShippings) {
		this.subtotalShippings = subtotalShippings;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setTotalDiscounts(double totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
	}

	public void setTotalItems(double totalItems) {
		this.totalItems = totalItems;
	}

	public void setTotalPaymentSystem(double totalPaymentSystem) {
		this.totalPaymentSystem = totalPaymentSystem;
	}

	public void setTotalShippings(double totalShippings) {
		this.totalShippings = totalShippings;
	}

	public void setTotalTaxes(double totalTaxes) {
		this.totalTaxes = totalTaxes;
	}

	public void setTotalVouchers(double totalVouchers) {
		this.totalVouchers = totalVouchers;
	}
}