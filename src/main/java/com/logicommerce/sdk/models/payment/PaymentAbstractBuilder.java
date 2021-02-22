package com.logicommerce.sdk.models.payment;

public abstract class PaymentAbstractBuilder<S, T> {

	protected boolean success;

	protected String message;

	protected PaymentDataBuilder<S, ?> content;

	protected String transactionId;

	public S ok() {
		this.success = true;
		return returnThis();
	}

	public S ko() {
		this.success = false;
		return returnThis();
	}

	public S message(String message) {
		this.message = message;
		return returnThis();
	}

	public S transactionId(String transactionId) {
		this.transactionId = transactionId;
		return returnThis();
	}

	public abstract T build();
	
	public abstract S returnThis();
	
	protected void setItems(PaymentAbstract paymentResponse) {
		paymentResponse.setMessage(message);
		paymentResponse.setSuccess(success);
		paymentResponse.setTransactionId(transactionId);
		if (content != null) {
			paymentResponse.setData((PaymentData) content.build());
		}
	}

}
