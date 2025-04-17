package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderTotal;
import com.logicommerce.sdk.models.order.implementations.OrderTotalImpl;

/**
 * <p>OrderTotalBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderTotalBuilder<T> {

	private T parentBuilder;

	protected double subtotal;

	protected double subtotalItems;

	protected double subtotalPaymentSystem;

	protected double subtotalShippings;

	protected double subtotalDiscounts;

	protected double total;

	protected double totalDiscounts;

	protected double totalItems;

	protected double totalPaymentSystem;

	protected double totalShippings;

	protected double totalTaxes;

	protected double totalVouchers;

	/**
	 * <p>Constructor for OrderTotalBuilder.</p>
	 */
	public OrderTotalBuilder() {

	}

	/**
	 * <p>Constructor for OrderTotalBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderTotalBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>subtotal.</p>
	 *
	 * @param subtotal a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> subtotal(double subtotal) {
		this.subtotal = subtotal;
		return this;
	}

	/**
	 * <p>subtotalItems.</p>
	 *
	 * @param subtotalItems a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> subtotalItems(double subtotalItems) {
		this.subtotalItems = subtotalItems;
		return this;
	}

	/**
	 * <p>subtotalPaymentSystem.</p>
	 *
	 * @param subtotalPaymentSystem a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> subtotalPaymentSystem(double subtotalPaymentSystem) {
		this.subtotalPaymentSystem = subtotalPaymentSystem;
		return this;
	}

	/**
	 * <p>subtotalShippings.</p>
	 *
	 * @param subtotalShippings a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> subtotalShippings(double subtotalShippings) {
		this.subtotalShippings = subtotalShippings;
		return this;
	}

	/**
	 * <p>subtotalDiscounts.</p>
	 *
	 * @param subtotalDiscounts a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> subtotalDiscounts(double subtotalDiscounts) {
		this.subtotalDiscounts = subtotalDiscounts;
		return this;
	}

	/**
	 * <p>total.</p>
	 *
	 * @param total a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> total(double total) {
		this.total = total;
		return this;
	}

	/**
	 * <p>totalDiscounts.</p>
	 *
	 * @param totalDiscounts a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> totalDiscounts(double totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
		return this;
	}

	/**
	 * <p>totalItems.</p>
	 *
	 * @param totalItems a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> totalItems(double totalItems) {
		this.totalItems = totalItems;
		return this;
	}

	/**
	 * <p>totalPaymentSystem.</p>
	 *
	 * @param totalPaymentSystem a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> totalPaymentSystem(double totalPaymentSystem) {
		this.totalPaymentSystem = totalPaymentSystem;
		return this;
	}

	/**
	 * <p>totalShippings.</p>
	 *
	 * @param totalShippings a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> totalShippings(double totalShippings) {
		this.totalShippings = totalShippings;
		return this;
	}

	/**
	 * <p>totalTaxes.</p>
	 *
	 * @param totalTaxes a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> totalTaxes(double totalTaxes) {
		this.totalTaxes = totalTaxes;
		return this;
	}

	/**
	 * <p>totalVouchers.</p>
	 *
	 * @param totalVouchers a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> totalVouchers(double totalVouchers) {
		this.totalVouchers = totalVouchers;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderTotal} object
	 */
	public OrderTotal build() {
		OrderTotalImpl totals = new OrderTotalImpl();
		totals.setSubtotal(subtotal);
		totals.setSubtotalItems(subtotalItems);
		totals.setSubtotalPaymentSystem(subtotalPaymentSystem);
		totals.setSubtotalShippings(subtotalShippings);
		totals.setTotal(total);
		totals.setTotalDiscounts(totalDiscounts);
		totals.setTotalItems(totalItems);
		totals.setTotalPaymentSystem(totalPaymentSystem);
		totals.setTotalShippings(totalShippings);
		totals.setTotalTaxes(totalTaxes);
		totals.setTotalVouchers(totalVouchers);
		return totals;
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
