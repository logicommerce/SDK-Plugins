package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.OrderShipmentStatusDefinition;
import com.logicommerce.sdk.enums.OrderShipmentStatusType;

/**
 * <p>OrderShipmentStatusDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShipmentStatusDefinitionImpl implements OrderShipmentStatusDefinition {

	private OrderShipmentStatusType status;
	private Integer substatus;
	
	/**
	 * <p>Constructor for OrderShipmentStatusDefinitionImpl.</p>
	 *
	 * @param status a {@link com.logicommerce.sdk.enums.OrderShipmentStatusType} object
	 * @param substatus a {@link java.lang.Integer} object
	 */
	public OrderShipmentStatusDefinitionImpl(OrderShipmentStatusType status, Integer substatus) {
		this.status = status;
		this.substatus = substatus;
	}
	
	/** {@inheritDoc} */
	@Override
	public OrderShipmentStatusType getStatus() {
		return status;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getSubstatus() {
		return substatus;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private OrderShipmentStatusType status;
		private Integer substatus;

		public Builder() {

		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> status(OrderShipmentStatusType status) {
			this.status = status;
			return this;
		}

		public Builder<T> substatus(Integer substatus) {
			this.substatus = substatus;
			return this;
		}

		public OrderShipmentStatusDefinition build() {
			return new OrderShipmentStatusDefinitionImpl(status, substatus);
		}
		
		public T done() {
			return parentBuilder;
		}

	}
}
