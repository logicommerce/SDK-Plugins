package com.logicommerce.sdk.models.implementations;

import com.logicommerce.sdk.models.UserAddress;

/**
 * <p>UserAddressImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class UserAddressImpl extends AddressImpl implements UserAddress {

	private boolean defaultAddress;

	private String alias;

	private String firstName;

	private String lastName;

	private String company;

	private String nif;

	private String vat;

	private boolean tax;

	private boolean re;

	/**
	 * <p>isDefaultAddress.</p>
	 *
	 * @return a boolean
	 */
	@Override
	public boolean isDefaultAddress() {
		return defaultAddress;
	}

	/**
	 * <p>Setter for the field <code>defaultAddress</code>.</p>
	 *
	 * @param defaultAddress a boolean
	 */
	public void setDefaultAddress(boolean defaultAddress) {
		this.defaultAddress = defaultAddress;
	}

	/**
	 * <p>Getter for the field <code>alias</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getAlias() {
		return alias;
	}

	/**
	 * <p>Setter for the field <code>alias</code>.</p>
	 *
	 * @param alias a {@link java.lang.String} object
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * <p>Getter for the field <code>firstName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <p>Setter for the field <code>firstName</code>.</p>
	 *
	 * @param firstName a {@link java.lang.String} object
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * <p>Getter for the field <code>lastName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <p>Setter for the field <code>lastName</code>.</p>
	 *
	 * @param lastName a {@link java.lang.String} object
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * <p>Getter for the field <code>company</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getCompany() {
		return company;
	}

	/**
	 * <p>Setter for the field <code>company</code>.</p>
	 *
	 * @param company a {@link java.lang.String} object
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * <p>Getter for the field <code>nif</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getNif() {
		return nif;
	}

	/**
	 * <p>Setter for the field <code>nif</code>.</p>
	 *
	 * @param nif a {@link java.lang.String} object
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * <p>Getter for the field <code>vat</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getVat() {
		return vat;
	}

	/**
	 * <p>Setter for the field <code>vat</code>.</p>
	 *
	 * @param vat a {@link java.lang.String} object
	 */
	public void setVat(String vat) {
		this.vat = vat;
	}

	/**
	 * <p>isTax.</p>
	 *
	 * @return a boolean
	 */
	@Override
	public boolean isTax() {
		return tax;
	}

	/**
	 * <p>Setter for the field <code>tax</code>.</p>
	 *
	 * @param tax a boolean
	 */
	public void setTax(boolean tax) {
		this.tax = tax;
	}

	/**
	 * <p>isRe.</p>
	 *
	 * @return a boolean
	 */
	@Override
	public boolean isRe() {
		return re;
	}

	/**
	 * <p>Setter for the field <code>re</code>.</p>
	 *
	 * @param re a boolean
	 */
	public void setRe(boolean re) {
		this.re = re;
	}

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getName() {
		if (getCompany() != null && getCompany().isEmpty()) {
			return getCompany();
		}
		return String.format("%s %s", getFirstName(), getLastName());
	}
}
