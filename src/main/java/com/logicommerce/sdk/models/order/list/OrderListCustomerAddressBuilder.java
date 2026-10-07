package com.logicommerce.sdk.models.order.list;

import com.logicommerce.sdk.enums.CustomerType;
import com.logicommerce.sdk.models.Location;

/**
 * OrderListCustomerAddress model builder.
 *
 * @author LogiCommerce
 * @see OrderListCustomerAddress
 * @since 2.8.5
 */
public class OrderListCustomerAddressBuilder {

	private String alias;

	private String firstName;

	private String lastName;

	private String company;

	private String address;

	private String addressAdditionalInformation;

	private String number;

	private String city;

	private String state;

	private String postalCode;

	private String vat;

	private String nif;

	private Location location;

	private String phone;

	private String mobile;

	private String fax;

	private CustomerType customerType;

	private Integer userAddressId;

	/**
	 * Sets the alias.
	 *
	 * @param alias a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder alias(String alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Sets the firstName.
	 *
	 * @param firstName a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Sets the lastName.
	 *
	 * @param lastName a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Sets the company.
	 *
	 * @param company a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder company(String company) {
		this.company = company;
		return this;
	}

	/**
	 * Sets the address.
	 *
	 * @param address a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder address(String address) {
		this.address = address;
		return this;
	}

	/**
	 * Sets the addressAdditionalInformation.
	 *
	 * @param addressAdditionalInformation a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder addressAdditionalInformation(String addressAdditionalInformation) {
		this.addressAdditionalInformation = addressAdditionalInformation;
		return this;
	}

	/**
	 * Sets the number.
	 *
	 * @param number a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder number(String number) {
		this.number = number;
		return this;
	}

	/**
	 * Sets the city.
	 *
	 * @param city a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * Sets the state.
	 *
	 * @param state a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder state(String state) {
		this.state = state;
		return this;
	}

	/**
	 * Sets the postalCode.
	 *
	 * @param postalCode a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * Sets the vat.
	 *
	 * @param vat a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder vat(String vat) {
		this.vat = vat;
		return this;
	}

	/**
	 * Sets the nif.
	 *
	 * @param nif a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder nif(String nif) {
		this.nif = nif;
		return this;
	}

	/**
	 * Sets the location.
	 *
	 * @param location a Location
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder location(Location location) {
		this.location = location;
		return this;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Sets the mobile.
	 *
	 * @param mobile a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder mobile(String mobile) {
		this.mobile = mobile;
		return this;
	}

	/**
	 * Sets the fax.
	 *
	 * @param fax a String
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder fax(String fax) {
		this.fax = fax;
		return this;
	}

	/**
	 * Sets the customerType.
	 *
	 * @param customerType a CustomerType
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder customerType(CustomerType customerType) {
		this.customerType = customerType;
		return this;
	}

	/**
	 * Sets the userAddressId.
	 *
	 * @param userAddressId a Integer
	 * @return a {@link OrderListCustomerAddressBuilder} object
	 */
	public OrderListCustomerAddressBuilder userAddressId(Integer userAddressId) {
		this.userAddressId = userAddressId;
		return this;
	}

	/**
	 * Builds a {@link OrderListCustomerAddressImpl} object.
	 *
	 * @return a {@link OrderListCustomerAddress} object
	 */
	public OrderListCustomerAddress build() {
		OrderListCustomerAddressImpl orderListCustomerAddress = new OrderListCustomerAddressImpl();
		orderListCustomerAddress.setAlias(alias);
		orderListCustomerAddress.setFirstName(firstName);
		orderListCustomerAddress.setLastName(lastName);
		orderListCustomerAddress.setCompany(company);
		orderListCustomerAddress.setAddress(address);
		orderListCustomerAddress.setAddressAdditionalInformation(addressAdditionalInformation);
		orderListCustomerAddress.setNumber(number);
		orderListCustomerAddress.setCity(city);
		orderListCustomerAddress.setState(state);
		orderListCustomerAddress.setPostalCode(postalCode);
		orderListCustomerAddress.setVat(vat);
		orderListCustomerAddress.setNif(nif);
		orderListCustomerAddress.setLocation(location);
		orderListCustomerAddress.setPhone(phone);
		orderListCustomerAddress.setMobile(mobile);
		orderListCustomerAddress.setFax(fax);
		orderListCustomerAddress.setCustomerType(customerType);
		orderListCustomerAddress.setUserAddressId(userAddressId);
		return orderListCustomerAddress;
	}

}
