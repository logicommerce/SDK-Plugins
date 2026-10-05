package com.logicommerce.sdk.models.basket;

/**
 * <p>Customer data to set on a guest basket ({@link BasketChanges#getCustomer()}), with the storefront's guest
 * customer logic: email, names and phone, never an address. Build it with
 * {@link com.logicommerce.sdk.builders.basket.CustomerChangeBuilder}.</p>
 *
 * <p>A null field leaves the basket's value unchanged; an empty string clears it. An email that belongs to a
 * registered account (when the commerce identifies users by email) is not set, the basket's previous email is cleared,
 * and it is reported as a {@link com.logicommerce.sdk.enums.RejectionCode#CUSTOMER_EMAIL_REGISTERED} rejection; the
 * names and phone of the same change are still applied.</p>
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
