package com.logicommerce.sdk.builders.basket;

import com.logicommerce.sdk.models.basket.CustomerChange;
import com.logicommerce.sdk.models.basket.implementations.CustomerChangeImpl;

/**
 * <p>Builder of {@link CustomerChange}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class CustomerChangeBuilder {

	private String email;

	private String firstName;

	private String lastName;

	private String phone;

	/**
	 * <p>Constructor for CustomerChangeBuilder.</p>
	 */
	public CustomerChangeBuilder() {
		// defaults are set in the fields
	}

	/**
	 * <p>Sets <code>email</code>.</p>
	 *
	 * @param email the email, or null to leave it unchanged
	 * @return this builder
	 */
	public CustomerChangeBuilder email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * <p>Sets <code>firstName</code>.</p>
	 *
	 * @param firstName the first name, or null to leave it unchanged
	 * @return this builder
	 */
	public CustomerChangeBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * <p>Sets <code>lastName</code>.</p>
	 *
	 * @param lastName the last name, or null to leave it unchanged
	 * @return this builder
	 */
	public CustomerChangeBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * <p>Sets <code>phone</code>.</p>
	 *
	 * @param phone the phone, or null to leave it unchanged
	 * @return this builder
	 */
	public CustomerChangeBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * <p>Builds the {@link CustomerChange}.</p>
	 *
	 * @return a {@link CustomerChange} object
	 */
	public CustomerChange build() {
		CustomerChangeImpl result = new CustomerChangeImpl();
		result.setEmail(email);
		result.setFirstName(firstName);
		result.setLastName(lastName);
		result.setPhone(phone);
		return result;
	}

}
