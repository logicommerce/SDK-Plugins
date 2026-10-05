package com.logicommerce.sdk.models.order.list;

import com.logicommerce.sdk.enums.CustomerType;
import com.logicommerce.sdk.models.Location;

/**
 * OrderListCustomerInvoicingAddress model builder.
 *
 * @author LogiCommerce
 * @see OrderListCustomerInvoicingAddress
 * @since 2.8.5
 */
public class OrderListCustomerInvoicingAddressBuilder {

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

	private boolean re;

	private boolean tax;

	/**
	 * Sets the alias.
	 *
	 * @param alias a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder alias(String alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Sets the firstName.
	 *
	 * @param firstName a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Sets the lastName.
	 *
	 * @param lastName a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Sets the company.
	 *
	 * @param company a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder company(String company) {
		this.company = company;
		return this;
	}

	/**
	 * Sets the address.
	 *
	 * @param address a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder address(String address) {
		this.address = address;
		return this;
	}

	/**
	 * Sets the addressAdditionalInformation.
	 *
	 * @param addressAdditionalInformation a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder addressAdditionalInformation(String addressAdditionalInformation) {
		this.addressAdditionalInformation = addressAdditionalInformation;
		return this;
	}

	/**
	 * Sets the number.
	 *
	 * @param number a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder number(String number) {
		this.number = number;
		return this;
	}

	/**
	 * Sets the city.
	 *
	 * @param city a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * Sets the state.
	 *
	 * @param state a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder state(String state) {
		this.state = state;
		return this;
	}

	/**
	 * Sets the postalCode.
	 *
	 * @param postalCode a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * Sets the vat.
	 *
	 * @param vat a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder vat(String vat) {
		this.vat = vat;
		return this;
	}

	/**
	 * Sets the nif.
	 *
	 * @param nif a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder nif(String nif) {
		this.nif = nif;
		return this;
	}

	/**
	 * Sets the location.
	 *
	 * @param location a Location
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder location(Location location) {
		this.location = location;
		return this;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Sets the mobile.
	 *
	 * @param mobile a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder mobile(String mobile) {
		this.mobile = mobile;
		return this;
	}

	/**
	 * Sets the fax.
	 *
	 * @param fax a String
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder fax(String fax) {
		this.fax = fax;
		return this;
	}

	/**
	 * Sets the customerType.
	 *
	 * @param customerType a CustomerType
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder customerType(CustomerType customerType) {
		this.customerType = customerType;
		return this;
	}

	/**
	 * Sets the userAddressId.
	 *
	 * @param userAddressId a Integer
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder userAddressId(Integer userAddressId) {
		this.userAddressId = userAddressId;
		return this;
	}

	/**
	 * Sets the re.
	 *
	 * @param re a boolean
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder re(boolean re) {
		this.re = re;
		return this;
	}

	/**
	 * Sets the tax.
	 *
	 * @param tax a boolean
	 * @return a {@link OrderListCustomerInvoicingAddressBuilder} object
	 */
	public OrderListCustomerInvoicingAddressBuilder tax(boolean tax) {
		this.tax = tax;
		return this;
	}

	/**
	 * Builds a {@link OrderListCustomerInvoicingAddressImpl} object.
	 *
	 * @return a {@link OrderListCustomerInvoicingAddress} object
	 */
	public OrderListCustomerInvoicingAddress build() {
		OrderListCustomerInvoicingAddressImpl orderListCustomerInvoicingAddress = new OrderListCustomerInvoicingAddressImpl();
		orderListCustomerInvoicingAddress.setAlias(alias);
		orderListCustomerInvoicingAddress.setFirstName(firstName);
		orderListCustomerInvoicingAddress.setLastName(lastName);
		orderListCustomerInvoicingAddress.setCompany(company);
		orderListCustomerInvoicingAddress.setAddress(address);
		orderListCustomerInvoicingAddress.setAddressAdditionalInformation(addressAdditionalInformation);
		orderListCustomerInvoicingAddress.setNumber(number);
		orderListCustomerInvoicingAddress.setCity(city);
		orderListCustomerInvoicingAddress.setState(state);
		orderListCustomerInvoicingAddress.setPostalCode(postalCode);
		orderListCustomerInvoicingAddress.setVat(vat);
		orderListCustomerInvoicingAddress.setNif(nif);
		orderListCustomerInvoicingAddress.setLocation(location);
		orderListCustomerInvoicingAddress.setPhone(phone);
		orderListCustomerInvoicingAddress.setMobile(mobile);
		orderListCustomerInvoicingAddress.setFax(fax);
		orderListCustomerInvoicingAddress.setCustomerType(customerType);
		orderListCustomerInvoicingAddress.setUserAddressId(userAddressId);
		orderListCustomerInvoicingAddress.setRe(re);
		orderListCustomerInvoicingAddress.setTax(tax);
		return orderListCustomerInvoicingAddress;
	}

}
