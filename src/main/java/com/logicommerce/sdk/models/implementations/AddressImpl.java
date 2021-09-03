package com.logicommerce.sdk.models.implementations;

import com.logicommerce.sdk.models.Address;
import com.logicommerce.sdk.models.Location;
import com.logicommerce.utilities.annotations.Uses;

public class AddressImpl implements Address {

	private String name;

	private String address;

	private String city;

	private String state;

	private String postalCode;

	@Uses(value = LocationImpl.class)
	private Location location;

	private String mobile;

	private String phone;

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

	public Location getLocation() {
		return location;
	}

	public String getMobile() {
		return mobile;
	}

	public String getPhone() {
		return phone;
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

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}