package com.logicommerce.sdk.lib.router;

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
