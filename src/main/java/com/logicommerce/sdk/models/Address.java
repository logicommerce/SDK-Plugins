package com.logicommerce.sdk.models;


/**
 * <p>Address interface. Get data of a address object.</p>
 *
 * @see com.logicommerce.sdk.models.UserAddress UserAddress
 * @author Logicommerce
 * @see com.logicommerce.sdk.models.Location Location
 * @since 1.0.16
 */
public interface Address {

	/**
	 * <p>Get name of address.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getName();

	/**
	 * <p>Get address value.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getAddress();

	/**
	 * <p>Get city of address.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getCity();

	/**
	 * <p>Get state of address.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getState();

	/**
	 * <p>Get postal code of address.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getPostalCode();

	/**
	 * <p>Get location object of address, this contains data about location.</p>
	 *
	 * @see com.logicommerce.sdk.models.Location Location
	 * @return a {@link com.logicommerce.sdk.models.Location Location} object
	 */
	Location getLocation();

	/**
	 * <p>Get fixed phone of the address.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getPhone();

	/**
	 * <p>Get mobile of the address.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getMobile();

}
