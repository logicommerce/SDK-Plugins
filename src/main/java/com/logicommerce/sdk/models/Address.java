package com.logicommerce.sdk.models;

/**
 * The Address interface represents a physical address.
 * 
 * @author Logicommerce
 * @since 1.3.5
 */
public interface Address {

	/**
	 * Gets the name associated with the address.
	 *
	 * @return the name associated with the address
	 */
	String getName();

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	String getAddress();

	/**
	 * Gets the number associated with the address.
	 *
	 * @return the number associated with the address
	 */
	String getNumber();

	/**
	 * Gets additional information about the address.
	 *
	 * @return additional information about the address
	 */
	String getAddressAdditionalInformation();

	/**
	 * Gets the city of the address.
	 *
	 * @return the city of the address
	 */
	String getCity();

	/**
	 * Gets the state of the address.
	 *
	 * @return the state of the address
	 */
	String getState();

	/**
	 * Gets the postal code of the address.
	 *
	 * @return the postal code of the address
	 */
	String getPostalCode();

	/**
	 * Gets the location of the address.
	 *
	 * @return the location of the address
	 */
	Location getLocation();

	/**
	 * Gets the phone number associated with the address.
	 *
	 * @return the phone number associated with the address
	 */
	String getPhone();

	/**
	 * Gets the mobile number associated with the address.
	 *
	 * @return the mobile number associated with the address
	 */
	String getMobile();

}
