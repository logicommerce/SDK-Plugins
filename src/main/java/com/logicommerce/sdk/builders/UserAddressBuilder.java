package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.UserAddress;
import com.logicommerce.sdk.models.implementations.UserAddressImpl;

/**
 * <p>AddressBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.3.3
 */
public class UserAddressBuilder<T, S> extends AddressBuilder<T, UserAddressBuilder<T, S>> {

	private boolean defaultAddress;

	protected String alias;

	protected String firstName;

	protected String lastName;

	protected String company;

	protected String vat;

	protected String nif;

	protected boolean tax;

	protected boolean re;

	/**
	 * <p>Constructor for AddressBuilder.</p>
	 */
	public UserAddressBuilder() {
		super();
	}

	/**
	 * <p>Constructor for AddressBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public UserAddressBuilder(T parentBuilder) {
		super(parentBuilder);
	}

	/**
	 * <p>defaultAddress.</p>
	 * 
	 * @since 1.3.3
	 * @param defaultAddress a boolean
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<T, S> defaultAddress(boolean defaultAddress) {
		this.defaultAddress = defaultAddress;
		return returnThis();
	}

	/**
	 * <p>alias.</p>
	 *
	 * @param alias a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<T, S> alias(String alias) {
		this.alias = alias;
		return returnThis();
	}

	/**
	 * <p>firstName.</p>
	 *
	 * @param firstName a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<T, S> firstName(String firstName) {
		this.firstName = firstName;
		return returnThis();
	}

	/**
	 * <p>lastName.</p>
	 *
	 * @param lastName a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<T, S> lastName(String lastName) {
		this.lastName = lastName;
		return returnThis();
	}

	/**
	 * <p>company.</p>
	 *
	 * @param company a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<T, S> company(String company) {
		this.company = company;
		return returnThis();
	}

	/**
	 * <p>vat.</p>
	 *
	 * @param vat a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<T, S> vat(String vat) {
		this.vat = vat;
		return returnThis();
	}

	/**
	 * <p>nif.</p>
	 *
	 * @param nif a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<T, S> nif(String nif) {
		this.nif = nif;
		return returnThis();
	}

	/**
	 * <p>tax.</p>
	 *
	 * @param tax a boolean
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<T, S> tax(boolean tax) {
		this.tax = tax;
		return returnThis();
	}

	/**
	 * <p>re.</p>
	 *
	 * @param re a boolean
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<T, S> re(boolean re) {
		this.re = re;
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
		super.setElements(userAddress);
		userAddress.setDefaultAddress(defaultAddress);
		userAddress.setAlias(alias);
		userAddress.setFirstName(firstName);
		userAddress.setLastName(lastName);
		userAddress.setCompany(company);
		userAddress.setVat(vat);
		userAddress.setNif(nif);
		userAddress.setTax(tax);
		userAddress.setRe(re);
	}

	/**
	 * <p>returnThis.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	protected UserAddressBuilder<T, S> returnThis() {
		return this;
	}
}
