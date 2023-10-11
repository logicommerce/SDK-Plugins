package com.logicommerce.sdk.models.taxes;

/**
 * CalculatedTaxSummary model builder
 * 
 * @author LogiCommerce
 * @see CalculatedTaxSummary
 * @since 1.3.0
 */
public class CalculatedTaxSummaryBuilder {

	private CalculatedTaxesBuilder parentBuilder;
	private String key;
	private double base;
	private double exempt;
	private double nonTaxable;
	private double taxRate;
	private double taxValue;

	/**
	 * Default constructor
	 */
	public CalculatedTaxSummaryBuilder() {
		
	}

	/**
	 * Constructor with parent builder
	 * @param parentBuilder a {@link CalculatedTaxesBuilder} object
	 */
	public CalculatedTaxSummaryBuilder(CalculatedTaxesBuilder parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the key identifier of the calculated tax summary.
	 * @param key a {@link String} object
	 * @return a {@link CalculatedTaxSummaryBuilder} object
	 */
	public CalculatedTaxSummaryBuilder key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Sets the base of the calculated tax summary.
	 * @param base a double
	 * @return a {@link CalculatedTaxSummaryBuilder} object
	 */
	public CalculatedTaxSummaryBuilder base(double base) {
		this.base = base;
		return this;
	}

	/**
	 * Sets the exempt of the calculated tax summary.
	 * @param exempt a double
	 * @return a {@link CalculatedTaxSummaryBuilder} object
	 */
	public CalculatedTaxSummaryBuilder exempt(double exempt) {
		this.exempt = exempt;
		return this;
	}

	/**
	 * Sets the non-taxable of the calculated tax summary.
	 * @param nonTaxable a double
	 * @return a {@link CalculatedTaxSummaryBuilder} object
	 */
	public CalculatedTaxSummaryBuilder nonTaxable(double nonTaxable) {
		this.nonTaxable = nonTaxable;
		return this;
	}

	/**
	 * Sets the tax rate of the calculated tax summary.
	 * @param taxRate a double
	 * @return a {@link CalculatedTaxSummaryBuilder} object
	 */
	public CalculatedTaxSummaryBuilder taxRate(double taxRate) {
		this.taxRate = taxRate;
		return this;
	}

	/**
	 * Sets the tax value of the calculated tax summary.
	 * @param taxValue a double
	 * @return a {@link CalculatedTaxSummaryBuilder} object
	 */
	public CalculatedTaxSummaryBuilder taxValue(double taxValue) {
		this.taxValue = taxValue;
		return this;
	}

	/**
	 * Builds the calculated tax summary
	 * @return a {@link CalculatedTaxSummary} object
	 */
	public CalculatedTaxSummary build() {
		CalculatedTaxSummary calculatedTaxSummary = new CalculatedTaxSummary();
		calculatedTaxSummary.setKey(key);
		calculatedTaxSummary.setBase(base);
		calculatedTaxSummary.setExempt(exempt);
		calculatedTaxSummary.setNonTaxable(nonTaxable);
		calculatedTaxSummary.setTaxRate(taxRate);
		calculatedTaxSummary.setTaxValue(taxValue);
		return calculatedTaxSummary;
	}

	/**
	 * Returns the parent builder
	 * @return a {@link CalculatedTaxesBuilder} object
	 */
	public CalculatedTaxesBuilder done() {
		return parentBuilder;
	}

}
