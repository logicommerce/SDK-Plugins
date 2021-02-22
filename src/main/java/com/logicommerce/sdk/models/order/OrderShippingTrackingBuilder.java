package com.logicommerce.sdk.models.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;

public class OrderShippingTrackingBuilder {

	private String trackingNumber;
	private List<OrderShippingTrackingPackageBuilder> trackingPackages;
	private List<ElementProperty> properties;
	
	public OrderShippingTrackingBuilder() {
		trackingPackages = new ArrayList<>();
	}
	
	
	public OrderShippingTrackingBuilder trackingNumber(String trackingBuilder) {
		this.trackingNumber = trackingBuilder;
		return this;
	}
	
	public OrderShippingTrackingBuilder addProperty(String name, String value) {
		properties.add(new ElementProperyImpl(name, value));
		return this;
	}
	
	public OrderShippingTrackingPackageBuilder trackingPackage() {
		OrderShippingTrackingPackageBuilder trackingPackage = new OrderShippingTrackingPackageBuilder(this);
		trackingPackages.add(trackingPackage);
		return trackingPackage;
	}
	
	public OrderShippingTracking build() {
		OrderShippingTrackingImpl orderShippingTracking =  new OrderShippingTrackingImpl();
		orderShippingTracking.setTrackingNumber(trackingNumber);
		orderShippingTracking.setTrackingPackages(trackingPackages.stream().map(OrderShippingTrackingPackageBuilder::build).collect(Collectors.toList()));
		orderShippingTracking.setProperties(properties);
		return orderShippingTracking;
	}

}
