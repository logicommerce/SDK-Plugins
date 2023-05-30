package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderItemTax;

/**
 * <p>OrderItemTaxImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderItemTaxImpl implements OrderItemTax {

	private double base;

	private double taxValue;
	
	private double taxRate;

	/**
	 * <p>Getter for the field <code>base</code>.</p>
	 *
	 * @return a double
	 */
	public double getBase() {
		return base;
	}

	/**
	 * <p>Getter for the field <code>taxValue</code>.</p>
	 *
	 * @return a double
	 */
	public double getTaxValue() {
		return taxValue;
	}

	/**
	 * <p>Setter for the field <code>base</code>.</p>
	 *
	 * @param base a double
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * <p>Setter for the field <code>taxValue</code>.</p>
	 *
	 * @param taxValue a double
	 */
	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}

	/**
	 * <p>Getter for the field <code>taxRate</code>.</p>
	 *
	 * @return a double
	 */
	@Override
	public double getTaxRate() {
		return taxRate;
	}
	
	/**
	 * <p>Setter for the field <code>taxRate</code>.</p>
	 *
	 * @param taxRate a double
	 */
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
}
