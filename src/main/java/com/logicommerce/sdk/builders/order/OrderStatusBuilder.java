package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.order.OrderStatus;
import com.logicommerce.sdk.models.order.implementations.OrderStatusImpl;

public class OrderStatusBuilder<T> extends OrderBaseStatusBuilder<OrderStatusType, T> {
	

	public OrderStatusBuilder() {
		super();
	}

	public OrderStatusBuilder(T parentBuilder) {
		super(parentBuilder);
	}

	@Override
	public OrderStatus build() {
		OrderStatusImpl status = new OrderStatusImpl();
		setFields(status);
		return status;
	}
}