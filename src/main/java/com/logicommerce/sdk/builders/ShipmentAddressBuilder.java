package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.order.ShipmentAddress;
import com.logicommerce.sdk.models.order.implementations.ShipmentAddressImpl;

public class ShipmentAddressBuilder<T> {

	private T parentBuilder;
	
	protected String name;

	protected String address;

	protected String city;

	protected String state;

	protected String postalCode;

	protected LocationBuilder<ShipmentAddressBuilder<T>> location;

	protected String mobile;

	protected String phone;

	protected String email;

	public ShipmentAddressBuilder() {
		this.location = new LocationBuilder<>(this);
	}
	
	public ShipmentAddressBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	public ShipmentAddressBuilder<T> name(String name) {
		this.name = name;
		return this;
	}
	
	public ShipmentAddressBuilder<T> address(String address) {
		this.address = address;
		return this;
	}
	
	public ShipmentAddressBuilder<T> city(String city) {
		this.city = city;
		return this;
	}
	
	public ShipmentAddressBuilder<T> state(String state) {
		this.state = state;
		return this;
	}
	
	public ShipmentAddressBuilder<T> postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}
	
	public ShipmentAddressBuilder<T> mobile(String mobile) {
		this.mobile = mobile;
		return this;
	}
	
	public ShipmentAddressBuilder<T> phone(String phone) {
		this.phone = phone;
		return this;
	}
	
	public ShipmentAddressBuilder<T> email(String email) {
		this.email = email;
		return this;
	}
	
	public LocationBuilder<ShipmentAddressBuilder<T>> location() {
		LocationBuilder<ShipmentAddressBuilder<T>> location = new LocationBuilder<ShipmentAddressBuilder<T>>(this);
		this.location = location;
		return location;
	}

	public ShipmentAddress build() {
		ShipmentAddressImpl shipmentAddress = new ShipmentAddressImpl();		
		shipmentAddress.setAddress(address);
		shipmentAddress.setCity(city);
		shipmentAddress.setEmail(email);
		shipmentAddress.setLocation(location.build());
		shipmentAddress.setMobile(mobile);
		shipmentAddress.setName(name);
		shipmentAddress.setMobile(mobile);
		shipmentAddress.setPhone(phone);
		shipmentAddress.setPostalCode(postalCode);
		shipmentAddress.setState(state);
		
		return shipmentAddress;
	}	

	public T done() {
		return parentBuilder;
	}
}