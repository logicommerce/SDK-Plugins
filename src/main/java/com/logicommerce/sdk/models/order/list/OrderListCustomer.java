package com.logicommerce.sdk.models.order.list;

import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.Gender;

/**
 * Customer of an order in order listings.
 *
 * @author LogiCommerce
 * @since 2.8.5
 */
public interface OrderListCustomer {

	/**
	 * Returns the email.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getEmail();

	/**
	 * Returns the last used date.
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getLastUsed();

	/**
	 * Returns the gender.
	 *
	 * @return a {@link com.logicommerce.sdk.enums.Gender} object
	 */
	Gender getGender();

	/**
	 * Returns the invoicing address.
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.list.OrderListCustomerInvoicingAddress} object
	 */
	OrderListCustomerInvoicingAddress getInvoicingAddress();

	/**
	 * Returns the shipping address.
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.list.OrderListCustomerAddress} object
	 */
	OrderListCustomerAddress getShippingAddress();

}
