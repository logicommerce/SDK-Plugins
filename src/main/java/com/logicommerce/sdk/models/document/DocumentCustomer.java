package com.logicommerce.sdk.models.document;

/**
 * <p>The customer of a {@link CustomerDocument}, as stored in the document.</p>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public interface DocumentCustomer {

	/**
	 * Returns the customer email.
	 *
	 * @return the email
	 */
	String getEmail();

	/**
	 * Returns the first name of the invoicing address.
	 *
	 * @return the first name, or null when it is not set
	 */
	String getFirstName();

	/**
	 * Returns the last name of the invoicing address.
	 *
	 * @return the last name, or null when it is not set
	 */
	String getLastName();

	/**
	 * Returns the company of the invoicing address.
	 *
	 * @return the company, or null when it is not set
	 */
	String getCompany();

}
