package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.Gender;
import com.logicommerce.sdk.models.UserAddress;
import com.logicommerce.sdk.models.implementations.UserAddressImpl;
import com.logicommerce.sdk.models.order.OrderUser;
import com.logicommerce.utilities.annotations.Uses;

/**
 * <p>OrderUserImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderUserImpl implements OrderUser {

	private String email;

	private Gender gender;

	@Uses(value = UserAddressImpl.class)
	private UserAddress billingAddress;

	@Uses(value = UserAddressImpl.class)
	private UserAddress shippingAddress;

	/**
	 * <p>Getter for the field <code>email</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <p>Getter for the field <code>gender</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.Gender} object
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * <p>Getter for the field <code>billingAddress</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.UserAddress} object
	 */
	public UserAddress getBillingAddress() {
		return billingAddress;
	}

	/**
	 * <p>Getter for the field <code>shippingAddress</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.UserAddress} object
	 */
	public UserAddress getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * <p>Setter for the field <code>email</code>.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * <p>Setter for the field <code>gender</code>.</p>
	 *
	 * @param gender a {@link com.logicommerce.sdk.enums.Gender} object
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * <p>Setter for the field <code>billingAddress</code>.</p>
	 *
	 * @param billingAddress a {@link com.logicommerce.sdk.models.UserAddress} object
	 */
	public void setBillingAddress(UserAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * <p>Setter for the field <code>shippingAddress</code>.</p>
	 *
	 * @param shippingAddress a {@link com.logicommerce.sdk.models.UserAddress} object
	 */
	public void setShippingAddress(UserAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
