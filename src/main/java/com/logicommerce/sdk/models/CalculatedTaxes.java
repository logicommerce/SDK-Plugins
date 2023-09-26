package com.logicommerce.sdk.models;

import java.util.List;

public class CalculatedTaxes {
	
	private String id;

	private double totalAmount;

	private double totalTaxable;

	private double totalTax;

	private List<CalculatedTaxRow> rows;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getTotalTaxable() {
		return totalTaxable;
	}

	public void setTotalTaxable(double totalTaxable) {
		this.totalTaxable = totalTaxable;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	public List<CalculatedTaxRow> getRows() {
		return rows;
	}

	public void setRows(List<CalculatedTaxRow> rows) {
		this.rows = rows;
	}

	
}
