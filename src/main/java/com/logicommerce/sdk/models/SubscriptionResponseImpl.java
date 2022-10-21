package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.SubscriptionActionStatus;
import com.logicommerce.sdk.enums.SubscriptionMessageType;
import com.logicommerce.sdk.enums.SubscriptionStatus;

/**
 * SubscriptionResponse Implementation
 *
 * @author Logicommerce
 * @since 1.1.2
 *
 */
public class SubscriptionResponseImpl implements SubscriptionResponse {

	private SubscriptionActionStatus actionStatus;

	private SubscriptionStatus status;

	private SubscriptionMessageType messageType;

	private String message;

	public SubscriptionResponseImpl() {

	}

	public SubscriptionResponseImpl(SubscriptionActionStatus actionStatus, SubscriptionStatus status, String message) {
		setActionStatus(actionStatus);
		setStatus(status);
		setMessage(message);
		setMessageType(SubscriptionMessageType.INFO);
	}

	@Override
	public SubscriptionActionStatus getActionStatus() {
		return actionStatus;
	}

	@Override
	public SubscriptionStatus getStatus() {
		return status;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public SubscriptionMessageType getMessageType() {
		return messageType;
	}

	public void setActionStatus(SubscriptionActionStatus actionStatus) {
		this.actionStatus = actionStatus;
	}

	public void setStatus(SubscriptionStatus status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessageType(SubscriptionMessageType messageType) {
		this.messageType = messageType;
	}

}
