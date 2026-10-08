package com.logicommerce.sdk.models.basket;

/**
 * <p>Customer data to set on a guest basket: email, names and phone, never an address. A null field leaves the value
 * unchanged; an empty string clears it. Build it with
 * {@link com.logicommerce.sdk.builders.basket.CustomerChangeBuilder}.</p>
 *
 * <p>An email that belongs to a registered account is not set (the previous one is cleared) and is reported as a
 * {@link com.logicommerce.sdk.enums.RejectionCode#CUSTOMER_EMAIL_REGISTERED} rejection; the other fields are still
 * applied.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface CustomerChange {

	/**
	 * Returns the email to set.
	 *
	 * @return the email, or null to leave it unchanged
	 */
	String getEmail();

	/**
	 * Returns the first name to set.
	 *
	 * @return the first name, or null to leave it unchanged
	 */
	String getFirstName();

	/**
	 * Returns the last name to set.
	 *
	 * @return the last name, or null to leave it unchanged
	 */
	String getLastName();

	/**
	 * Returns the phone to set.
	 *
	 * @return the phone, or null to leave it unchanged
	 */
	String getPhone();

}
