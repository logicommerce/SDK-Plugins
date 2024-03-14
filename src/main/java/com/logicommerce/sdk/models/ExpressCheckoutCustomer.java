package com.logicommerce.sdk.models;

/**
 * This interface represents an express checkout customer.
 * 
 * @author LogiCommerce
 * @since 1.3.5
 */
public interface ExpressCheckoutCustomer {

	/**
	 * Gets the email of the customer.
	 *
	 * @return the email of the customer
	 */
	String getEmail();

	/**
	 * Gets the first name of the customer.
	 *
	 * @return the first name of the customer
	 */
	String getFirstName();

	/**
	 * Gets the last name of the customer.
	 *
	 * @return the last name of the customer
	 */
	String getLastName();

	/**
	 * Gets the billing address of the customer.
	 *
	 * @return the billing address of the customer
	 */
	Address getBillingAddress();

	/**
	 * Gets the shipping address of the customer.
	 *
	 * @return the shipping address of the customer
	 */
	Address getShippingAddress();
}
