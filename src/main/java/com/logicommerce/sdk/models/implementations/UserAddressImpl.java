package com.logicommerce.sdk.models.implementations;

import com.logicommerce.sdk.models.UserAddress;

public class UserAddressImpl extends AddressImpl implements UserAddress {
	
	private boolean defaultAddress;

	private String alias;

	private String firstName;

	private String lastName;

	private String company;

	private String addressAdditionalInformation;

	private String number;

	private String fax;

	private String nif;

	private String vat;

	private boolean tax;

	private boolean re;

	private boolean reverseChargeVat;

	public boolean isDefaultAddress() {
		return defaultAddress;
	}

	public void setDefaultAddress(boolean defaultAddress) {
		this.defaultAddress = defaultAddress;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddressAdditionalInformation() {
		return addressAdditionalInformation;
	}

	public void setAddressAdditionalInformation(String addressAdditionalInformation) {
		this.addressAdditionalInformation = addressAdditionalInformation;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public boolean isTax() {
		return tax;
	}

	public void setTax(boolean tax) {
		this.tax = tax;
	}

	public boolean isRe() {
		return re;
	}

	public void setRe(boolean re) {
		this.re = re;
	}

	public boolean isReverseChargeVat() {
		return reverseChargeVat;
	}

	public void setReverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
	}

	public String getName() {
		if (getCompany() != null && getCompany().isEmpty()) {
			return getCompany();
		}
		return String.format("%s %s", getFirstName(), getLastName());
	}
}