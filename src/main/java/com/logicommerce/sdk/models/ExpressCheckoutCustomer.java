package com.logicommerce.sdk.models;

/**
 * Represents an express checkout customer.
 * 
 * @author LogiCommerce
 * @since 1.3.5
 */
public class ExpressCheckoutCustomer {

	private String email;
	private String firstName;
	private String lastName;
	private Address invoicingAddress;
	private Address shippingAddress;

	/**
	 * Gets the email of the customer.
	 *
	 * @return the email of the customer
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of the customer.
	 *
	 * @param email the email of the customer
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the first name of the customer.
	 *
	 * @return the first name of the customer
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the customer.
	 *
	 * @param firstName the first name of the customer
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name of the customer.
	 *
	 * @return the last name of the customer
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the customer.
	 *
	 * @param lastName the last name of the customer
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the invocing address of the customer. Also known as billing address.
	 *
	 * @return the invocing {@link Address} of the customer
	 */
	public Address getInvoicingAddress() {
		return invoicingAddress;
	}

	/**
	 * Sets the invocing address of the customer. Also known as billing address.
	 *
	 * @param invoicingAddress the invocing {@link Address} of the customer
	 */
	public void setInvoicingAddress(Address invoicingAddress) {
		this.invoicingAddress = invoicingAddress;
	}

	/**
	 * Gets the shipping address of the customer.
	 *
	 * @return the shipping {@link Address} of the customer
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * Sets the shipping address of the customer.
	 *
	 * @param shippingAddress the shipping {@link Address} of the customer
	 */
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
