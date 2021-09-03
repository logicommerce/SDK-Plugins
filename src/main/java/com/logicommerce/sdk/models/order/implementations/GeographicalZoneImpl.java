package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.GeographicalZone;

public class GeographicalZoneImpl implements GeographicalZone {

	private int countryId;
	
	private int locationId;

	public int getCountryId() {
		return countryId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
}