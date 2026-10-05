package com.logicommerce.sdk.models.basket;

/**
 * <p>The customer data of a basket or an order. Every field is null when unknown.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface CustomerView {

	/**
	 * Returns the customer's email.
	 *
	 * @return the email, or null
	 */
	String getEmail();

	/**
	 * Returns the customer's first name.
	 *
	 * @return the first name, or null
	 */
	String getFirstName();

	/**
	 * Returns the customer's last name.
	 *
	 * @return the last name, or null
	 */
	String getLastName();

	/**
	 * Returns the customer's phone.
	 *
	 * @return the phone, or null
	 */
	String getPhone();

}
