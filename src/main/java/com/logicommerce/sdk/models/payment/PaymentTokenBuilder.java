package com.logicommerce.sdk.models.payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentTokenBuilder {

	private String token;
	private Map<String, String> data;

	public PaymentTokenBuilder token(String token) {
		this.token = token;
		return this;
	}

	public PaymentTokenBuilder addItem(String name, String value) {
		if (data == null) {
			data = new HashMap<>();
		}
		data.put(name, value);
		return this;
	}

	public PaymentToken build() {
		return new PaymentTokenImpl(token, data);
	}
}
