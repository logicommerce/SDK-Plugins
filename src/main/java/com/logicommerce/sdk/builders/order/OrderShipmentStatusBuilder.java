package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.OrderShipmentStatusType;
import com.logicommerce.sdk.models.order.OrderShipmentStatus;
import com.logicommerce.sdk.models.order.implementations.OrderShipmentStatusImpl;

public class OrderShipmentStatusBuilder<T> extends OrderBaseStatusBuilder<OrderShipmentStatusType, T> {

	public OrderShipmentStatusBuilder() {
		super();
	}

	public OrderShipmentStatusBuilder(T parentBuilder) {
		super(parentBuilder);
	}

	@Override
	public OrderShipmentStatus build() {
		OrderShipmentStatusImpl status = new OrderShipmentStatusImpl();
		setFields(status);
		return status;
	}
}
