package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.TaxRowType;

/**
 * CalculatedTaxRow model
 * 
 * @author LogiCommerce
 * @since 1.3.0
 */
public class CalculatedTaxRow {

	private String itemHash;
	private TaxRowType type;
	private String taxCode;

	private int quantity;
	private double amount;
	private double taxableAmount;
	private double taxRate;
	private double taxAmount;

	/**
	 * Returns the internal identifier of the calculated tax row.
	 * @return a {@link String} object
	 */
	public String getItemHash() {
		return itemHash;
	}

	/**
	 * Sets the internal identifier of the calculated tax row.
	 * @param itemHash a {@link String} object
	 */
	public void setItemHash(String itemHash) {
		this.itemHash = itemHash;
	}

	/**
	 * Returns the type of the calculated tax row.
	 * @return a {@link TaxRowType} object
	 */
	public TaxRowType getType() {
		return type;
	}

	/**
	 * Sets the type of the calculated tax row.
	 * @param type a {@link TaxRowType} object
	 */
	public void setType(TaxRowType type) {
		this.type = type;
	}

	/**
	 * Returns the tax code of the calculated tax row.
	 * @return a {@link String} object
	 */
	public String getTaxCode() {
		return taxCode;
	}

	/**
	 * Sets the tax code of the calculated tax row.
	 * @param taxCode a {@link String} object
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	/**
	 * Returns the quantity of the calculated tax row.
	 * @return a int
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity of the calculated tax row.
	 * @param quantity a int
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Returns the amount of the calculated tax row.
	 * @return a double
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Sets the amount of the calculated tax row.
	 * @param amount a double
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * Returns the taxable amount of the calculated tax row.
	 * @return a double
	 */
	public double getTaxableAmount() {
		return taxableAmount;
	}

	/**
	 * Sets the taxable amount of the calculated tax row.
	 * @param taxableAmount a double
	 */
	public void setTaxableAmount(double taxableAmount) {
		this.taxableAmount = taxableAmount;
	}

	/**
	 * Returns the tax rate of the calculated tax row.
	 * @return a double
	 */
	public double getTaxRate() {
		return taxRate;
	}

	/**
	 * Sets the tax rate of the calculated tax row.
	 * @param taxRate a double
	 */
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	/**
	 * Returns the tax amount of the calculated tax row.
	 * @return a double
	 */
	public double getTaxAmount() {
		return taxAmount;
	}

	/**
	 * Sets the tax amount of the calculated tax row.
	 * @param taxAmount a double
	 */
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

}
