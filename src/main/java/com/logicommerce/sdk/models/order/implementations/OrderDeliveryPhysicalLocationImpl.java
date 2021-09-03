package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.Location;
import com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation;

public class OrderDeliveryPhysicalLocationImpl implements OrderDeliveryPhysicalLocation {

	private int physicalLocationId;
	
	private String physicalLocationPId;
	
	private String name;
	
	private String address;
		
	private String city;
	
	private String state;
	
	private String postalCode;
	
	protected Location location;

	public Location getLocation() {
		return location;
	}

	public int getPhysicalLocationId() {
		return physicalLocationId;
	}

	public String getPhysicalLocationPId() {
		return physicalLocationPId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setPhysicalLocationId(int physicalLocationId) {
		this.physicalLocationId = physicalLocationId;
	}

	public void setPhysicalLocationPId(String physicalLocationPId) {
		this.physicalLocationPId = physicalLocationPId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}