package com.logicommerce.sdk.models.order.list;

import com.logicommerce.sdk.enums.CustomerType;
import com.logicommerce.sdk.models.Location;

/**
 * Customer address of an order in order listings.
 *
 * @author LogiCommerce
 * @since 2.8.5
 */
public interface OrderListCustomerAddress {

	/**
	 * Returns the alias.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getAlias();

	/**
	 * Returns the first name.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getFirstName();

	/**
	 * Returns the last name.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getLastName();

	/**
	 * Returns the company.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCompany();

	/**
	 * Returns the address.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getAddress();

	/**
	 * Returns the address additional information.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getAddressAdditionalInformation();

	/**
	 * Returns the number.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getNumber();

	/**
	 * Returns the city.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCity();

	/**
	 * Returns the state.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getState();

	/**
	 * Returns the postal code.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPostalCode();

	/**
	 * Returns the vat.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getVat();

	/**
	 * Returns the nif.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getNif();

	/**
	 * Returns the location.
	 *
	 * @return a {@link com.logicommerce.sdk.models.Location} object
	 */
	Location getLocation();

	/**
	 * Returns the phone.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPhone();

	/**
	 * Returns the mobile.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getMobile();

	/**
	 * Returns the fax.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getFax();

	/**
	 * Returns the customer type.
	 *
	 * @return a {@link com.logicommerce.sdk.enums.CustomerType} object
	 */
	CustomerType getCustomerType();

	/**
	 * Returns the user address id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getUserAddressId();

}
