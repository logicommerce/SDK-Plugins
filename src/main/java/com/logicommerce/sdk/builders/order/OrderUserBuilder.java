package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.builders.UserAddressBuilder;
import com.logicommerce.sdk.enums.Gender;
import com.logicommerce.sdk.models.UserAddress;
import com.logicommerce.sdk.models.order.OrderUser;
import com.logicommerce.sdk.models.order.implementations.OrderUserImpl;

/**
 * <p>OrderUserBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderUserBuilder<T> {

	private T parentBuilder;

	protected String email;

	protected Gender gender;

	protected UserAddressBuilder<OrderUserBuilder<T>, UserAddress> billingAddress;

	protected UserAddressBuilder<OrderUserBuilder<T>, UserAddress> shippingAddress;

	/**
	 * <p>Constructor for OrderUserBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderUserBuilder(T parentBuilder) {
		this.parentBuilder = parentBuilder;
		this.billingAddress = new UserAddressBuilder<>(this);
		this.shippingAddress = new UserAddressBuilder<>(this);
	}
	
	/**
	 * <p>email.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderUserBuilder} object
	 */
	public OrderUserBuilder<T> email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * <p>gender.</p>
	 *
	 * @param gender a {@link com.logicommerce.sdk.enums.Gender} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderUserBuilder} object
	 */
	public OrderUserBuilder<T> gender(Gender gender) {
		this.gender = gender;
		return this;
	}
	
	/**
	 * <p>billingAddress.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<OrderUserBuilder<T>, UserAddress> billingAddress() {
		return billingAddress;
	}
	
	/**
	 * <p>shippingAddress.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.UserAddressBuilder} object
	 */
	public UserAddressBuilder<OrderUserBuilder<T>, UserAddress> shippingAddress() {
		return shippingAddress;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderUser} object
	 */
	public OrderUser build() {
		OrderUserImpl user = new OrderUserImpl();
		user.setEmail(email);
		user.setGender(gender);
		user.setBillingAddress(billingAddress.build());
		user.setShippingAddress(shippingAddress.build());
		return user;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}

}
