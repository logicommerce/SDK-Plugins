package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.order.OrderShippingTracking;
import com.logicommerce.sdk.models.order.implementations.OrderShippingTrackingImpl;

/**
 * <p>OrderShippingTrackingBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShippingTrackingBuilder<T> {
	
	private T parentBuilder;

	protected Integer id;

	protected String trackingReference;

	protected List<OrderShippingTrackingPackageBuilder<OrderShippingTrackingBuilder<T>>> trackingPackages;

	protected List<ElementProperty> properties;
	
	/**
	 * <p>Constructor for OrderShippingTrackingBuilder.</p>
	 */
	public OrderShippingTrackingBuilder() {
		trackingPackages = new ArrayList<>();
		properties = new ArrayList<>();
	}
	
	/**
	 * <p>Constructor for OrderShippingTrackingBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderShippingTrackingBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingBuilder} object
	 */
	public OrderShippingTrackingBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>trackingReference.</p>
	 *
	 * @param trackingReference a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingBuilder} object
	 */
	public OrderShippingTrackingBuilder<T> trackingReference(String trackingReference) {
		this.trackingReference = trackingReference;
		return this;
	}
	
	/**
	 * <p>trackingPackages.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageBuilder} object
	 */
	public OrderShippingTrackingPackageBuilder<OrderShippingTrackingBuilder<T>> trackingPackages() {
		OrderShippingTrackingPackageBuilder<OrderShippingTrackingBuilder<T>> trackingPackage =
				new OrderShippingTrackingPackageBuilder<>(this);
		trackingPackages.add(trackingPackage);
		return trackingPackage;
	}
	
	/**
	 * <p>addProperty.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingBuilder} object
	 */
	public OrderShippingTrackingBuilder<T> addProperty(String name, String value) {
		properties.add(new ElementProperyImpl(name, value));
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShippingTracking} object
	 */
	public OrderShippingTracking build() {
		OrderShippingTrackingImpl tracking = new OrderShippingTrackingImpl();
		tracking.setId(null);
		tracking.setTrackingReference(trackingReference);
		tracking.setProperties(properties);
		tracking.setPackages(trackingPackages.stream()
				.map(OrderShippingTrackingPackageBuilder<OrderShippingTrackingBuilder<T>>::build)
				.collect(Collectors.toList()));

		return tracking;
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
