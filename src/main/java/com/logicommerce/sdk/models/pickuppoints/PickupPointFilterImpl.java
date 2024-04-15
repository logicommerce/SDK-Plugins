package com.logicommerce.sdk.models.pickuppoints;

/**
 * <p>PickupPointFilter class.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.7
 */

public class PickupPointFilterImpl implements PickupPointFilter {

	private Integer providerId;

	private String countryCode;	

	private String postalCode;

	private String city;

	private String latitude;

	private String longitude;
	
	private Double radius;

	/** {@inheritDoc} */
	@Override
	public int getProviderId() {
		return providerId;
	}

	/**
	 * <p>Setter for the field <code>providerId</code>.</p>
	 *
	 * @param providerId a {@link java.lang.Integer} object
	 */
	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}

	/** {@inheritDoc} */
	@Override
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <p>Setter for the field <code>countryCode</code>.</p>
	 *
	 * @param countryCode a {@link java.lang.String} object
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/** {@inheritDoc} */
	@Override
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <p>Setter for the field <code>postalCode</code>.</p>
	 *
	 * @param postalCode a {@link java.lang.String} object
	 */	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/** {@inheritDoc} */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object
	 */	
	public void setCity(String city) {
		this.city = city;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getLatitude() {
		return latitude;
	}

	/**
	 * <p>Setter for the field <code>latitude</code>.</p>
	 *
	 * @param latitude a {@link java.lang.String} object
	 */	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getLongitude() {
		return longitude;
	}
	
	/**
	 * <p>Setter for the field <code>longitude</code>.</p>
	 *
	 * @param longitude a {@link java.lang.String} object
	 */	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/** {@inheritDoc} */
	@Override
	public double getRadius() {
		return radius;
	}
	
	/**
	 * <p>Setter for the field <code>radius</code>.</p>
	 *
	 * @param radius a {@link java.lang.Double} object
	 */	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
