package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.order.OrderStatus;
import com.logicommerce.sdk.models.order.implementations.OrderStatusImpl;

/**
 * <p>OrderStatusBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderStatusBuilder<T> extends OrderBaseStatusBuilder<OrderStatusType, T> {
	

	/**
	 * <p>Constructor for OrderStatusBuilder.</p>
	 */
	public OrderStatusBuilder() {
		super();
	}

	/**
	 * <p>Constructor for OrderStatusBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderStatusBuilder(T parentBuilder) {
		super(parentBuilder);
	}

	/** {@inheritDoc} */
	@Override
	public OrderStatus build() {
		OrderStatusImpl status = new OrderStatusImpl();
		setFields(status);
		return status;
	}
}
