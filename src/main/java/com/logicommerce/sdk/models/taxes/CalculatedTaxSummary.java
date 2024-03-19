package com.logicommerce.sdk.models.taxes;

/**
 * CalculatedTaxSummary model
 * 
 * @since 1.3.0
 * @author LogiCommerce
 */
public class CalculatedTaxSummary {

	private String key;
	private double base;
	private double exempt;
	private double nonTaxable;
	private double taxRate;
	private double taxValue;

	/**
	 * Returns the key of the calculated tax summary.
	 * @return a {@link String} object
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the key of the calculated tax summary.
	 * @param key a {@link String} object
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Returns the base of the calculated tax summary.
	 * @return a double
	 */
	public double getBase() {
		return base;
	}

	/**
	 * Sets the base of the calculated tax summary.
	 * @param base a double
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * Returns the exempt of the calculated tax summary.
	 * @return a double
	 */
	public double getExempt() {
		return exempt;
	}

	/**
	 * Sets the exempt of the calculated tax summary.
	 * @param exempt a double
	 */
	public void setExempt(double exempt) {
		this.exempt = exempt;
	}

	/**
	 * Returns the non-taxable of the calculated tax summary.
	 * @return a double
	 */
	public double getNonTaxable() {
		return nonTaxable;
	}

	/**
	 * Sets the non-taxable of the calculated tax summary.
	 * @param nonTaxable a double
	 */
	public void setNonTaxable(double nonTaxable) {
		this.nonTaxable = nonTaxable;
	}

	/**
	 * Returns the tax rate of the calculated tax summary. The value is a percentage.
	 * @return a double
	 */
	public double getTaxRate() {
		return taxRate;
	}

	/**
	 * Sets the tax rate of the calculated tax summary. The value is a percentage.
	 * @param taxRate a double
	 */
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	/**
	 * Returns the tax value of the calculated tax summary.
	 * @return a double
	 */
	public double getTaxValue() {
		return taxValue;
	}

	/**
	 * Sets the tax value of the calculated tax summary.
	 * @param taxValue a double
	 */
	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}

}
