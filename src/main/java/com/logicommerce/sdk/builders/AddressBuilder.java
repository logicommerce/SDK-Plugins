package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.UserAddress;
import com.logicommerce.sdk.models.implementations.UserAddressImpl;

public class AddressBuilder<T, S> {

	private T parentBuilder;

	protected String alias;

	protected String firstName;

	protected String lastName;

	protected String companyy;

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

	protected boolean reverseChargeVat;
	
	protected LocationBuilder<AddressBuilder<T, S>> location;
	
	protected String name;
	
	public AddressBuilder() {
		location = new LocationBuilder<>(returnThis());
	}

	public AddressBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public AddressBuilder<T, S> alias(String alias) {
		this.alias = alias;
		return returnThis();
	}

	public AddressBuilder<T, S> firstName(String firstName) {
		this.firstName = firstName;
		return returnThis();
	}

	public AddressBuilder<T, S> lastName(String lastName) {
		this.lastName = lastName;
		return returnThis();
	}

	public AddressBuilder<T, S> companyy(String companyy) {
		this.companyy = companyy;
		return returnThis();
	}

	public AddressBuilder<T, S> address(String address) {
		this.address = address;
		return returnThis();
	}

	public AddressBuilder<T, S> addressAdditionalInformation(String addressAdditionalInformation) {
		this.addressAdditionalInformation = addressAdditionalInformation;
		return returnThis();
	}

	public AddressBuilder<T, S> number(String number) {
		this.number = number;
		return returnThis();
	}

	public AddressBuilder<T, S> city(String city) {
		this.city = city;
		return returnThis();
	}

	public AddressBuilder<T, S> state(String state) {
		this.state = state;
		return returnThis();
	}

	public AddressBuilder<T, S> postalCode(String postalCode) {
		this.postalCode = postalCode;
		return returnThis();
	}

	public AddressBuilder<T, S> vat(String vat) {
		this.vat = vat;
		return returnThis();
	}

	public AddressBuilder<T, S> nif(String nif) {
		this.nif = nif;
		return returnThis();
	}

	public AddressBuilder<T, S> phone(String phone) {
		this.phone = phone;
		return returnThis();
	}

	public AddressBuilder<T, S> mobile(String mobile) {
		this.mobile = mobile;
		return returnThis();
	}

	public AddressBuilder<T, S> fax(String fax) {
		this.fax = fax;
		return returnThis();
	}

	public AddressBuilder<T, S> tax(boolean tax) {
		this.tax = tax;
		return returnThis();
	}

	public AddressBuilder<T, S> re(boolean re) {
		this.re = re;
		return returnThis();
	}

	public AddressBuilder<T, S> reverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
		return returnThis();
	}
	
	public LocationBuilder<AddressBuilder<T, S>> location() {
		return location;
	}
	
	public AddressBuilder<T, S> name(String name) {
		this.name = name;
		return returnThis();
	}

	public UserAddress build() {
		UserAddressImpl userAddress = new UserAddressImpl();
		setElements(userAddress);
		return userAddress;
	}
	
	protected void setElements(UserAddressImpl userAddress) {
		userAddress.setAlias(alias);
		userAddress.setFirstName(firstName);
		userAddress.setLastName(lastName);
		userAddress.setCompany(companyy);
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

	public T done() {
		return parentBuilder;
	}
	
	protected AddressBuilder<T, S> returnThis() {
		return this;
	}
}
