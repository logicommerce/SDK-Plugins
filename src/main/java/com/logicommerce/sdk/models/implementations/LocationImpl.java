package com.logicommerce.sdk.models.implementations;

import com.logicommerce.sdk.models.Location;

/**
 * <p>LocationImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class LocationImpl implements Location {

	private String country;

	private Integer locationId;

	private Double latitude;

	private Double longitude;

	/**
	 * <p>Getter for the field <code>country</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <p>Getter for the field <code>locationId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * <p>Getter for the field <code>latitude</code>.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * <p>Getter for the field <code>longitude</code>.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * <p>Setter for the field <code>country</code>.</p>
	 *
	 * @param country a {@link java.lang.String} object
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * <p>Setter for the field <code>locationId</code>.</p>
	 *
	 * @param locationId a {@link java.lang.Integer} object
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	/**
	 * <p>Setter for the field <code>latitude</code>.</p>
	 *
	 * @param latitude a {@link java.lang.Double} object
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * <p>Setter for the field <code>longitude</code>.</p>
	 *
	 * @param longitude a {@link java.lang.Double} object
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
}
