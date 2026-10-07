package com.logicommerce.sdk.models.order.list;

import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.Gender;

/**
 * OrderListCustomer model builder.
 *
 * @author LogiCommerce
 * @see OrderListCustomer
 * @since 2.8.5
 */
public class OrderListCustomerBuilder {

	private String email;

	private LocalDateTime lastUsed;

	private Gender gender;

	private OrderListCustomerInvoicingAddress invoicingAddress;

	private OrderListCustomerAddress shippingAddress;

	/**
	 * Sets the email.
	 *
	 * @param email a String
	 * @return a {@link OrderListCustomerBuilder} object
	 */
	public OrderListCustomerBuilder email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Sets the lastUsed.
	 *
	 * @param lastUsed a LocalDateTime
	 * @return a {@link OrderListCustomerBuilder} object
	 */
	public OrderListCustomerBuilder lastUsed(LocalDateTime lastUsed) {
		this.lastUsed = lastUsed;
		return this;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender a Gender
	 * @return a {@link OrderListCustomerBuilder} object
	 */
	public OrderListCustomerBuilder gender(Gender gender) {
		this.gender = gender;
		return this;
	}

	/**
	 * Sets the invoicingAddress.
	 *
	 * @param invoicingAddress a OrderListCustomerInvoicingAddress
	 * @return a {@link OrderListCustomerBuilder} object
	 */
	public OrderListCustomerBuilder invoicingAddress(OrderListCustomerInvoicingAddress invoicingAddress) {
		this.invoicingAddress = invoicingAddress;
		return this;
	}

	/**
	 * Sets the shippingAddress.
	 *
	 * @param shippingAddress a OrderListCustomerAddress
	 * @return a {@link OrderListCustomerBuilder} object
	 */
	public OrderListCustomerBuilder shippingAddress(OrderListCustomerAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	/**
	 * Builds a {@link OrderListCustomerImpl} object.
	 *
	 * @return a {@link OrderListCustomer} object
	 */
	public OrderListCustomer build() {
		OrderListCustomerImpl orderListCustomer = new OrderListCustomerImpl();
		orderListCustomer.setEmail(email);
		orderListCustomer.setLastUsed(lastUsed);
		orderListCustomer.setGender(gender);
		orderListCustomer.setInvoicingAddress(invoicingAddress);
		orderListCustomer.setShippingAddress(shippingAddress);
		return orderListCustomer;
	}

}
