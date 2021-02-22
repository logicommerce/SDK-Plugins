package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.OrderStatusType;

public class OrderStatusDefinitionBuilder<T> {

	private T parentBuilder;

	private OrderStatusType status;

	private Integer substatus;

	public OrderStatusDefinitionBuilder() {

	}

	public OrderStatusDefinitionBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderStatusDefinitionBuilder<T> status(OrderStatusType status) {
		this.status = status;
		return this;
	}

	public OrderStatusDefinitionBuilder<T> substatus(Integer substatus) {
		this.substatus = substatus;
		return this;
	}

	public OrderStatusDefinition build() {
		return new OrderStatusDefinitionImpl(status, substatus);
	}
	
	public T done() {
		return parentBuilder;
	}

}
