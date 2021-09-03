package com.logicommerce.sdk.models.payment;

public class PaymentDataNoPayImpl implements PaymentDataNoPay {

	private String token;

	public PaymentDataNoPayImpl(String token) {
		this.token = token;
	}

	@Override
	public String getToken() {
		return token;
	}

}
