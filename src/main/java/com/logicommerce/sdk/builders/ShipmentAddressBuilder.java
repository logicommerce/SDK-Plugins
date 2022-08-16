package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.order.ShipmentAddress;
import com.logicommerce.sdk.models.order.implementations.ShipmentAddressImpl;

/**
 * <p>ShipmentAddressBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ShipmentAddressBuilder<T> {

	private T parentBuilder;

	protected String name;

	protected String address;

	protected String city;

	protected String state;

	protected String postalCode;

	protected LocationBuilder<ShipmentAddressBuilder<T>> location;

	protected String mobile;

	protected String phone;

	protected String email;

	/**
	 * <p>Constructor for ShipmentAddressBuilder.</p>
	 */
	public ShipmentAddressBuilder() {
		this.location = new LocationBuilder<>(this);
	}

	/**
	 * <p>Constructor for ShipmentAddressBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ShipmentAddressBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>address.</p>
	 *
	 * @param address a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<T> address(String address) {
		this.address = address;
		return this;
	}

	/**
	 * <p>city.</p>
	 *
	 * @param city a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<T> city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * <p>state.</p>
	 *
	 * @param state a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<T> state(String state) {
		this.state = state;
		return this;
	}

	/**
	 * <p>postalCode.</p>
	 *
	 * @param postalCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<T> postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * <p>mobile.</p>
	 *
	 * @param mobile a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<T> mobile(String mobile) {
		this.mobile = mobile;
		return this;
	}

	/**
	 * <p>phone.</p>
	 *
	 * @param phone a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<T> phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * <p>email.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<T> email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * <p>location.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.LocationBuilder} object
	 */
	public LocationBuilder<ShipmentAddressBuilder<T>> location() {
		LocationBuilder<ShipmentAddressBuilder<T>> locationBuilder = new LocationBuilder<>(this);
		this.location = locationBuilder;
		return locationBuilder;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.ShipmentAddress} object
	 */
	public ShipmentAddress build() {
		ShipmentAddressImpl shipmentAddress = new ShipmentAddressImpl();
		shipmentAddress.setAddress(address);
		shipmentAddress.setCity(city);
		shipmentAddress.setEmail(email);
		shipmentAddress.setLocation(location.build());
		shipmentAddress.setMobile(mobile);
		shipmentAddress.setName(name);
		shipmentAddress.setMobile(mobile);
		shipmentAddress.setPhone(phone);
		shipmentAddress.setPostalCode(postalCode);
		shipmentAddress.setState(state);

		return shipmentAddress;
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
