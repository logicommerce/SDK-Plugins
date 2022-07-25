package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderTotal;

/**
 * <p>OrderTotalImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Getter for the field <code>subtotal</code>.</p>
	 *
	 * @return a double
	 */
	public double getSubtotal() {
		return subtotal;
	}

	/**
	 * <p>Getter for the field <code>subtotalItems</code>.</p>
	 *
	 * @return a double
	 */
	public double getSubtotalItems() {
		return subtotalItems;
	}

	/**
	 * <p>Getter for the field <code>subtotalPaymentSystem</code>.</p>
	 *
	 * @return a double
	 */
	public double getSubtotalPaymentSystem() {
		return subtotalPaymentSystem;
	}

	/**
	 * <p>Getter for the field <code>subtotalShippings</code>.</p>
	 *
	 * @return a double
	 */
	public double getSubtotalShippings() {
		return subtotalShippings;
	}

	/**
	 * <p>Getter for the field <code>total</code>.</p>
	 *
	 * @return a double
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * <p>Getter for the field <code>totalDiscounts</code>.</p>
	 *
	 * @return a double
	 */
	public double getTotalDiscounts() {
		return totalDiscounts;
	}

	/**
	 * <p>Getter for the field <code>totalItems</code>.</p>
	 *
	 * @return a double
	 */
	public double getTotalItems() {
		return totalItems;
	}

	/**
	 * <p>Getter for the field <code>totalPaymentSystem</code>.</p>
	 *
	 * @return a double
	 */
	public double getTotalPaymentSystem() {
		return totalPaymentSystem;
	}

	/**
	 * <p>Getter for the field <code>totalShippings</code>.</p>
	 *
	 * @return a double
	 */
	public double getTotalShippings() {
		return totalShippings;
	}

	/**
	 * <p>Getter for the field <code>totalTaxes</code>.</p>
	 *
	 * @return a double
	 */
	public double getTotalTaxes() {
		return totalTaxes;
	}

	/**
	 * <p>Getter for the field <code>totalVouchers</code>.</p>
	 *
	 * @return a double
	 */
	public double getTotalVouchers() {
		return totalVouchers;
	}

	/**
	 * <p>Setter for the field <code>subtotal</code>.</p>
	 *
	 * @param subtotal a double
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * <p>Setter for the field <code>subtotalItems</code>.</p>
	 *
	 * @param subtotalItems a double
	 */
	public void setSubtotalItems(double subtotalItems) {
		this.subtotalItems = subtotalItems;
	}

	/**
	 * <p>Setter for the field <code>subtotalPaymentSystem</code>.</p>
	 *
	 * @param subtotalPaymentSystem a double
	 */
	public void setSubtotalPaymentSystem(double subtotalPaymentSystem) {
		this.subtotalPaymentSystem = subtotalPaymentSystem;
	}

	/**
	 * <p>Setter for the field <code>subtotalShippings</code>.</p>
	 *
	 * @param subtotalShippings a double
	 */
	public void setSubtotalShippings(double subtotalShippings) {
		this.subtotalShippings = subtotalShippings;
	}

	/**
	 * <p>Setter for the field <code>total</code>.</p>
	 *
	 * @param total a double
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * <p>Setter for the field <code>totalDiscounts</code>.</p>
	 *
	 * @param totalDiscounts a double
	 */
	public void setTotalDiscounts(double totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
	}

	/**
	 * <p>Setter for the field <code>totalItems</code>.</p>
	 *
	 * @param totalItems a double
	 */
	public void setTotalItems(double totalItems) {
		this.totalItems = totalItems;
	}

	/**
	 * <p>Setter for the field <code>totalPaymentSystem</code>.</p>
	 *
	 * @param totalPaymentSystem a double
	 */
	public void setTotalPaymentSystem(double totalPaymentSystem) {
		this.totalPaymentSystem = totalPaymentSystem;
	}

	/**
	 * <p>Setter for the field <code>totalShippings</code>.</p>
	 *
	 * @param totalShippings a double
	 */
	public void setTotalShippings(double totalShippings) {
		this.totalShippings = totalShippings;
	}

	/**
	 * <p>Setter for the field <code>totalTaxes</code>.</p>
	 *
	 * @param totalTaxes a double
	 */
	public void setTotalTaxes(double totalTaxes) {
		this.totalTaxes = totalTaxes;
	}

	/**
	 * <p>Setter for the field <code>totalVouchers</code>.</p>
	 *
	 * @param totalVouchers a double
	 */
	public void setTotalVouchers(double totalVouchers) {
		this.totalVouchers = totalVouchers;
	}
}
