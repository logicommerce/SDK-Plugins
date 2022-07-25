package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.builders.LocationBuilder;
import com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation;
import com.logicommerce.sdk.models.order.implementations.OrderDeliveryPhysicalLocationImpl;

/**
 * <p>OrderDeliveryPhysicalLocationBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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
	
	/**
	 * <p>Constructor for OrderDeliveryPhysicalLocationBuilder.</p>
	 */
	public OrderDeliveryPhysicalLocationBuilder() {
		location = new LocationBuilder<>(this);
	}
	
	/**
	 * <p>Constructor for OrderDeliveryPhysicalLocationBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderDeliveryPhysicalLocationBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>physicalLocationId.</p>
	 *
	 * @param physicalLocationId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryPhysicalLocationBuilder} object
	 */
	public OrderDeliveryPhysicalLocationBuilder<T> physicalLocationId(int physicalLocationId) {
		this.physicalLocationId = physicalLocationId;
		return this;
	}
	
	/**
	 * <p>physicalLocationPId.</p>
	 *
	 * @param physicalLocationPId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryPhysicalLocationBuilder} object
	 */
	public OrderDeliveryPhysicalLocationBuilder<T> physicalLocationPId(String physicalLocationPId) {
		this.physicalLocationPId = physicalLocationPId;
		return this;
	}
	
	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryPhysicalLocationBuilder} object
	 */
	public OrderDeliveryPhysicalLocationBuilder<T> name(String name) {
		this.name = name;
		return this;
	}
	
	/**
	 * <p>address.</p>
	 *
	 * @param address a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryPhysicalLocationBuilder} object
	 */
	public OrderDeliveryPhysicalLocationBuilder<T> address(String address) {
		this.address = address;
		return this;
	}
	
	/**
	 * <p>city.</p>
	 *
	 * @param city a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryPhysicalLocationBuilder} object
	 */
	public OrderDeliveryPhysicalLocationBuilder<T> city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * <p>state.</p>
	 *
	 * @param state a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryPhysicalLocationBuilder} object
	 */
	public OrderDeliveryPhysicalLocationBuilder<T> state(String state) {
		this.state = state;
		return this;
	}

	/**
	 * <p>postalCode.</p>
	 *
	 * @param postalCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryPhysicalLocationBuilder} object
	 */
	public OrderDeliveryPhysicalLocationBuilder<T> postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * <p>location.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.LocationBuilder} object
	 */
	public LocationBuilder<OrderDeliveryPhysicalLocationBuilder<T>> location() {
		return location;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation} object
	 */
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
	
	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
