package com.logicommerce.sdk.builders.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.order.OrderShippingTrackingPackageActivity;
import com.logicommerce.sdk.models.order.implementations.OrderShippingTrackingPackageActivityImpl;

/**
 * <p>OrderShippingTrackingPackageActivityBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShippingTrackingPackageActivityBuilder<T> {

	private T parentBuilder;
	
	protected Integer id;
	
	protected LocalDateTime dateTime;

	protected String description;

	protected String status;

	protected List<ElementProperty> properties;

	/**
	 * <p>Constructor for OrderShippingTrackingPackageActivityBuilder.</p>
	 */
	public OrderShippingTrackingPackageActivityBuilder() {
		super();
		this.properties = new ArrayList<>();
	}

	/**
	 * <p>Constructor for OrderShippingTrackingPackageActivityBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderShippingTrackingPackageActivityBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageActivityBuilder} object
	 */
	public OrderShippingTrackingPackageActivityBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>description.</p>
	 *
	 * @param description a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageActivityBuilder} object
	 */
	public OrderShippingTrackingPackageActivityBuilder<T> description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * <p>status.</p>
	 *
	 * @param status a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageActivityBuilder} object
	 */
	public OrderShippingTrackingPackageActivityBuilder<T> status(String status) {
		this.status = status;
		return this;
	}
	
	/**
	 * <p>dateTime.</p>
	 *
	 * @param dateTime a {@link java.time.LocalDateTime} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageActivityBuilder} object
	 */
	public OrderShippingTrackingPackageActivityBuilder<T> dateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
		return this;
	}

	/**
	 * <p>addProperty.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingPackageActivityBuilder} object
	 */
	public OrderShippingTrackingPackageActivityBuilder<T> addProperty(String name, String value) {
		properties.add(new ElementProperyImpl(name, value));
		return this;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShippingTrackingPackageActivity} object
	 */
	public OrderShippingTrackingPackageActivity build() {
		OrderShippingTrackingPackageActivityImpl trackingPagageActivity = new OrderShippingTrackingPackageActivityImpl();
		trackingPagageActivity.setId(null);
		trackingPagageActivity.setDateTime(dateTime);
		trackingPagageActivity.setDescription(description);
		trackingPagageActivity.setStatus(status);
		trackingPagageActivity.setProperties(properties);
		
		return trackingPagageActivity;
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
