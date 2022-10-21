package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.SubscriptionActionStatus;
import com.logicommerce.sdk.enums.SubscriptionMessageType;
import com.logicommerce.sdk.enums.SubscriptionStatus;

public class SubscriptionResponseImplBuilder {

	private SubscriptionActionStatus actionStatus;

	private SubscriptionStatus status;

	private SubscriptionMessageType messageType;

	private String message;

	public SubscriptionResponseImplBuilder() {
		messageType = SubscriptionMessageType.INFO;
		message = "";
	}

	public SubscriptionResponseImplBuilder actionStatus(SubscriptionActionStatus actionStatus) {
		this.actionStatus = actionStatus;
		return this;
	}

	public SubscriptionResponseImplBuilder status(SubscriptionStatus status) {
		this.status = status;
		return this;
	}

	public SubscriptionResponseImplBuilder responseType(SubscriptionMessageType messageType) {
		this.messageType = messageType;
		return this;
	}

	public SubscriptionResponseImplBuilder message(String message) {
		this.message = message;
		return this;
	}

	public SubscriptionResponse build() {
		SubscriptionResponseImpl response = new SubscriptionResponseImpl();
		response.setActionStatus(actionStatus);
		response.setStatus(status);
		response.setMessageType(messageType);
		response.setMessage(message);
		return response;
	}
}
