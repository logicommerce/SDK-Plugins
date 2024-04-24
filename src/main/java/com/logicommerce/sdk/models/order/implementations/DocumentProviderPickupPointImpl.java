package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.implementations.AddressImpl;
import com.logicommerce.sdk.models.order.DocumentProviderPickupPoint;

/**
 * <p>DocumentProviderPickupPointImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.8
 */
public class DocumentProviderPickupPointImpl extends AddressImpl implements DocumentProviderPickupPoint {

	private String key;
	
	private String name;

	private String email;

	/**
	 * <p>Getter for the field <code>key</code>.</p>
	 *
	 * @return a String
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a String
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <p>Getter for the field <code>email</code>.</p>
	 *
	 * @return a String
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <p>Setter for the field <code>key</code>.</p>
	 *
	 * @param key a {@link java.lang.String} object
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Setter for the field <code>email</code>.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
