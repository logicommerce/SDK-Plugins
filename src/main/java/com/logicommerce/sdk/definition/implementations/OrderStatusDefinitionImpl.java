package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.enums.OrderStatusType;

/**
 * <p>OrderStatusDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderStatusDefinitionImpl implements OrderStatusDefinition {

	private OrderStatusType status;
	private Integer substatus;
	
	/**
	 * <p>Constructor for OrderStatusDefinitionImpl.</p>
	 *
	 * @param status a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 * @param substatus a {@link java.lang.Integer} object
	 */
	public OrderStatusDefinitionImpl(OrderStatusType status, Integer substatus) {
		this.status = status;
		this.substatus = substatus;
	}
	
	/** {@inheritDoc} */
	@Override
	public OrderStatusType getStatus() {
		return status;
	}

	/** {@inheritDoc} */
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
