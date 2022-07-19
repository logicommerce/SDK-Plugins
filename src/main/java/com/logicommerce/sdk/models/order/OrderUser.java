package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.Gender;
import com.logicommerce.sdk.models.UserAddress;

/**
 * <p>OrderUser interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderUser {

	/**
	 * <p>getEmail.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getEmail();

	/**
	 * <p>getGender.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.Gender} object
	 */
	Gender getGender();

	/**
	 * <p>getBillingAddress.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.UserAddress} object
	 */
	UserAddress getBillingAddress();

	/**
	 * <p>getShippingAddress.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.UserAddress} object
	 */
	UserAddress getShippingAddress();

}
