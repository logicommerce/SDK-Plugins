package com.logicommerce.sdk.models.payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentTokenImpl implements PaymentToken {

	private String token;
	private Map<String, String> data;

	public PaymentTokenImpl() {

	}

	public PaymentTokenImpl(String token, Map<String, String> data) {
		setToken(token);
		setData(data);
	}

	@Override
	public String getToken() {
		return token;
	}

	@Override
	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public Map<String, String> getData() {
		return data;
	}

	@Override
	public void setData(Map<String, String> data) {
		this.data = data;
	}

	@Override
	public void addItem(String key, String value) {
		if (data == null) {
			data = new HashMap<>();
		}
		data.put(key, value);
	}

}
