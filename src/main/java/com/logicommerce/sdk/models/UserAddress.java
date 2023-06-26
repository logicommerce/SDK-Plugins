package com.logicommerce.sdk.models;


/**
 * UserAddress interface. Get data of a user address. Extends address object.
 *
 * @see	com.logicommerce.sdk.models.User User
 * @see com.logicommerce.sdk.models.Address Address
 * @author Logicommerce
 * @since 1.0.16
 */
public interface UserAddress extends Address {

	/**
	 * Get is Default Address value, return true if this user address is the default user address for this user.
	 *
	 * @see	Address Address
	 * @since 1.0.16
	 * @return a boolean
	 */
	boolean isDefaultAddress();

	/**
	 * Get alias value of the user address.
	 *
	 * @since 1.0.16
	 * @return a {@link String String} object
	 */
	String getAlias();

	/**
	 * Get user first name of the user address.
	 *
	 * @since 1.0.16
	 * @return a {@link String String} object
	 */
	String getFirstName();

	/**
	 * Get user last name of the user address.
	 *
	 * @since 1.0.16
	 * @return a {@link String String} object
	 */
	String getLastName();

	/**
	 * Get user company of the user address.
	 *
	 * @since 1.0.16
	 * @return a {@link String String} object
	 */
	String getCompany();

	/**
	 * Get address additional information of the user address.
	 *
	 * @since 1.0.16
	 * @return a {@link String String} object
	 */
	String getAddressAdditionalInformation();

	/**
	 * Get number of the user address.
	 *
	 * @since 1.0.16
	 * @return a {@link String String} object
	 */
	String getNumber();

	/**
	 * Get NIF of the user address.
	 *
	 * @since 1.0.16
	 * @return a {@link String String} object
	 */
	String getNif();

	/**
	 * Get VAT of the user address.
	 *
	 * @since 1.0.16
	 * @return a {@link String String} object
	 */
	String getVat();

	/**
	 * Get is Tax.
	 *
	 * @since 1.0.16
	 * @return a boolean
	 */
	boolean isTax();

	/**
	 * Get is RE.
	 *
	 * @since 1.0.16
	 * @return a boolean
	 */
	boolean isRe();

}
