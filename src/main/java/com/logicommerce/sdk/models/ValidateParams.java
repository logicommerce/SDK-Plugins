package com.logicommerce.sdk.models;

import java.util.Map;

/**
 * The ValidateParams interface represents the parameters and body required for validation.
 * 
 * @author LogiCommerce
 * @since 1.3.5
 */
public interface ValidateParams {

	/**
	 * Returns the parameters required for validation.
	 *
	 * @return a map containing the parameters
	 */
	Map<String, String> getParams();

	/**
	 * Returns the body required for validation.
	 *
	 * @return the body as a string
	 */
	String getBody();
}
