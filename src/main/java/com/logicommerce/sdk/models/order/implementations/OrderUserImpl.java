package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.Gender;
import com.logicommerce.sdk.models.UserAddress;
import com.logicommerce.sdk.models.implementations.UserAddressImpl;
import com.logicommerce.sdk.models.order.OrderUser;
import com.logicommerce.utilities.annotations.Uses;

public class OrderUserImpl implements OrderUser {

	private String email;

	private Gender gender;

	@Uses(value = UserAddressImpl.class)
	private UserAddress billingAddress;

	@Uses(value = UserAddressImpl.class)
	private UserAddress shippingAddress;

	public String getEmail() {
		return email;
	}

	public Gender getGender() {
		return gender;
	}

	public UserAddress getBillingAddress() {
		return billingAddress;
	}

	public UserAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setBillingAddress(UserAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public void setShippingAddress(UserAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}