package com.logicommerce.sdk.models.payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystemPropertiesImpl implements PaymentSystemProperties {
	
	private List<PaymentSystemProperty> properties;
	
	public PaymentSystemPropertiesImpl() {

	}
	
	public PaymentSystemPropertiesImpl(List<PaymentSystemProperty> properties) {
		setProperties(properties);
	}
	
	@Override
	public List<PaymentSystemProperty> getProperties() {
		return properties;
	}

	@Override
	public void setProperties(List<PaymentSystemProperty> properties) {
		this.properties = properties;
	}

	@Override
	public void addProperty(PaymentSystemProperty property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}

	@Override
	public void clean() {
		if (properties != null) {
			properties.clear();
		}
	}

}
