package com.logicommerce.sdk.models;

/**
 * TaxCode collection
 *
 * @author Logicommerce
 * @since 1.3.0
 */
public class Pagination {

	private int total;

	private int page;

	private int perPage;

	private int totalPages;

	/**
	 * Constructor for Pagination.
	 */
	public Pagination() {}

	/**
	 * Constructor for Pagination.
	 *
	 * @param total a int
	 * @param page a int
	 * @param perPage a int
	 * @param totalPages a int
	 */
	public Pagination(int total, int page, int perPage, int totalPages) {
		this.total = total;
		this.page = page;
		this.perPage = perPage;
		this.totalPages = totalPages;
	}

	/**
	 * Getter for the field <code>total</code>.
	 * 
	 * @return a int
	 */
	public int getTotal() {
		return this.total;
	}

	/**
	 * Setter for the field <code>total</code>.
	 * 
	 * @param value a int
	 */
	public void setTotal(int value) {
		this.total = value;
	}

	/**
	 * Getter for the field <code>page</code>.
	 * 
	 * @return a int
	 */
	public int getPage() {
		return this.page;
	}

	/**
	 * Setter for the field <code>page</code>.
	 * 
	 * @param value a int
	 */
	public void setPage(int value) {
		this.page = value;
	}

	/**
	 * Getter for the field <code>perPage</code>.
	 * 
	 * @return a int
	 */
	public int getPerPage() {
		return this.perPage;
	}

	/**
	 * Setter for the field <code>perPage</code>.
	 * 
	 * @param value a int
	 */
	public void setPerPage(int value) {
		this.perPage = value;
	}

	/**
	 * Getter for the field <code>totalPages</code>.
	 * 
	 * @return a int
	 */
	public int getTotalPages() {
		return this.totalPages;
	}

	/**
	 * Setter for the field <code>totalPages</code>.
	 * 
	 * @param value a int
	 */
	public void setTotalPages(int value) {
		this.totalPages = value;
	}

}
