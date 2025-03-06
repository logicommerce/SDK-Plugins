package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WebhookResponseType;

/**
 * <p>WebhookResponse interface.</p>
 *
 * @author LogiCommerce
 * @since 2.4.0
 */
public interface WebhookResponse {

	/**
	 * <p>getMessage.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getMessage();

	/**
	 * <p>Get payment validate response type.<br>
	 * 	NO_DATA,<br>
	 *	XML,<br>
	 *  JSON: for a json response type.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.WebhookResponseType} object
	 */
	WebhookResponseType getType();

}
