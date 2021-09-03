package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderAdditionalInformation;
import com.logicommerce.sdk.models.order.implementations.OrderAdditionalInformationImpl;

public class OrderAdditionalInformationBuilder<T> {

	protected T parentBuilder;

	protected String name;

	protected String value;

	public OrderAdditionalInformationBuilder() {
	}

	public OrderAdditionalInformationBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderAdditionalInformationBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	public OrderAdditionalInformationBuilder<T> value(String value) {
		this.value = value;
		return this;
	}

	public OrderAdditionalInformation build() {
		OrderAdditionalInformationImpl information = new OrderAdditionalInformationImpl();
		information.setName(name);
		information.setValue(value);
		return information;
	}

	public T done() {
		return parentBuilder;
	}
}