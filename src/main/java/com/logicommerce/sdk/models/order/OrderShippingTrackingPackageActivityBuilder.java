package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;

public class OrderShippingTrackingPackageActivityBuilder {

	private OrderShippingTrackingPackageBuilder parentBuilder;
	private LocalDateTime dateTime;
	private String status;
	private String description;
	private List<ElementProperty> properties;

	public OrderShippingTrackingPackageActivityBuilder() {
		properties = new ArrayList<>();
	}

	public OrderShippingTrackingPackageActivityBuilder(OrderShippingTrackingPackageBuilder parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderShippingTrackingPackageActivityBuilder dateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
		return this;
	}

	public OrderShippingTrackingPackageActivityBuilder status(String status) {
		this.status = status;
		return this;
	}

	public OrderShippingTrackingPackageActivityBuilder description(String description) {
		this.description = description;
		return this;
	}
	
	public OrderShippingTrackingPackageActivityBuilder addProperty(String name, String value) {
		properties.add(new ElementProperyImpl(name, value));
		return this;
	}

	public OrderShippingTrackingPackageActivity build() {
		OrderShippingTrackingPackageActivityImpl activity = new OrderShippingTrackingPackageActivityImpl();
		activity.setDateTime(dateTime);
		activity.setDescription(description);
		activity.setStatus(status);
		activity.setProperties(properties);
		return activity;
	}

	public OrderShippingTrackingPackageBuilder done() {
		return parentBuilder;
	}
}
