package com.logicommerce.sdk.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * CalculatedTaxes model builder
 * 
 * @author LogiCommerce
 * @see CalculatedTaxes
 * @since 1.3.0
 */
public class CalculatedTaxesBuilder {
	
	private String externalId;
	private double totalAmount;
	private double totalTaxable;
	private double totalTax;
	private List<CalculatedTaxRowBuilder> rows;

	/**
	 * Sets external identifier of the calculated taxes.
	 * @param externalId a {@link String} object
	 * @return a {@link CalculatedTaxesBuilder} object
	 */
	public CalculatedTaxesBuilder externalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	/**
	 * Sets total amount of the calculated taxes.
	 * @param totalAmount a double
	 * @return a {@link CalculatedTaxesBuilder} object
	 */
	public CalculatedTaxesBuilder totalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	/**
	 * Sets total taxable amount of the calculated taxes.
	 * @param totalTaxable a double
	 * @return a {@link CalculatedTaxesBuilder} object
	 */
	public CalculatedTaxesBuilder totalTaxable(double totalTaxable) {
		this.totalTaxable = totalTaxable;
		return this;
	}

	/**
	 * Sets total tax amount of the calculated taxes.
	 * @param totalTax a double
	 * @return a {@link CalculatedTaxesBuilder} object
	 */
	public CalculatedTaxesBuilder totalTax(double totalTax) {
		this.totalTax = totalTax;
		return this;
	}

	/**
	 * Adds a calculated tax row to the calculated taxes.
	 * @return a {@link CalculatedTaxRowBuilder} object
	 */
	public CalculatedTaxRowBuilder row() {
		CalculatedTaxRowBuilder row = new CalculatedTaxRowBuilder(this);
		if (this.rows == null) {
			this.rows = new ArrayList<>();
		}
		this.rows.add(row);
		return row;
	}

	/**
	 * Builds a {@link CalculatedTaxes} object.
	 * @return a {@link CalculatedTaxes} object
	 */
	public CalculatedTaxes build() {
		CalculatedTaxes calculatedTaxes = new CalculatedTaxes();
		calculatedTaxes.setExternalId(externalId);
		calculatedTaxes.setTotalAmount(totalAmount);
		calculatedTaxes.setTotalTaxable(totalTaxable);
		calculatedTaxes.setTotalTax(totalTax);
		if (rows != null) {
			calculatedTaxes.setRows(rows.stream()
				.map(CalculatedTaxRowBuilder::build)
				.collect(Collectors.toList()));
		}
		return calculatedTaxes;
	}

}
