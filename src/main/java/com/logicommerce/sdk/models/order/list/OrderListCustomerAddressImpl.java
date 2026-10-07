package com.logicommerce.sdk.models.order.list;

import com.logicommerce.sdk.enums.CustomerType;
import com.logicommerce.sdk.models.Location;
import com.logicommerce.sdk.models.implementations.LocationImpl;
import com.logicommerce.utilities.annotations.Uses;

/**
 * OrderListCustomerAddress implementation.
 *
 * @author LogiCommerce
 * @see OrderListCustomerAddress
 * @since 2.8.5
 */
public class OrderListCustomerAddressImpl implements OrderListCustomerAddress {

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

	@Uses(value = LocationImpl.class)
	private Location location;

	private String phone;

	private String mobile;

	private String fax;

	private CustomerType customerType;

	private Integer userAddressId;

	/** {@inheritDoc} */
	@Override
	public String getAlias() {
		return alias;
	}

	/** {@inheritDoc} */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/** {@inheritDoc} */
	@Override
	public String getLastName() {
		return lastName;
	}

	/** {@inheritDoc} */
	@Override
	public String getCompany() {
		return company;
	}

	/** {@inheritDoc} */
	@Override
	public String getAddress() {
		return address;
	}

	/** {@inheritDoc} */
	@Override
	public String getAddressAdditionalInformation() {
		return addressAdditionalInformation;
	}

	/** {@inheritDoc} */
	@Override
	public String getNumber() {
		return number;
	}

	/** {@inheritDoc} */
	@Override
	public String getCity() {
		return city;
	}

	/** {@inheritDoc} */
	@Override
	public String getState() {
		return state;
	}

	/** {@inheritDoc} */
	@Override
	public String getPostalCode() {
		return postalCode;
	}

	/** {@inheritDoc} */
	@Override
	public String getVat() {
		return vat;
	}

	/** {@inheritDoc} */
	@Override
	public String getNif() {
		return nif;
	}

	/** {@inheritDoc} */
	@Override
	public Location getLocation() {
		return location;
	}

	/** {@inheritDoc} */
	@Override
	public String getPhone() {
		return phone;
	}

	/** {@inheritDoc} */
	@Override
	public String getMobile() {
		return mobile;
	}

	/** {@inheritDoc} */
	@Override
	public String getFax() {
		return fax;
	}

	/** {@inheritDoc} */
	@Override
	public CustomerType getCustomerType() {
		return customerType;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getUserAddressId() {
		return userAddressId;
	}

	/**
	 * Sets the alias.
	 *
	 * @param alias a String
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Sets the firstName.
	 *
	 * @param firstName a String
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Sets the lastName.
	 *
	 * @param lastName a String
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Sets the company.
	 *
	 * @param company a String
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * Sets the address.
	 *
	 * @param address a String
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Sets the addressAdditionalInformation.
	 *
	 * @param addressAdditionalInformation a String
	 */
	public void setAddressAdditionalInformation(String addressAdditionalInformation) {
		this.addressAdditionalInformation = addressAdditionalInformation;
	}

	/**
	 * Sets the number.
	 *
	 * @param number a String
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * Sets the city.
	 *
	 * @param city a String
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets the state.
	 *
	 * @param state a String
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Sets the postalCode.
	 *
	 * @param postalCode a String
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Sets the vat.
	 *
	 * @param vat a String
	 */
	public void setVat(String vat) {
		this.vat = vat;
	}

	/**
	 * Sets the nif.
	 *
	 * @param nif a String
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * Sets the location.
	 *
	 * @param location a Location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone a String
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Sets the mobile.
	 *
	 * @param mobile a String
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * Sets the fax.
	 *
	 * @param fax a String
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * Sets the customerType.
	 *
	 * @param customerType a CustomerType
	 */
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	/**
	 * Sets the userAddressId.
	 *
	 * @param userAddressId a Integer
	 */
	public void setUserAddressId(Integer userAddressId) {
		this.userAddressId = userAddressId;
	}

}
