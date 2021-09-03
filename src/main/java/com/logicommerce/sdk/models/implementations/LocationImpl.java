package com.logicommerce.sdk.models.implementations;

import com.logicommerce.sdk.models.Location;

public class LocationImpl implements Location {

	private String country;

	private Integer locationId;

	private Double latitude;

	private Double longitude;

	public String getCountry() {
		return country;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
}