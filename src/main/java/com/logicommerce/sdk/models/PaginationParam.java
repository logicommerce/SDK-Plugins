package com.logicommerce.sdk.models;

/**
 * Generic pagination param.
 *
 * @author LogiCommerce
 * @since 2.8.5
 */
public class PaginationParam {

	private int page = 1;

	private int perPage = 25;

	/**
	 * Returns the page number, starting at 1.
	 *
	 * @return an int
	 */
	public int getPage() {
		return page;
	}

	/**
	 * Sets the page number, starting at 1.
	 *
	 * @param page an int
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * Returns the number of elements per page.
	 *
	 * @return an int
	 */
	public int getPerPage() {
		return perPage;
	}

	/**
	 * Sets the number of elements per page.
	 *
	 * @param perPage an int
	 */
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

}
