package com.logicommerce.sdk.models.validator;

/**
 * ViesInformation builder
 *
 * @author LogiCommerce
 * @see ViesInformation
 * @since 2.7.5
 */
public class ViesInformationBuilder {

	private ViesValidationBuilder parent;

	private String vat;

	private String name;

	private String state;

	private String city;

	private String postalCode;

	private String address;

	public ViesInformationBuilder() {}

	ViesInformationBuilder(ViesValidationBuilder parent) {
		this.parent = parent;
	}

	/**
	 * Sets the VAT number.
	 * @param vat a String
	 * @return a {@link ViesInformationBuilder} object
	 */
	public ViesInformationBuilder vat(String vat) {
		this.vat = vat;
		return this;
	}

	/**
	 * Sets the name.
	 * @param name a String
	 * @return a {@link ViesInformationBuilder} object
	 */
	public ViesInformationBuilder name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Sets the state.
	 * @param state a String
	 * @return a {@link ViesInformationBuilder} object
	 */
	public ViesInformationBuilder state(String state) {
		this.state = state;
		return this;
	}

	/**
	 * Sets the city.
	 * @param city a String
	 * @return a {@link ViesInformationBuilder} object
	 */
	public ViesInformationBuilder city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * Sets the postal code.
	 * @param postalCode a String
	 * @return a {@link ViesInformationBuilder} object
	 */
	public ViesInformationBuilder postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * Sets the address.
	 * @param address a String
	 * @return a {@link ViesInformationBuilder} object
	 */
	public ViesInformationBuilder address(String address) {
		this.address = address;
		return this;
	}

	/**
	 * Finishes the nested builder and returns to the parent {@link ViesValidationBuilder}.
	 * @return the parent builder
	 */
	public ViesValidationBuilder done() {
		return parent.viesInformation(build());
	}

	/**
	 * Builds a {@link ViesInformationImpl} object.
	 * @return a {@link ViesInformation} object
	 */
	public ViesInformation build() {
		ViesInformationImpl viesInformation = new ViesInformationImpl();
		viesInformation.setVat(vat);
		viesInformation.setName(name);
		viesInformation.setState(state);
		viesInformation.setCity(city);
		viesInformation.setPostalCode(postalCode);
		viesInformation.setAddress(address);
		return viesInformation;
	}
}
