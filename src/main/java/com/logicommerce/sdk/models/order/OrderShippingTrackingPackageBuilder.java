package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderShippingTrackingPackageBuilder {

	private OrderShippingTrackingBuilder parentBuilder;
	private Double weight;
	private String weightUnits;
	private LocalDateTime lastUpdate;
	private List<OrderShippingTrackingPackageActivityBuilder> activities;

	public OrderShippingTrackingPackageBuilder() {
		activities = new ArrayList<>();
	}

	public OrderShippingTrackingPackageBuilder(OrderShippingTrackingBuilder parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderShippingTrackingPackageBuilder weight(Double weight) {
		this.weight = weight;
		return this;
	}

	public OrderShippingTrackingPackageBuilder weightUnits(String weightUnits) {
		this.weightUnits = weightUnits;
		return this;
	}

	public OrderShippingTrackingPackageBuilder lastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}
	
	public OrderShippingTrackingPackageActivityBuilder activity() {
		OrderShippingTrackingPackageActivityBuilder activity = new OrderShippingTrackingPackageActivityBuilder(this);
		activities.add(activity);
		return activity;
	}

	public OrderShippingTrackingPackage build() {
		OrderShippingTrackingPackageImpl trackingPackage = new OrderShippingTrackingPackageImpl();
		trackingPackage.setWeight(weight);
		trackingPackage.setWeightUnits(weightUnits);
		trackingPackage.setLastUpdate(lastUpdate);
		trackingPackage.setActivities(activities.stream().map(OrderShippingTrackingPackageActivityBuilder::build).collect(Collectors.toList()));
		return trackingPackage;
	}

	public OrderShippingTrackingBuilder done() {
		return parentBuilder;
	}
}
