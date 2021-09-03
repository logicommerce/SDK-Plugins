package com.logicommerce.sdk.models.payment;

public class PaymentDataNoPayBuilder<T> extends PaymentDataBuilder<T, PaymentDataNoPay> {

	private String token;

	public PaymentDataNoPayBuilder(T parentBuilder) {
		super(parentBuilder);
	}

	public PaymentDataNoPayBuilder<T> token(String token) {
		this.token = token;
		return this;
	}

	@Override
	protected PaymentDataNoPay build() {
		return new PaymentDataNoPayImpl(token);
	}
}
