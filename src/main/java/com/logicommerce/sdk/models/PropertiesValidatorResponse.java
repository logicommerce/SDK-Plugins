package com.logicommerce.sdk.models;

import java.util.Map;

/**
 * PropertiesValidatorResponse class.
 * It is used for validate property values from the LogiCommerce
 * 
 * @author LogiCommerce
 * @since 1.1.16
 */
public class PropertiesValidatorResponse {

	private boolean valid;
	private Map<String, String> errors;

	/**
	 * Instantiates a new properties validator response.
	 */
	public PropertiesValidatorResponse() {}

	/**
	 * Instantiates a new properties validator response.
	 *
	 * @param valid a boolean value
	 * @param errors a {@link java.util.Map Map}&lt;{@link String}, {@link String}&gt; object
	 */
	public PropertiesValidatorResponse(boolean valid, Map<String, String> errors) {
		this.valid = valid;
		this.errors = errors;
	}

	/**
	 * Checks if is valid.
	 *
	 * @return true, if is valid
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * Sets the valid.
	 *
	 * @param valid a boolean value
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	/**
	 * Sets the errors.
	 *
	 * @param errors a {@link java.util.Map Map}&lt;{@link String}, {@link String}&gt; object
	 */
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	/**
	 * Gets the errors.
	 *
	 * @return a {@link java.util.Map Map}&lt;{@link String}, {@link String}&gt; object
	 */
	public Map<String, String> getErrors() {
		return errors;
	}

}
