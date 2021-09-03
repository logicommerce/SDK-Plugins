package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.order.GeographicalZone;
import com.logicommerce.sdk.models.order.implementations.GeographicalZoneImpl;

public class GeographicalZoneBuilder<T> {

	private T parentBuilder;
	
	protected int countryId;
	
	protected int locationId;
	
	public GeographicalZoneBuilder() {

	}
	
	public GeographicalZoneBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	public GeographicalZoneBuilder<T> countryId(int countryId) {
		this.countryId = countryId;
		return this;
	}
	
	public GeographicalZoneBuilder<T> locationId(int locationId) {
		this.locationId = locationId;
		return this;
	}
	
	public GeographicalZone build() {
		GeographicalZoneImpl geographicalZone = new GeographicalZoneImpl();		
		geographicalZone.setCountryId(countryId);
		geographicalZone.setLocationId(locationId);
		
		return geographicalZone;
	}
	
	public T done() {
		return parentBuilder;
	}
}