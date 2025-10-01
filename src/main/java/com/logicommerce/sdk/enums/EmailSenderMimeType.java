package com.logicommerce.sdk.enums;

/**
 * <p>EmailSenderMimeType</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public enum EmailSenderMimeType {

	TEXT_PLAIN("text/plain; charset=utf-8"),
	TEXT_HTML("text/html; charset=utf-8");

	private String value;

	private EmailSenderMimeType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}