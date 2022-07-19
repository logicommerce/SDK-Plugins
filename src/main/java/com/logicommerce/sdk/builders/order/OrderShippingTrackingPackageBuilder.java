package com.logicommerce.sdk.builders.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.order.OrderShippingTrackingPackage;
import com.logicommerce.sdk.models.order.implementations.OrderShippingTrackingPackageImpl;

/**
 * <p>OrderShippingTrackingPackageBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShippingTrackingPackageBuilder<T> {

	private T parentBuilder;

	protected Integer id;

	protected double weight;

	protected String weightUnits;

	protected LocalDateTime lastUpdate;

	protected List<OrderShippingTrackingPackageActivityBuilder<OrderShippingTrackingPackageBuilder<T>>> activities;
	
	/**
	 * <p>Constructor for OrderShippingTrackingPackageBuilder.</p>
	 */
	public OrderShippingTrackingPackageBuilder() {
		this.activities = new ArrayList<>();
		this.lastUpdate = LocalDateTime.now();
	}
	
	/**
	 * <p>Constructor for OrderShippingTrackingPackageBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderShippingTrackingPackageBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageBuilder} object
	 */
	public OrderShippingTrackingPackageBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>weight.</p>
	 *
	 * @param weight a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageBuilder} object
	 */
	public OrderShippingTrackingPackageBuilder<T> weight(double weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * <p>weightUnits.</p>
	 *
	 * @param weightUnits a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageBuilder} object
	 */
	public OrderShippingTrackingPackageBuilder<T> weightUnits(String weightUnits) {
		this.weightUnits = weightUnits;
		return this;
	}

	/**
	 * <p>lastUpdate.</p>
	 *
	 * @param lastUpdate a {@link java.time.LocalDateTime} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageBuilder} object
	 */
	public OrderShippingTrackingPackageBuilder<T> lastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}
	
	/**
	 * <p>activities.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageActivityBuilder} object
	 */
	public OrderShippingTrackingPackageActivityBuilder<OrderShippingTrackingPackageBuilder<T>> activities() {
		OrderShippingTrackingPackageActivityBuilder<OrderShippingTrackingPackageBuilder<T>> activity =
				new OrderShippingTrackingPackageActivityBuilder<>(this);
		activities.add(activity);
		return activity;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShippingTrackingPackage} object
	 */
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

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
