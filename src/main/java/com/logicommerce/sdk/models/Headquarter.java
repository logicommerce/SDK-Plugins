package com.logicommerce.sdk.models;

/**
 * Headquarter interface
 * 
 * @see com.logicommerce.sdk.models.Address Address
 * @since 1.3.3
 */
public interface Headquarter extends Address {

	/**
	 * Get the headquarter email
	 * 
	 * @since 1.3.3
	 * @return a {@link java.lang.String String} object
	 */
	String getEmail();
	
	/**
	 * Get the headquarter VAT
	 *
	 * @since 1.3.3
	 * @return a {@link java.lang.String String} object
	 */
	String getVat();

	/**
	 * Get the headquarter timezone
	 *
	 * @since 1.3.3
	 * @return a {@link java.lang.String String} object
	 */
	String getTimezone();

	/**
	 * Get the headquarter locale
	 *
	 * @since 1.3.3
	 * @return a {@link java.lang.String String} object
	 */
	String getLocale();

}
