package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.OrderShipmentStatusType;
import com.logicommerce.sdk.models.order.OrderShipmentStatus;
import com.logicommerce.sdk.models.order.implementations.OrderShipmentStatusImpl;

/**
 * <p>OrderShipmentStatusBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShipmentStatusBuilder<T> extends OrderBaseStatusBuilder<OrderShipmentStatusType, T> {

	/**
	 * <p>Constructor for OrderShipmentStatusBuilder.</p>
	 */
	public OrderShipmentStatusBuilder() {
		super();
	}

	/**
	 * <p>Constructor for OrderShipmentStatusBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderShipmentStatusBuilder(T parentBuilder) {
		super(parentBuilder);
	}

	/** {@inheritDoc} */
	@Override
	public OrderShipmentStatus build() {
		OrderShipmentStatusImpl status = new OrderShipmentStatusImpl();
		setFields(status);
		return status;
	}
}
