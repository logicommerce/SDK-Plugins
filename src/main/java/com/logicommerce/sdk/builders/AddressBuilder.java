package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.UserAddress;
import com.logicommerce.sdk.models.implementations.UserAddressImpl;

/**
 * <p>AddressBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class AddressBuilder<T, S> {

	private T parentBuilder;

	protected String alias;

	protected String firstName;

	protected String lastName;

	protected String company;

	protected String address;

	protected String addressAdditionalInformation;

	protected String number;

	protected String city;

	protected String state;

	protected String postalCode;

	protected String vat;

	protected String nif;

	protected String phone;

	protected String mobile;

	protected String fax;

	protected boolean tax;

	protected boolean re;

	@Deprecated(since = "1.0.17", forRemoval = true)
	protected boolean reverseChargeVat;
	
	protected LocationBuilder<AddressBuilder<T, S>> location;
	
	protected String name;
	
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
	 * <p>alias.</p>
	 *
	 * @param alias a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> alias(String alias) {
		this.alias = alias;
		return returnThis();
	}

	/**
	 * <p>firstName.</p>
	 *
	 * @param firstName a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> firstName(String firstName) {
		this.firstName = firstName;
		return returnThis();
	}

	/**
	 * <p>lastName.</p>
	 *
	 * @param lastName a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> lastName(String lastName) {
		this.lastName = lastName;
		return returnThis();
	}

	/**
	 * <p>company.</p>
	 *
	 * @param company a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> company(String company) {
		this.company = company;
		return returnThis();
	}

	/**
	 * <p>address.</p>
	 *
	 * @param address a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> address(String address) {
		this.address = address;
		return returnThis();
	}

	/**
	 * <p>addressAdditionalInformation.</p>
	 *
	 * @param addressAdditionalInformation a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> addressAdditionalInformation(String addressAdditionalInformation) {
		this.addressAdditionalInformation = addressAdditionalInformation;
		return returnThis();
	}

	/**
	 * <p>number.</p>
	 *
	 * @param number a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> number(String number) {
		this.number = number;
		return returnThis();
	}

	/**
	 * <p>city.</p>
	 *
	 * @param city a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> city(String city) {
		this.city = city;
		return returnThis();
	}

	/**
	 * <p>state.</p>
	 *
	 * @param state a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> state(String state) {
		this.state = state;
		return returnThis();
	}

	/**
	 * <p>postalCode.</p>
	 *
	 * @param postalCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> postalCode(String postalCode) {
		this.postalCode = postalCode;
		return returnThis();
	}

	/**
	 * <p>vat.</p>
	 *
	 * @param vat a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> vat(String vat) {
		this.vat = vat;
		return returnThis();
	}

	/**
	 * <p>nif.</p>
	 *
	 * @param nif a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> nif(String nif) {
		this.nif = nif;
		return returnThis();
	}

	/**
	 * <p>phone.</p>
	 *
	 * @param phone a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> phone(String phone) {
		this.phone = phone;
		return returnThis();
	}

	/**
	 * <p>mobile.</p>
	 *
	 * @param mobile a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> mobile(String mobile) {
		this.mobile = mobile;
		return returnThis();
	}

	/**
	 * <p>fax.</p>
	 *
	 * @param fax a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> fax(String fax) {
		this.fax = fax;
		return returnThis();
	}

	/**
	 * <p>tax.</p>
	 *
	 * @param tax a boolean
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> tax(boolean tax) {
		this.tax = tax;
		return returnThis();
	}

	/**
	 * <p>re.</p>
	 *
	 * @param re a boolean
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> re(boolean re) {
		this.re = re;
		return returnThis();
	}

	/**
	 * <p>reverseChargeVat.</p>
	 *
	 * @param reverseChargeVat a boolean
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 * @deprecated since 1.0.17, forRemoval = true
	 */
	@Deprecated(since = "1.0.17", forRemoval = true)
	public AddressBuilder<T, S> reverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
		return returnThis();
	}
	
	/**
	 * <p>location.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.LocationBuilder} object
	 */
	public LocationBuilder<AddressBuilder<T, S>> location() {
		return location;
	}
	
	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.AddressBuilder} object
	 */
	public AddressBuilder<T, S> name(String name) {
		this.name = name;
		return returnThis();
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.UserAddress} object
	 */
	public UserAddress build() {
		UserAddressImpl userAddress = new UserAddressImpl();
		setElements(userAddress);
		return userAddress;
	}
	
	/**
	 * <p>setElements.</p>
	 *
	 * @param userAddress a {@link com.logicommerce.sdk.models.implementations.UserAddressImpl} object
	 */
	protected void setElements(UserAddressImpl userAddress) {
		userAddress.setAlias(alias);
		userAddress.setFirstName(firstName);
		userAddress.setLastName(lastName);
		userAddress.setCompany(company);
		userAddress.setAddress(address);
		userAddress.setAddressAdditionalInformation(addressAdditionalInformation);
		userAddress.setNumber(number);
		userAddress.setCity(city);
		userAddress.setState(state);
		userAddress.setPostalCode(postalCode);
		userAddress.setVat(vat);
		userAddress.setNif(nif);
		userAddress.setPhone(phone);
		userAddress.setMobile(mobile);
		userAddress.setFax(fax);
		userAddress.setTax(tax);
		userAddress.setRe(re);
		userAddress.setReverseChargeVat(reverseChargeVat);
		userAddress.setLocation(location.build());
		userAddress.setName(name);
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
	protected AddressBuilder<T, S> returnThis() {
		return this;
	}
}
