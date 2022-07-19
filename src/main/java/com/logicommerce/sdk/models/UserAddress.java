package com.logicommerce.sdk.models;


/**
 * <p>UserAddress interface. Get data of a user address. Extends address object.</p>
 *
 * @see	com.logicommerce.sdk.models.User User
 * @see com.logicommerce.sdk.models.Address Address
 * @author Logicommerce
 * @since 1.0.16
 */
public interface UserAddress extends Address {

	/**
	 * <p>Get is Default Address value, return true if this user address is the default user address for this user.</p>
	 *
	 * @see	com.logicommerce.sdk.models.Address Address
	 * @since 1.0.16
	 * @return a boolean
	 */
	boolean isDefaultAddress();

	/**
	 * <p>Get alias value of the user address.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getAlias();

	/**
	 * <p>Get user first name of the user address.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getFirstName();

	/**
	 * <p>Get user last name of the user address.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getLastName();

	/**
	 * <p>Get user company of the user address.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getCompany();

	/**
	 * <p>Get address additional information of the user address.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getAddressAdditionalInformation();

	/**
	 * <p>Get number of the user address.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getNumber();

	/**
	 * <p>Get fax of the user address.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getFax();

	/**
	 * <p>Get NIF of the user address.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getNif();

	/**
	 * <p>Get VAT of the user address.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getVat();

	/**
	 * <p>isTax. ????</p>
	 *
	 * @since 1.0.16
	 * @return a boolean
	 */
	boolean isTax();

	/**
	 * <p>isRe. ????</p>
	 *
	 * @since 1.0.16
	 * @return a boolean
	 */
	boolean isRe();

	/**
	 * <p>isReverseChargeVat. ????</p>
	 *
	 * @since 1.0.16
	 * @return a boolean
	 */
	boolean isReverseChargeVat();

}
