package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.implementations.AddressImpl;
import com.logicommerce.sdk.models.order.ShipmentAddress;

public class ShipmentAddressImpl extends AddressImpl implements ShipmentAddress{

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}