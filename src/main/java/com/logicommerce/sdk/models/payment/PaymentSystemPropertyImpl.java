package com.logicommerce.sdk.models.payment;

import java.util.Map;

public class PaymentSystemPropertyImpl implements PaymentSystemProperty {

	private String name;

	private Map<String, String> values;
	
	public PaymentSystemPropertyImpl() {

	}

	public PaymentSystemPropertyImpl(String name, Map<String, String> values) {
		setName(name);
		setValues(values);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Map<String, String> getValues() {
		return values;
	}

	@Override
	public void setValues(Map<String, String> values) {
		this.values = values;
	}

}
