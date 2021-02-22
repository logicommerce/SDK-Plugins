package com.logicommerce.sdk.definition;

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

}
