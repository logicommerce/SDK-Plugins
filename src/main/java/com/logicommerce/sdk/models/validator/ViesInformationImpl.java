package com.logicommerce.sdk.models.validator;

/**
 * ViesInformation implementation
 *
 * @author LogiCommerce
 * @since 2.7.5
 */
public class ViesInformationImpl implements ViesInformation {

	private String vat;

	private String name;

	private String state;

	private String city;

	private String postalCode;

	private String address;

	/** {@inheritDoc} */
	@Override
	public String getVat() {
		return vat;
	}

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return name;
	}

	/** {@inheritDoc} */
	@Override
	public String getState() {
		return state;
	}

	/** {@inheritDoc} */
	@Override
	public String getCity() {
		return city;
	}

	/** {@inheritDoc} */
	@Override
	public String getPostalCode() {
		return postalCode;
	}

	/** {@inheritDoc} */
	@Override
	public String getAddress() {
		return address;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
