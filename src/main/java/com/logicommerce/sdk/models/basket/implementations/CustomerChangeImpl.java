package com.logicommerce.sdk.models.basket.implementations;

import com.logicommerce.sdk.models.basket.CustomerChange;

/**
 * <p>Implementation of {@link CustomerChange}.</p>
 *
 * @see com.logicommerce.sdk.builders.basket.CustomerChangeBuilder
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class CustomerChangeImpl implements CustomerChange {

	private String email;

	private String firstName;

	private String lastName;

	private String phone;

	/**
	 * <p>Constructor for CustomerChangeImpl.</p>
	 */
	public CustomerChangeImpl() {
		// fields are set with the setters
	}

	/** {@inheritDoc} */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <p>Setter for the field <code>email</code>.</p>
	 *
	 * @param email the email, or null to leave it unchanged
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** {@inheritDoc} */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <p>Setter for the field <code>firstName</code>.</p>
	 *
	 * @param firstName the first name, or null to leave it unchanged
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/** {@inheritDoc} */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <p>Setter for the field <code>lastName</code>.</p>
	 *
	 * @param lastName the last name, or null to leave it unchanged
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** {@inheritDoc} */
	@Override
	public String getPhone() {
		return phone;
	}

	/**
	 * <p>Setter for the field <code>phone</code>.</p>
	 *
	 * @param phone the phone, or null to leave it unchanged
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
