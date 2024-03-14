package com.logicommerce.sdk.models;

/**
 * Represents the response of the express checkout validation.
 * 
 * @author Logicommerce
 * @since 1.3.5
 */
public interface ExpressCheckoutValidateResponse {

	/**
	 * Checks if the express checkout validation is valid.
	 * 
	 * @return true if the validation is valid, false otherwise.
	 */
	boolean isValid();

	/**
	 * Gets the user associated with the express checkout validation.
	 * 
	 * @return the user associated with the validation.
	 */
	ExpressCheckoutCustomer getUser();

}
