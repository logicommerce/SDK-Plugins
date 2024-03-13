package com.logicommerce.sdk.models;

import java.util.Map;

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
	 * Gets the address associated with the express checkout validation.
	 * 
	 * @return the {@link Address} object.
	 */
	Address getAddress();

	/**
	 * Gets additional data associated with the express checkout validation.
	 * 
	 * @return a map containing additional data.
	 */
	Map<String, String> getAdditionalData();

}
