package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.GeographicalZone;

/**
 * <p>GeographicalZoneImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class GeographicalZoneImpl implements GeographicalZone {

	private int countryId;
	
	private int locationId;

	/**
	 * <p>Getter for the field <code>countryId</code>.</p>
	 *
	 * @return a int
	 */
	public int getCountryId() {
		return countryId;
	}

	/**
	 * <p>Getter for the field <code>locationId</code>.</p>
	 *
	 * @return a int
	 */
	public int getLocationId() {
		return locationId;
	}

	/**
	 * <p>Setter for the field <code>countryId</code>.</p>
	 *
	 * @param countryId a int
	 */
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	/**
	 * <p>Setter for the field <code>locationId</code>.</p>
	 *
	 * @param locationId a int
	 */
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
}
