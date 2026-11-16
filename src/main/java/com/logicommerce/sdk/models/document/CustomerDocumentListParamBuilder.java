package com.logicommerce.sdk.models.document;

import java.time.LocalDateTime;

/**
 * <p>Builder of {@link CustomerDocumentListParam}. By default it asks for the first page of 25 documents.</p>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public class CustomerDocumentListParamBuilder {

	private int page = 1;

	private int perPage = 25;

	private String email;

	private LocalDateTime fromDate;

	private LocalDateTime toDate;

	/**
	 * Sets the page, starting at 1.
	 *
	 * @param page an int
	 * @return this builder
	 */
	public CustomerDocumentListParamBuilder page(int page) {
		this.page = page;
		return this;
	}

	/**
	 * Sets the number of documents per page.
	 *
	 * @param perPage an int
	 * @return this builder
	 */
	public CustomerDocumentListParamBuilder perPage(int perPage) {
		this.perPage = perPage;
		return this;
	}

	/**
	 * Sets the customer email.
	 *
	 * @param email a {@link java.lang.String} object
	 * @return this builder
	 */
	public CustomerDocumentListParamBuilder email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Sets the inclusive lower bound of the document date.
	 *
	 * @param fromDate a {@link java.time.LocalDateTime} object
	 * @return this builder
	 */
	public CustomerDocumentListParamBuilder fromDate(LocalDateTime fromDate) {
		this.fromDate = fromDate;
		return this;
	}

	/**
	 * Sets the inclusive upper bound of the document date.
	 *
	 * @param toDate a {@link java.time.LocalDateTime} object
	 * @return this builder
	 */
	public CustomerDocumentListParamBuilder toDate(LocalDateTime toDate) {
		this.toDate = toDate;
		return this;
	}

	/**
	 * Builds the param.
	 *
	 * @return a new {@link CustomerDocumentListParam}
	 */
	public CustomerDocumentListParam build() {
		CustomerDocumentListParam param = new CustomerDocumentListParam();
		param.setPage(page);
		param.setPerPage(perPage);
		param.setEmail(email);
		param.setFromDate(fromDate);
		param.setToDate(toDate);
		return param;
	}

}
