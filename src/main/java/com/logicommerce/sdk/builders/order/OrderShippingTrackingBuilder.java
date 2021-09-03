package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.order.OrderShippingTracking;
import com.logicommerce.sdk.models.order.implementations.OrderShippingTrackingImpl;

public class OrderShippingTrackingBuilder<T>{
	
	private T parentBuilder;
	
	protected Integer id;

	protected String trackingNumber;

	protected List<OrderShippingTrackingPackageBuilder<OrderShippingTrackingBuilder<T>>> trackingPackages;

	protected List<ElementProperty> properties;
	
	public OrderShippingTrackingBuilder() {
		trackingPackages = new ArrayList<>();
		properties = new ArrayList<>();
	}
	
	public OrderShippingTrackingBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderShippingTrackingBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderShippingTrackingBuilder<T> trackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
		return this;
	}
	
	public OrderShippingTrackingPackageBuilder<OrderShippingTrackingBuilder<T>> trackingPackages() {
		OrderShippingTrackingPackageBuilder<OrderShippingTrackingBuilder<T>> trackingPackage = new OrderShippingTrackingPackageBuilder<>(this);
		trackingPackages.add(trackingPackage);		
		return trackingPackage;
	}
	
	public OrderShippingTrackingBuilder<T> addProperty(String name, String value) {
		properties.add(new ElementProperyImpl(name, value));
		return this;
	}

	public OrderShippingTracking build() {
		OrderShippingTrackingImpl tracking = new OrderShippingTrackingImpl();
		tracking.setId(null);
		tracking.setTrackingNumber(trackingNumber);
		tracking.setProperties(properties);
		tracking.setPackages(trackingPackages.stream().map(OrderShippingTrackingPackageBuilder<OrderShippingTrackingBuilder<T>>::build).collect(Collectors.toList()));
		
		return tracking;
	}

	public T done() {
		return parentBuilder;
	}
}
