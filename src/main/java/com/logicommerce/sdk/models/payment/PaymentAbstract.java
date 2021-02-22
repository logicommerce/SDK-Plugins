package com.logicommerce.sdk.models.payment;

public abstract class PaymentAbstract {

	private String message;

	private boolean success;

	private String transactionId;

	private PaymentData data;

	public PaymentData getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public void setData(PaymentData data) {
		this.data = data;
	}

}
