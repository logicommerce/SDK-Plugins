package com.logicommerce.sdk.models.taxes;

import java.util.List;

/**
 * CalculatedTaxes model
 * 
 * @author Logicommerce
 * @since 1.3.0
 */
public class CalculatedTaxes {
	
	private String externalId;
	private double totalAmount;
	private double totalTaxable;
	private double totalTax;
	private List<CalculatedTaxRow> rows;
	private List<CalculatedTaxSummary> summary;

	/**
	 * Returns external identifier of the calculated taxes.
	 * @return a {@link String} object
	 */
	public String getExternalId() {
		return externalId;
	}

	/**
	 * Sets external identifier of the calculated taxes.
	 * @param externalId a {@link String} object
	 */
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * Returns total amount of the calculated taxes.
	 * @return a double
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * Sets total amount of the calculated taxes.
	 * @param totalAmount a double
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * Returns total taxable amount of the calculated taxes.
	 * @return a double
	 */
	public double getTotalTaxable() {
		return totalTaxable;
	}

	/**
	 * Sets total taxable amount of the calculated taxes.
	 * @param totalTaxable a double
	 */
	public void setTotalTaxable(double totalTaxable) {
		this.totalTaxable = totalTaxable;
	}

	/**
	 * Returns total tax amount of the calculated taxes.
	 * @return a double
	 */
	public double getTotalTax() {
		return totalTax;
	}

	/**
	 * Sets total tax amount of the calculated taxes.
	 * @param totalTax a double
	 */
	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	/**
	 * Returns list of calculated tax rows.
	 * @return a {@link List}&lt;{@link CalculatedTaxRow}&gt; object
	 */
	public List<CalculatedTaxRow> getRows() {
		return rows;
	}

	/**
	 * Sets list of calculated tax rows.
	 * @param rows a {@link List}&lt;{@link CalculatedTaxRow}&gt; object
	 */
	public void setRows(List<CalculatedTaxRow> rows) {
		this.rows = rows;
	}

	/**
	 * Returns list of calculated tax summary.
	 * @return a {@link List}&lt;{@link CalculatedTaxSummary}&gt; object
	 */
	public List<CalculatedTaxSummary> getSummary() {
		return summary;
	}

	/**
	 * Sets list of calculated tax summary.
	 * @param summary a {@link List}&lt;{@link CalculatedTaxSummary}&gt; object
	 */
	public void setSummary(List<CalculatedTaxSummary> summary) {
		this.summary = summary;
	}
}
