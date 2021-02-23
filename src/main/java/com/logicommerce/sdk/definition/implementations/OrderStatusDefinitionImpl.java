package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.enums.OrderStatusType;

public class OrderStatusDefinitionImpl implements OrderStatusDefinition {

	private OrderStatusType status;
	private Integer substatus;
	
	public OrderStatusDefinitionImpl(OrderStatusType status, Integer substatus) {
		this.status = status;
		this.substatus = substatus;
	}
	
	@Override
	public OrderStatusType getStatus() {
		return status;
	}

	@Override
	public Integer getSubstatus() {
		return substatus;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private OrderStatusType status;
		private Integer substatus;

		public Builder() {

		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> status(OrderStatusType status) {
			this.status = status;
			return this;
		}

		public Builder<T> substatus(Integer substatus) {
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
}
