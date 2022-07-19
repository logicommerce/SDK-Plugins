package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.models.Location;

/**
 * <p>OrderDeliveryPhysicalLocation interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderDeliveryPhysicalLocation {

	/**
	 * <p>getPhysicalLocationId.</p>
	 *
	 * @return a int
	 */
	int getPhysicalLocationId();

	/**
	 * <p>getPhysicalLocationPId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPhysicalLocationPId();

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * <p>getAddress.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getAddress();

	/**
	 * <p>getCity.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCity();

	/**
	 * <p>getState.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getState();

	/**
	 * <p>getPostalCode.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPostalCode();

	/**
	 * <p>getLocation.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.Location} object
	 */
	Location getLocation();	
}
