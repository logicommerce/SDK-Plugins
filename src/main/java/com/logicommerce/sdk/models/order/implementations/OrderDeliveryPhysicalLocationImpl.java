package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.Location;
import com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation;

/**
 * <p>OrderDeliveryPhysicalLocationImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderDeliveryPhysicalLocationImpl implements OrderDeliveryPhysicalLocation {

	private int physicalLocationId;
	
	private String physicalLocationPId;
	
	private String name;
	
	private String address;
		
	private String city;
	
	private String state;
	
	private String postalCode;
	
	protected Location location;

	/**
	 * <p>Getter for the field <code>location</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.Location} object
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <p>Getter for the field <code>physicalLocationId</code>.</p>
	 *
	 * @return a int
	 */
	public int getPhysicalLocationId() {
		return physicalLocationId;
	}

	/**
	 * <p>Getter for the field <code>physicalLocationPId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getPhysicalLocationPId() {
		return physicalLocationPId;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>Getter for the field <code>address</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <p>Getter for the field <code>city</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <p>Getter for the field <code>state</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getState() {
		return state;
	}

	/**
	 * <p>Getter for the field <code>postalCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <p>Setter for the field <code>location</code>.</p>
	 *
	 * @param location a {@link com.logicommerce.sdk.models.Location} object
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * <p>Setter for the field <code>physicalLocationId</code>.</p>
	 *
	 * @param physicalLocationId a int
	 */
	public void setPhysicalLocationId(int physicalLocationId) {
		this.physicalLocationId = physicalLocationId;
	}

	/**
	 * <p>Setter for the field <code>physicalLocationPId</code>.</p>
	 *
	 * @param physicalLocationPId a {@link java.lang.String} object
	 */
	public void setPhysicalLocationPId(String physicalLocationPId) {
		this.physicalLocationPId = physicalLocationPId;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Setter for the field <code>address</code>.</p>
	 *
	 * @param address a {@link java.lang.String} object
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * <p>Setter for the field <code>state</code>.</p>
	 *
	 * @param state a {@link java.lang.String} object
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * <p>Setter for the field <code>postalCode</code>.</p>
	 *
	 * @param postalCode a {@link java.lang.String} object
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
