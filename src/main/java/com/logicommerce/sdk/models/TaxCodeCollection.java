package com.logicommerce.sdk.models;

import java.util.List;

/**
 * TaxCode collection
 *
 * @author Logicommerce
 * @since 1.3.0
 */
public class TaxCodeCollection {

	private Pagination pagination;
	
	private List<TaxCode> taxCodes;

	/**
	 * Constructor for TaxCodeCollection.
	 */
	public TaxCodeCollection() {
	}

	/**
	 * Constructor for TaxCodeCollection.
	 *
	 * @param pagination a {@link Pagination} object.
	 * @param taxCodes a {@link List}&lt;{@link TaxCode}&gt; object.
	 */
	public TaxCodeCollection(Pagination pagination, List<TaxCode> taxCodes) {
		this.pagination = pagination;
		this.taxCodes = taxCodes;
	}

	/**
	 * Getter for the field <code>pagination</code>.
	 * 
	 * @return a {@link Pagination} object.
	 */
	public Pagination getPagination() {
		return this.pagination;
	}

	/**
	 * Setter for the field <code>pagination</code>.
	 * 
	 * @param value a {@link Pagination} object.
	 */
	public void setPagination(Pagination value) {
		this.pagination = value;
	}

	/**
	 * Getter for the field <code>taxCodes</code>.
	 * 
	 * @return a {@link List}&lt;{@link TaxCode}&gt; object.
	 */
	public List<TaxCode> getTaxCodes() {
		return this.taxCodes;
	}

	/**
	 * Setter for the field <code>taxCodes</code>.
	 * 
	 * @param value a {@link List}&lt;{@link TaxCode}&gt; object.
	 */
	public void setTaxCodes(List<TaxCode> value) {
		this.taxCodes = value;
	}
}
