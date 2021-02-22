package com.logicommerce.sdk.models.payment;

public abstract class PaymentDataBuilder<S, T> {

	private S parentBuilder;

	public PaymentDataBuilder(S parentBuilder) {
		this.parentBuilder = parentBuilder;
	}

	public S done() {
		return parentBuilder;
	}

	protected abstract T build();

}
