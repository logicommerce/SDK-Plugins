package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.builders.LocationBuilder;
import com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation;
import com.logicommerce.sdk.models.order.implementations.OrderDeliveryPhysicalLocationImpl;

public class OrderDeliveryPhysicalLocationBuilder<T> {

	private T parentBuilder;
	
	protected int physicalLocationId;
	
	protected String physicalLocationPId;
	
	protected String name;
	
	protected String address;
		
	protected String city;
	
	protected String state;
	
	protected String postalCode;
	
	protected LocationBuilder<OrderDeliveryPhysicalLocationBuilder<T>> location;
	
	public OrderDeliveryPhysicalLocationBuilder() {
		location = new LocationBuilder<>(this);
	}
	
	public OrderDeliveryPhysicalLocationBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderDeliveryPhysicalLocationBuilder<T> physicalLocationId(int physicalLocationId) {
		this.physicalLocationId = physicalLocationId;
		return this;
	}
	
	public OrderDeliveryPhysicalLocationBuilder<T> physicalLocationPId(String physicalLocationPId) {
		this.physicalLocationPId = physicalLocationPId;
		return this;
	}
	
	public OrderDeliveryPhysicalLocationBuilder<T> name(String name) {
		this.name = name;
		return this;
	}
	
	public OrderDeliveryPhysicalLocationBuilder<T> address(String address) {
		this.address = address;
		return this;
	}
	
	public OrderDeliveryPhysicalLocationBuilder<T> city(String city) {
		this.city = city;
		return this;
	}

	public OrderDeliveryPhysicalLocationBuilder<T> state(String state) {
		this.state = state;
		return this;
	}

	public OrderDeliveryPhysicalLocationBuilder<T> postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	public LocationBuilder<OrderDeliveryPhysicalLocationBuilder<T>> location() {
		return location;
	}
	
	public OrderDeliveryPhysicalLocation build() {
		OrderDeliveryPhysicalLocationImpl orderDeliveryPhysicalLocation = new OrderDeliveryPhysicalLocationImpl();
		orderDeliveryPhysicalLocation.setAddress(address);
		orderDeliveryPhysicalLocation.setCity(city);
		orderDeliveryPhysicalLocation.setLocation(location.build());
		orderDeliveryPhysicalLocation.setName(name);
		orderDeliveryPhysicalLocation.setPhysicalLocationId(physicalLocationId);
		orderDeliveryPhysicalLocation.setPhysicalLocationPId(physicalLocationPId);
		orderDeliveryPhysicalLocation.setPostalCode(postalCode);
		orderDeliveryPhysicalLocation.setState(state);
		
		return orderDeliveryPhysicalLocation;
	}
	
	public T done() {
		return parentBuilder;
	}
}