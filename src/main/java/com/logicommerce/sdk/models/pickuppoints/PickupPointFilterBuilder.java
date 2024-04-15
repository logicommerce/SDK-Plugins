package com.logicommerce.sdk.models.pickuppoints;

/**
 * <p>PickupPointFilter class.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.7
 */

public class PickupPointFilterBuilder {

	private Integer providerId;

	private String countryCode;	

	private String postalCode;

	private String city;

	private String latitude;

	private String longitude;
	
	private Double radius;

	/**
	 * <p>providerId</p>
	 *
	 * @param providerId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointFilterBuilder} object
	 */
	public PickupPointFilterBuilder providerId(Integer providerId) {
		this.providerId = providerId;
		return returnThis();
	}
	
	/**
	 * <p>countryCode</p>
	 *
	 * @param countryCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointFilterBuilder} object
	 */
	public PickupPointFilterBuilder countryCode(String countryCode) {
		this.countryCode = countryCode;
		return returnThis();
	}
	
	/**
	 * <p>postalCode</p>
	 *
	 * @param postalCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointFilterBuilder} object
	 */
	public PickupPointFilterBuilder postalCode(String postalCode) {
		this.postalCode = postalCode;
		return returnThis();
	}
	
	/**
	 * <p>city</p>
	 *
	 * @param city a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointFilterBuilder} object
	 */
	public PickupPointFilterBuilder city(String city) {
		this.city = city;
		return returnThis();
	}
	
	/**
	 * <p>latitude</p>
	 *
	 * @param latitude a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointFilterBuilder} object
	 */
	public PickupPointFilterBuilder latitude(String latitude) {
		this.latitude = latitude;
		return returnThis();
	}
	
	/**
	 * <p>longitude</p>
	 *
	 * @param longitude a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointFilterBuilder} object
	 */
	public PickupPointFilterBuilder longitude(String longitude) {
		this.longitude = longitude;
		return returnThis();
	}
	
	/**
	 * <p>radius</p>
	 *
	 * @param radius a {@link java.lang.Double} object
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointFilterBuilder} object
	 */
	public PickupPointFilterBuilder radius(Double radius) {
		this.radius = radius;
		return returnThis();
	}
	
	/**
	 * <p>builder.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointFilter} object
	 */
	public PickupPointFilter build() {
		PickupPointFilterImpl pickupPointFilter = new PickupPointFilterImpl();
		pickupPointFilter.setProviderId(providerId);
		pickupPointFilter.setCountryCode(countryCode);
		pickupPointFilter.setPostalCode(postalCode);
		pickupPointFilter.setCity(city);
		pickupPointFilter.setLatitude(latitude);
		pickupPointFilter.setLongitude(longitude);
		pickupPointFilter.setRadius(radius);
		return pickupPointFilter;
	}

	public PickupPointFilterBuilder returnThis() {
		return this;
	}
	
}
