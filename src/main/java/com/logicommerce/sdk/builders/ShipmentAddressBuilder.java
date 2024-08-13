package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.order.ShipmentAddress;
import com.logicommerce.sdk.models.order.implementations.ShipmentAddressImpl;

/**
 * ShipmentAddressBuilder class
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ShipmentAddressBuilder<T> extends AddressBuilder<T, ShipmentAddressBuilder<T>> {

	protected String email;
	
	protected String company;

	/**
	 * <p>Constructor for ShipmentAddressBuilder.</p>
	 */
	public ShipmentAddressBuilder() {
		super();
	}

	/**
	 * <p>Constructor for ShipmentAddressBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ShipmentAddressBuilder(T parentBuilder) {
		super(parentBuilder);
	}

	/**
	 * <p>email.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<T> email(String email) {
		this.email = email;
		return returnThis();
	}

	/**
	 * <p>company.</p>
	 *
	 * @since 2.0.0
	 * @param company a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<T> company(String company) {
		this.company = company;
		return returnThis();
	}

	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.ShipmentAddress} object
	 */
	public ShipmentAddress build() {
		ShipmentAddressImpl shipmentAddress = new ShipmentAddressImpl();
		setElements(shipmentAddress);
		shipmentAddress.setEmail(email);
		shipmentAddress.setCompany(company);
		return shipmentAddress;
	}

	/**
	 * <p>returnThis.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	protected ShipmentAddressBuilder<T> returnThis() {
		return this;
	}
}
