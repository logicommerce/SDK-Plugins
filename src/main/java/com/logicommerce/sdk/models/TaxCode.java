package com.logicommerce.sdk.models;

/**
 * TaxCode model
 *
 * @author Logicommerce
 * @since 1.3.0
 */
public class TaxCode {
	
	private String code;

	private String description;

	/**
	 * Constructor for TaxCode.
	 */
	public TaxCode() {
	}

	/**
	 * Constructor for TaxCode.
	 *
	 * @param code a {@link String} object.
	 * @param description a {@link String} object.
	 */
	public TaxCode(String code, String description) {
		this.code = code;
		this.description = description;
	}

	/**
	 * Getter for the field <code>code</code>.
	 * 
	 * @return a {@link String} object.
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * Setter for the field <code>code</code>.
	 * 
	 * @param value a {@link String} object.
	 */
	public void setCode(String value) {
		this.code = value;
	}

	/**
	 * Getter for the field <code>description</code>.
	 * 
	 * @return a {@link String} object.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Setter for the field <code>description</code>.
	 * 
	 * @param value a {@link String} object.
	 */
	public void setDescription(String value) {
		this.description = value;
	}
}
