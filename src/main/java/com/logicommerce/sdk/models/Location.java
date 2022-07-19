package com.logicommerce.sdk.models;

/**
 * <p>Location interface.</p>
 *
 * @see com.logicommerce.sdk.models.Address Address
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Location {

	/**
	 * <p>Get country of the location.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getCountry();

	/**
	 * <p>Get locationId of the location internal identifier value.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Integer Integer} object
	 */
	Integer getLocationId();

	/**
	 * <p>Get latitude value of the location.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Double Double} object
	 */
	Double getLatitude();

	/**
	 * <p>Get longitude value of the location.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Double Double} object
	 */
	Double getLongitude();

}
