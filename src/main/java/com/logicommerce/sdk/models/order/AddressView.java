package com.logicommerce.sdk.models.order;

/**
 * <p>A postal address of an order: the shipping address ({@link OrderView#getShippingAddress()}) or the address of a
 * pickup location ({@link PickupLocationView#getAddress()}). Every field is null when unknown.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface AddressView {

	/**
	 * Returns the first name of the addressee.
	 *
	 * @return the first name, or null
	 */
	String getFirstName();

	/**
	 * Returns the last name of the addressee.
	 *
	 * @return the last name, or null
	 */
	String getLastName();

	/**
	 * Returns the company.
	 *
	 * @return the company, or null
	 */
	String getCompany();

	/**
	 * Returns the street line: core's address followed by its number, when there is one.
	 *
	 * @return the street line, or null
	 */
	String getAddress();

	/**
	 * Returns the additional address information.
	 *
	 * @return the additional information, or null
	 */
	String getAddressAdditionalInformation();

	/**
	 * Returns the city.
	 *
	 * @return the city, or null
	 */
	String getCity();

	/**
	 * Returns the state or region name.
	 *
	 * @return the state, or null
	 */
	String getState();

	/**
	 * Returns the postal code.
	 *
	 * @return the postal code, or null
	 */
	String getPostalCode();

	/**
	 * Returns the country.
	 *
	 * @return the ISO 3166-1 alpha-2 code, or null
	 */
	String getCountryCode();

	/**
	 * Returns the phone.
	 *
	 * @return the phone, or null
	 */
	String getPhone();

}
