package com.logicommerce.sdk.models.order.list;

import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.Gender;
import com.logicommerce.utilities.annotations.Uses;

/**
 * OrderListCustomer implementation.
 *
 * @author LogiCommerce
 * @see OrderListCustomer
 * @since 2.8.5
 */
public class OrderListCustomerImpl implements OrderListCustomer {

	private String email;

	private LocalDateTime lastUsed;

	private Gender gender;

	@Uses(value = OrderListCustomerInvoicingAddressImpl.class)
	private OrderListCustomerInvoicingAddress invoicingAddress;

	@Uses(value = OrderListCustomerAddressImpl.class)
	private OrderListCustomerAddress shippingAddress;

	/** {@inheritDoc} */
	@Override
	public String getEmail() {
		return email;
	}

	/** {@inheritDoc} */
	@Override
	public LocalDateTime getLastUsed() {
		return lastUsed;
	}

	/** {@inheritDoc} */
	@Override
	public Gender getGender() {
		return gender;
	}

	/** {@inheritDoc} */
	@Override
	public OrderListCustomerInvoicingAddress getInvoicingAddress() {
		return invoicingAddress;
	}

	/** {@inheritDoc} */
	@Override
	public OrderListCustomerAddress getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * Sets the email.
	 *
	 * @param email a String
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Sets the lastUsed.
	 *
	 * @param lastUsed a LocalDateTime
	 */
	public void setLastUsed(LocalDateTime lastUsed) {
		this.lastUsed = lastUsed;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender a Gender
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * Sets the invoicingAddress.
	 *
	 * @param invoicingAddress a OrderListCustomerInvoicingAddress
	 */
	public void setInvoicingAddress(OrderListCustomerInvoicingAddress invoicingAddress) {
		this.invoicingAddress = invoicingAddress;
	}

	/**
	 * Sets the shippingAddress.
	 *
	 * @param shippingAddress a OrderListCustomerAddress
	 */
	public void setShippingAddress(OrderListCustomerAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
