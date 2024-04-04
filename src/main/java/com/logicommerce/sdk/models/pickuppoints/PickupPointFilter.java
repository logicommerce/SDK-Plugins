package com.logicommerce.sdk.models.pickuppoints;

/**
 * <p>PickupPointFilter interface.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.6
 */
public interface PickupPointFilter {

	/**
	 * <p>getProviderId.</p>
	 *
	 * @return a {@link java.lang.Integer Integer} object
	 */
	int getProviderId();
	
	/**
	 * <p>getCountryCode.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getCountryCode();	
	
	/**
	 * <p>getPostalCode.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getPostalCode();

	/**
	 * <p>getCity.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getCity();
	
	/**
	 * <p>getLatitude.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getLatitude();

	/**
	 * <p>getLongitude.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getLongitude();
	
	/**
	 * <p>getRadius.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	double getRadius();
}
