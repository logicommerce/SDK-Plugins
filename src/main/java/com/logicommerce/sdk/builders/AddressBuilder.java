package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.Address;
import com.logicommerce.sdk.models.implementations.AddressImpl;

/**
 * AddressBuilder class
 *
 * @author Logicommerce
 * @since 1.3.3
 */
public class AddressBuilder<T, S extends AddressBuilder<T, S>> {

	private T parentBuilder;

	protected String name;

	protected String address;

	protected String number;

	protected String addressAdditionalInformation;

	protected String city;

	protected String state;

	protected String postalCode;

	protected String phone;

	protected String mobile;

	protected LocationBuilder<S> location;

	/**
	 * <p>Constructor for AddressBuilder.</p>
	 */
	public AddressBuilder() {
		location = new LocationBuilder<>(returnThis());
	}

	/**
	 * <p>Constructor for AddressBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public AddressBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>address.</p>
	 *
	 * @param address a {@link java.lang.String} object
	 * @return a {@link AddressBuilder} object
	 */
	public S address(String address) {
		this.address = address;
		return returnThis();
	}

	/**
	 * <p>addressAdditionalInformation.</p>
	 *
	 * @param addressAdditionalInformation a {@link java.lang.String} object
	 * @return a {@link AddressBuilder} object
	 */
	public S addressAdditionalInformation(String addressAdditionalInformation) {
		this.addressAdditionalInformation = addressAdditionalInformation;
		return returnThis();
	}

	/**
	 * <p>number.</p>
	 *
	 * @param number a {@link java.lang.String} object
	 * @return a {@link AddressBuilder} object
	 */
	public S number(String number) {
		this.number = number;
		return returnThis();
	}

	/**
	 * <p>city.</p>
	 *
	 * @param city a {@link java.lang.String} object
	 * @return a {@link AddressBuilder} object
	 */
	public S city(String city) {
		this.city = city;
		return returnThis();
	}

	/**
	 * <p>state.</p>
	 *
	 * @param state a {@link java.lang.String} object
	 * @return a {@link AddressBuilder} object
	 */
	public S state(String state) {
		this.state = state;
		return returnThis();
	}

	/**
	 * <p>postalCode.</p>
	 *
	 * @param postalCode a {@link java.lang.String} object
	 * @return a {@link AddressBuilder} object
	 */
	public S postalCode(String postalCode) {
		this.postalCode = postalCode;
		return returnThis();
	}

	/**
	 * <p>phone.</p>
	 *
	 * @param phone a {@link java.lang.String} object
	 * @return a {@link AddressBuilder} object
	 */
	public S phone(String phone) {
		this.phone = phone;
		return returnThis();
	}

	/**
	 * <p>mobile.</p>
	 *
	 * @param mobile a {@link java.lang.String} object
	 * @return a {@link AddressBuilder} object
	 */
	public S mobile(String mobile) {
		this.mobile = mobile;
		return returnThis();
	}

	/**
	 * <p>location.</p>
	 *
	 * @return a {@link LocationBuilder} object
	 */
	public LocationBuilder<S> location() {
		return location;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link AddressBuilder} object
	 */
	public S name(String name) {
		this.name = name;
		return returnThis();
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link Address} object
	 */
	public Address build() {
		AddressImpl addressImpl = new AddressImpl();
		setElements(addressImpl);
		return addressImpl;
	}

	/**
	 * <p>setElements.</p>
	 *
	 * @param addressImpl a {@link AddressImpl} object
	 */
	protected void setElements(AddressImpl addressImpl) {
		addressImpl.setName(name);
		addressImpl.setAddress(address);
		addressImpl.setNumber(number);
		addressImpl.setAddressAdditionalInformation(addressAdditionalInformation);
		addressImpl.setCity(city);
		addressImpl.setState(state);
		addressImpl.setPostalCode(postalCode);
		addressImpl.setPhone(phone);
		addressImpl.setMobile(mobile);
		addressImpl.setLocation(location.build());
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}

	/**
	 * <p>returnThis.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	@SuppressWarnings("unchecked")
	protected S returnThis() {
		return (S) this;
	}

}
