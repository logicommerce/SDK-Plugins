package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.Location;
import com.logicommerce.sdk.models.implementations.LocationImpl;

public class LocationBuilder<T> {
	
	private T parentBuilder;

	protected String country;

	protected Integer locationId;

	protected Double latitude = 0d;

	protected Double longitude = 0d;
	
	public LocationBuilder() {
	}

	public LocationBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	public LocationBuilder<T> country(String country) {
		this.country = country;
		return this;
	}
	
	public LocationBuilder<T> locationId(Integer locationId) {
		this.locationId = locationId;
		return this;
	}
	
	public LocationBuilder<T> latitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}
	
	public LocationBuilder<T> longitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}
	
	public Location build() {
		LocationImpl location = new LocationImpl();
		location.setCountry(country);
		location.setLocationId(locationId);
		location.setLatitude(latitude);
		location.setLongitude(longitude);
		return location;
	}

	public T done(){
		return parentBuilder;
	}
}