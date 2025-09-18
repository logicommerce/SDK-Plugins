package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderTax;
import com.logicommerce.sdk.models.order.implementations.OrderTaxImpl;

/**
 * <p>OrderTaxBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderTaxBuilder<T> {

	private T parentBuilder;

	protected double taxRate;

	protected double reRate;

	protected double base;

	protected double taxPrice;

	protected double rePrice;

	protected double totalPrice;

	protected double baseWithoutDiscounts;

	protected double discount;

	protected String code;

	protected String name;

	protected Integer taxId;

	/**
	 * <p>Constructor for OrderTaxBuilder.</p>
	 */
	public OrderTaxBuilder() {

	}

	/**
	 * <p>Constructor for OrderTaxBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderTaxBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>taxRate.</p>
	 *
	 * @param taxRate a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> taxRate(double taxRate) {
		this.taxRate = taxRate;
		return this;
	}

	/**
	 * <p>reRate.</p>
	 *
	 * @param reRate a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> reRate(double reRate) {
		this.reRate = reRate;
		return this;
	}

	/**
	 * <p>base.</p>
	 *
	 * @param base a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> base(double base) {
		this.base = base;
		return this;
	}

	/**
	 * <p>taxPrice.</p>
	 *
	 * @param taxPrice a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> taxPrice(double taxPrice) {
		this.taxPrice = taxPrice;
		return this;
	}

	/**
	 * <p>rePrice.</p>
	 *
	 * @param rePrice a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> rePrice(double rePrice) {
		this.rePrice = rePrice;
		return this;
	}

	/**
	 * <p>totalPrice.</p>
	 *
	 * @param totalPrice a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> totalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
		return this;
	}

	/**
	 * <p>baseWithoutDiscounts.</p>
	 *
	 * @param baseWithoutDiscounts a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> baseWithoutDiscounts(double baseWithoutDiscounts) {
		this.baseWithoutDiscounts = baseWithoutDiscounts;
		return this;
	}

	/**
	 * <p>discount.</p>
	 *
	 * @param discount a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> discount(double discount) {
		this.discount = discount;
		return this;
	}

	/**
	 * <p>code.</p>
	 *
	 * @param code a {@link String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * <p>name. </p>
	 *
	 * @since 2.5.2
	 * @param name a {@link String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>taxId. </p>
	 *
	 * @since 2.5.2
	 * @param taxId a {@link Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> taxId(Integer taxId) {
		this.taxId = taxId;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderTax} object
	 */
	public OrderTax build() {
		OrderTaxImpl information = new OrderTaxImpl();
		information.setTaxRate(taxRate);
		information.setReRate(reRate);
		information.setBase(base);
		information.setTaxPrice(taxPrice);
		information.setRePrice(rePrice);
		information.setTotalPrice(totalPrice);
		information.setBaseWithoutDiscounts(baseWithoutDiscounts);
		information.setDiscount(discount);
		information.setCode(code);
		information.setName(name);
		information.setTaxId(taxId);
		return information;
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
