package com.logicommerce.sdk.models.payment;

public class PaymentDataSimpleBuilder<S, T> extends PaymentDataBuilder<S, T> {

	public PaymentDataSimpleBuilder(S parentBuilder) {
		super(parentBuilder);
	}

	@Override
	protected T build() {
		return null;
	}

}
