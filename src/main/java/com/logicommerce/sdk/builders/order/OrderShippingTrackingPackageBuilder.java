package com.logicommerce.sdk.builders.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.order.OrderShippingTrackingPackage;
import com.logicommerce.sdk.models.order.implementations.OrderShippingTrackingPackageImpl;

public class OrderShippingTrackingPackageBuilder<T> {

	private T parentBuilder;

	protected Integer id;

	protected double weight;

	protected String weightUnits;

	protected LocalDateTime lastUpdate;

	protected List<OrderShippingTrackingPackageActivityBuilder<OrderShippingTrackingPackageBuilder<T>>> activities;

	public OrderShippingTrackingPackageBuilder() {
		this.activities = new ArrayList<>();
		this.lastUpdate = LocalDateTime.now();
	}

	public OrderShippingTrackingPackageBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderShippingTrackingPackageBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderShippingTrackingPackageBuilder<T> weight(double weight) {
		this.weight = weight;
		return this;
	}

	public OrderShippingTrackingPackageBuilder<T> weightUnits(String weightUnits) {
		this.weightUnits = weightUnits;
		return this;
	}

	public OrderShippingTrackingPackageBuilder<T> lastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	public OrderShippingTrackingPackageActivityBuilder<OrderShippingTrackingPackageBuilder<T>> activities() {
		OrderShippingTrackingPackageActivityBuilder<OrderShippingTrackingPackageBuilder<T>> activity =
				new OrderShippingTrackingPackageActivityBuilder<>(this);
		activities.add(activity);
		return activity;
	}

	public OrderShippingTrackingPackage build() {
		OrderShippingTrackingPackageImpl trackingPackage = new OrderShippingTrackingPackageImpl();
		trackingPackage.setId(null);
		trackingPackage.setWeight(weight);
		trackingPackage.setWeightUnits(weightUnits);
		trackingPackage.setLastUpdate(lastUpdate);
		trackingPackage.setActivities(activities.stream()
				.map(OrderShippingTrackingPackageActivityBuilder<OrderShippingTrackingPackageBuilder<T>>::build)
				.collect(Collectors.toList()));
		return trackingPackage;
	}

	public T done() {
		return parentBuilder;
	}
}