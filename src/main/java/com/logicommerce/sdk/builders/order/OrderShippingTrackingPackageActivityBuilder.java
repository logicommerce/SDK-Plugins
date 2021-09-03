package com.logicommerce.sdk.builders.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.order.OrderShippingTrackingPackageActivity;
import com.logicommerce.sdk.models.order.implementations.OrderShippingTrackingPackageActivityImpl;

public class OrderShippingTrackingPackageActivityBuilder<T> {

	private T parentBuilder;
	
	protected Integer id;
	
	protected LocalDateTime dateTime;

	protected String description;

	protected String status;

	protected List<ElementProperty> properties;

	public OrderShippingTrackingPackageActivityBuilder() {
		super();
		this.properties = new ArrayList<>();
	}

	public OrderShippingTrackingPackageActivityBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	public OrderShippingTrackingPackageActivityBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderShippingTrackingPackageActivityBuilder<T> description(String description) {
		this.description = description;
		return this;
	}

	public OrderShippingTrackingPackageActivityBuilder<T> status(String status) {
		this.status = status;
		return this;
	}
	
	public OrderShippingTrackingPackageActivityBuilder<T> dateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
		return this;
	}

	public OrderShippingTrackingPackageActivityBuilder<T> addProperty(String name, String value) {
		properties.add(new ElementProperyImpl(name, value));
		return this;
	}
	
	public OrderShippingTrackingPackageActivity build() {
		OrderShippingTrackingPackageActivityImpl trackingPagageActivity = new OrderShippingTrackingPackageActivityImpl();
		trackingPagageActivity.setId(null);
		trackingPagageActivity.setDateTime(dateTime);
		trackingPagageActivity.setDescription(description);
		trackingPagageActivity.setStatus(status);
		trackingPagageActivity.setProperties(properties);
		
		return trackingPagageActivity;
	}

	public T done() {
		return parentBuilder;
	}
}