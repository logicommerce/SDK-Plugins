package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderTax;

/**
 * <p>OrderTaxImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderTaxImpl implements OrderTax {

	private double taxRate;

	private double reRate;

	private double base;

	private double taxPrice;

	private double rePrice;

	private double totalPrice;

	private double baseWithoutDiscounts;

	private double discount;

	private String code;

	private String name;

	private Integer taxId;

	/** {@inheritDoc} */
	@Override
	public double getTaxRate() {
		return taxRate;
	}

	/** {@inheritDoc} */
	@Override
	public double getReRate() {
		return reRate;
	}

	/** {@inheritDoc} */
	@Override
	public double getBase() {
		return base;
	}

	/** {@inheritDoc} */
	@Override
	public double getTaxPrice() {
		return taxPrice;
	}

	/** {@inheritDoc} */
	@Override
	public double getRePrice() {
		return rePrice;
	}

	/** {@inheritDoc} */
	@Override
	public double getTotalPrice() {
		return totalPrice;
	}

	/** {@inheritDoc} */
	@Override
	public double getBaseWithoutDiscounts() {
		return baseWithoutDiscounts;
	}

	/** {@inheritDoc} */
	@Override
	public double getDiscount() {
		return discount;
	}

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return name;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getTaxId() {
		return taxId;
	}

	/**
	 * <p>Setter for the field <code>taxRate</code>.</p>
	 *
	 * @param taxRate a double
	 */
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	/**
	 * <p>Setter for the field <code>reRate</code>.</p>
	 *
	 * @param reRate a double
	 */
	public void setReRate(double reRate) {
		this.reRate = reRate;
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
	 * <p>Setter for the field <code>taxPrice</code>.</p>
	 *
	 * @param taxPrice a double
	 */
	public void setTaxPrice(double taxPrice) {
		this.taxPrice = taxPrice;
	}

	/**
	 * <p>Setter for the field <code>rePrice</code>.</p>
	 *
	 * @param rePrice a double
	 */
	public void setRePrice(double rePrice) {
		this.rePrice = rePrice;
	}

	/**
	 * <p>Setter for the field <code>totalPrice</code>.</p>
	 *
	 * @param totalPrice a double
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * <p>Setter for the field <code>baseWithoutDiscounts</code>.</p>
	 *
	 * @param baseWithoutDiscounts a double
	 */
	public void setBaseWithoutDiscounts(double baseWithoutDiscounts) {
		this.baseWithoutDiscounts = baseWithoutDiscounts;
	}

	/**
	 * <p>Setter for the field <code>discount</code>.</p>
	 *
	 * @param discount a double
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 * 
	 * @since 1.3.0
	 * @return a {@link String} object
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 * 
	 * @since 1.3.0
	 * @param code a {@link String} object
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>
	 * Setter for the field <code>name</code>.
	 * </p>
	 * 
	 * @since 2.4.0
	 * @param name a {@link String} object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>
	 * Setter for the field <code>taxId</code>.
	 * </p>
	 * 
	 * @since 2.4.0
	 * @param taxId a {@link Integer} object
	 */
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
}
