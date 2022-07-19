package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.order.GeographicalZone;
import com.logicommerce.sdk.models.order.implementations.GeographicalZoneImpl;

/**
 * <p>GeographicalZoneBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class GeographicalZoneBuilder<T> {

	private T parentBuilder;
	
	protected int countryId;
	
	protected int locationId;
	
	/**
	 * <p>Constructor for GeographicalZoneBuilder.</p>
	 */
	public GeographicalZoneBuilder() {

	}
	
	/**
	 * <p>Constructor for GeographicalZoneBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public GeographicalZoneBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>countryId.</p>
	 *
	 * @param countryId a int
	 * @return a {@link com.logicommerce.sdk.builders.GeographicalZoneBuilder} object
	 */
	public GeographicalZoneBuilder<T> countryId(int countryId) {
		this.countryId = countryId;
		return this;
	}
	
	/**
	 * <p>locationId.</p>
	 *
	 * @param locationId a int
	 * @return a {@link com.logicommerce.sdk.builders.GeographicalZoneBuilder} object
	 */
	public GeographicalZoneBuilder<T> locationId(int locationId) {
		this.locationId = locationId;
		return this;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.GeographicalZone} object
	 */
	public GeographicalZone build() {
		GeographicalZoneImpl geographicalZone = new GeographicalZoneImpl();		
		geographicalZone.setCountryId(countryId);
		geographicalZone.setLocationId(locationId);
		
		return geographicalZone;
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
