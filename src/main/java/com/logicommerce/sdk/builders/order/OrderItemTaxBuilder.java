package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderItemTax;
import com.logicommerce.sdk.models.order.implementations.OrderItemTaxImpl;

/**
 * <p>OrderItemTaxBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderItemTaxBuilder<T> {

	private T parentBuilder;

	protected double base;

	protected double taxValue;
	
	protected double taxRate;

	/**
	 * <p>Constructor for OrderItemTaxBuilder.</p>
	 */
	public OrderItemTaxBuilder() {
	}

	/**
	 * <p>Constructor for OrderItemTaxBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderItemTaxBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>base.</p>
	 *
	 * @param base a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemTaxBuilder} object
	 */
	public OrderItemTaxBuilder<T> base(double base) {
		this.base = base;
		return this;
	}

	/**
	 * <p>taxValue.</p>
	 *
	 * @param taxValue a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemTaxBuilder} object
	 */
	public OrderItemTaxBuilder<T> taxValue(double taxValue) {
		this.taxValue = taxValue;
		return this;
	}
	
	/**
	 * <p>taxRate.</p>
	 *
	 * @param taxRate a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemTaxBuilder} object
	 */
	public OrderItemTaxBuilder<T> taxRate(double taxRate) {
		this.taxRate = taxRate;
		return this;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItemTax} object
	 */
	public OrderItemTax build() {
		OrderItemTaxImpl tax = new OrderItemTaxImpl();
		tax.setBase(base);
		tax.setTaxValue(taxValue);
		tax.setTaxRate(taxRate);
		return tax;
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
