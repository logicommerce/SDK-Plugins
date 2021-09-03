package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.builders.AddressBuilder;
import com.logicommerce.sdk.enums.Gender;
import com.logicommerce.sdk.models.UserAddress;
import com.logicommerce.sdk.models.order.OrderUser;
import com.logicommerce.sdk.models.order.implementations.OrderUserImpl;

public class OrderUserBuilder<T> {

	private T parentBuilder;

	protected String email;

	protected Gender gender;

	protected AddressBuilder<OrderUserBuilder<T>, UserAddress> billingAddress;

	protected AddressBuilder<OrderUserBuilder<T>, UserAddress> shippingAddress;

	public OrderUserBuilder(T parentBuilder) {
		this.parentBuilder = parentBuilder;
		this.billingAddress = new AddressBuilder<>(this);
		this.shippingAddress = new AddressBuilder<>(this);
	}
	
	public OrderUserBuilder<T> email(String email) {
		this.email = email;
		return this;
	}

	public OrderUserBuilder<T> gender(Gender gender) {
		this.gender = gender;
		return this;
	}
	
	public AddressBuilder<OrderUserBuilder<T>, UserAddress> billingAddress() {
		return billingAddress;
	}
	
	public AddressBuilder<OrderUserBuilder<T>, UserAddress> shippingAddress() {
		return shippingAddress;
	}

	public OrderUser build() {
		OrderUserImpl user = new OrderUserImpl();
		user.setEmail(email);
		user.setGender(gender);
		user.setBillingAddress(billingAddress.build());
		user.setShippingAddress(shippingAddress.build());
		return user;
	}

	public T done() {
		return parentBuilder;
	}

}
