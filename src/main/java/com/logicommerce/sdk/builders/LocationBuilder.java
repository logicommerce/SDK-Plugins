package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.Location;
import com.logicommerce.sdk.models.implementations.LocationImpl;

/**
 * <p>LocationBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class LocationBuilder<T> {

	private T parentBuilder;

	protected String country;

	protected Integer locationId;

	protected Double latitude = 0d;

	protected Double longitude = 0d;

	protected String stateCode;

	protected String name;


	/**
	 * <p>Constructor for LocationBuilder.</p>
	 */
	public LocationBuilder() {}

	/**
	 * <p>Constructor for LocationBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public LocationBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>country.</p>
	 *
	 * @param country a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.LocationBuilder} object
	 */
	public LocationBuilder<T> country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * <p>locationId.</p>
	 *
	 * @param locationId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.LocationBuilder} object
	 */
	public LocationBuilder<T> locationId(Integer locationId) {
		this.locationId = locationId;
		return this;
	}

	/**
	 * <p>latitude.</p>
	 *
	 * @param latitude a {@link java.lang.Double} object
	 * @return a {@link com.logicommerce.sdk.builders.LocationBuilder} object
	 */
	public LocationBuilder<T> latitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	/**
	 * <p>longitude.</p>
	 *
	 * @param longitude a {@link java.lang.Double} object
	 * @return a {@link com.logicommerce.sdk.builders.LocationBuilder} object
	 */
	public LocationBuilder<T> longitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}


	/**
	 * <p>stateCode.</p>
	 *
	 * @param stateCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.LocationBuilder} object
	 */
	public LocationBuilder<T> stateCode(String stateCode) {
		this.stateCode = stateCode;
		return this;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.LocationBuilder} object
	 */
	public LocationBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.Location} object
	 */
	public Location build() {
		LocationImpl location = new LocationImpl();
		location.setCountry(country);
		location.setLocationId(locationId);
		location.setLatitude(latitude);
		location.setLongitude(longitude);
		location.setStateCode(stateCode);
		location.setName(name);
		return location;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
