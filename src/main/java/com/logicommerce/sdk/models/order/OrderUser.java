package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.Gender;
import com.logicommerce.sdk.models.UserAddress;

public interface OrderUser {

	String getEmail();

	Gender getGender();

	UserAddress getBillingAddress();

	UserAddress getShippingAddress();

}
