package com.logicommerce.sdk.lib.router;

/**
 * <p>RouterClientException class</p>
 *
 * @author LogiCommerce
 * @since 2.7.2
 */
public class RouterClientException extends Exception {

	private final int statusCode;

	public RouterClientException(int statusCode, String message) {
		super(message);
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}
}
