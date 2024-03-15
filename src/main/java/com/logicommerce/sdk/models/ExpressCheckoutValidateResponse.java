package com.logicommerce.sdk.models;

/**
 * Represents the response of the express checkout validation.
 * 
 * @author Logicommerce
 * @since 1.3.5
 */
public class ExpressCheckoutValidateResponse {

	private boolean success;
	private ExpressCheckoutCustomer customer;

	/**
	 * Constructs a new express checkout validation response.
	 */
	public ExpressCheckoutValidateResponse() {}

	/**
	 * Constructs a new express checkout validation response with the given validation status and customer.
	 * 
	 * @param success the validation status.
	 * @param customer the customer associated with the validation.
	 */
	public ExpressCheckoutValidateResponse(boolean success, ExpressCheckoutCustomer customer) {
		this.success = success;
		this.customer = customer;
	}

	/**
	 * Checks if the express checkout validation is successful.
	 * 
	 * @return true if the validation is valid, false otherwise.
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Sets the validation status.
	 * 
	 * @param success the validation status.
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * Gets the customer associated with the express checkout validation.
	 * 
	 * @return the customer associated with the validation. {@link ExpressCheckoutCustomer}.
	 */
	public ExpressCheckoutCustomer getCustomer() {
		return customer;
	}

	/**
	 * Sets the customer associated with the express checkout validation.
	 * 
	 * @param customer the customer associated with the validation. {@link ExpressCheckoutCustomer}.
	 */
	public void setCustomer(ExpressCheckoutCustomer customer) {
		this.customer = customer;
	}

}
