package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WebhookResponseType;

/**
 * <p>WebhookResponseImplBuilder class.</p>
 *
 * @author LogiCommerce
 * @since 2.4.0
 */
public class WebhookResponseImplBuilder {

	private WebhookResponseType type;

	private String message;

	public WebhookResponseImplBuilder() {
		type = WebhookResponseType.NO_DATA;
		message = "";
	}

	/**
	 * <p>
	 * Set message
	 * </p>
	 *
	 * @return a WebhookResponseImplBuilder object
	 */
	public WebhookResponseImplBuilder message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * <p>
	 * Set type of the response
	 * </p>
	 *
	 * @return a WebhookResponseImplBuilder object
	 */
	public WebhookResponseImplBuilder type(WebhookResponseType type) {
		this.type = type;
		return this;
	}

	public WebhookResponse build() {
		WebhookResponseImpl response = new WebhookResponseImpl();
		response.setType(type);
		response.setMessage(message);
		return response;
	}
}
