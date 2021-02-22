package com.logicommerce.sdk.models.payment;

public class PaymentKeysImpl implements PaymentKeys {

	private String transactionId;

	private String authorizationCode;

	public PaymentKeysImpl() {
		
	}

	public PaymentKeysImpl(String transactionId, String authorizationCode) {
		setTransactionId(transactionId);
		setAuthorizationCode(authorizationCode);
	}

	@Override
	public String getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

}
