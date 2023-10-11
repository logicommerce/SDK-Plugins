package com.logicommerce.sdk.models.taxes;

import com.logicommerce.sdk.enums.TaxRowType;

/**
 * CalculatedTaxRow model builder
 * 
 * @author LogiCommerce
 * @see CalculatedTaxRow
 * @since 1.3.0
 */
public class CalculatedTaxRowBuilder {

	private CalculatedTaxesBuilder parentBuilder;
	private String itemHash;
	private TaxRowType type;
	private String taxCode;
	private int quantity;
	private double amount;
	private double taxableAmount;
	private double taxRate;
	private double taxAmount;

	/**
	 * Default constructor
	 */
	public CalculatedTaxRowBuilder() {}

	/**
	 * Constructor with parent builder
	 * @param parentBuilder a {@link CalculatedTaxesBuilder} object
	 */
	public CalculatedTaxRowBuilder(CalculatedTaxesBuilder parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the internal identifier of the calculated tax row.
	 * @param itemHash a {@link String} object
	 * @return a {@link CalculatedTaxRowBuilder} object
	 */
	public CalculatedTaxRowBuilder itemHash(String itemHash) {
		this.itemHash = itemHash;
		return this;
	}

	/**
	 * Sets the type of the calculated tax row.
	 * @param type a {@link TaxRowType} object
	 * @return a {@link CalculatedTaxRowBuilder} object
	 */
	public CalculatedTaxRowBuilder type(TaxRowType type) {
		this.type = type;
		return this;
	}

	/**
	 * Sets the tax code of the calculated tax row.
	 * @param taxCode a {@link String} object
	 * @return a {@link CalculatedTaxRowBuilder} object
	 */
	public CalculatedTaxRowBuilder taxCode(String taxCode) {
		this.taxCode = taxCode;
		return this;
	}

	/**
	 * Sets the quantity of the calculated tax row.
	 * @param quantity an int
	 * @return a {@link CalculatedTaxRowBuilder} object
	 */
	public CalculatedTaxRowBuilder quantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * Sets the amount of the calculated tax row.
	 * @param amount a double
	 * @return a {@link CalculatedTaxRowBuilder} object
	 */
	public CalculatedTaxRowBuilder amount(double amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Sets the taxable amount of the calculated tax row.
	 * @param taxableAmount a double
	 * @return a {@link CalculatedTaxRowBuilder} object
	 */
	public CalculatedTaxRowBuilder taxableAmount(double taxableAmount) {
		this.taxableAmount = taxableAmount;
		return this;
	}

	/**
	 * Sets the tax rate of the calculated tax row.
	 * @param taxRate a double
	 * @return a {@link CalculatedTaxRowBuilder} object
	 */
	public CalculatedTaxRowBuilder taxRate(double taxRate) {
		this.taxRate = taxRate;
		return this;
	}

	/**
	 * Sets the tax amount of the calculated tax row.
	 * @param taxAmount a double
	 * @return a {@link CalculatedTaxRowBuilder} object
	 */
	public CalculatedTaxRowBuilder taxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
		return this;
	}

	/**
	 * Builds the calculated tax row.
	 * @return a {@link CalculatedTaxRow} object
	 */
	public CalculatedTaxRow build() {
		CalculatedTaxRow row = new CalculatedTaxRow();
		row.setItemHash(this.itemHash);
		row.setType(this.type);
		row.setTaxCode(this.taxCode);
		row.setQuantity(this.quantity);
		row.setAmount(this.amount);
		row.setTaxableAmount(this.taxableAmount);
		row.setTaxRate(this.taxRate);
		row.setTaxAmount(this.taxAmount);
		return row;
	}

	/**
	 * Returns the parent builder.
	 * @return a {@link CalculatedTaxesBuilder} object
	 */
	public CalculatedTaxesBuilder done() {
		return this.parentBuilder;
	}

}
