package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WebhookResponseType;

/**
 * WebhookResponse Implementation
 *
 * @author LogiCommerce
 * @since 2.4.0
 *
 */
public class WebhookResponseImpl implements WebhookResponse {

	private WebhookResponseType type;

	private String message;
	
	public WebhookResponseImpl() {}

	public WebhookResponseImpl(WebhookResponseType type, String message) {
		this.type = type;
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public WebhookResponseType getType() {
		return type;
	}

	public void setType(WebhookResponseType type) {
		this.type = type;
	}
}
