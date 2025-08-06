package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.implementations.OrderImpl;

/**
 * <p>OrderSdkBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderSdkBuilder extends DocumentSdkBuilder<OrderSdkBuilder> {

	protected OrderStatusType status;

	protected int substatusId;

	protected OrderTotalCurrencyBuilder<OrderSdkBuilder> totalCurrency;

	/**
	 * <p>Constructor for OrderSdkBuilder.</p>
	 */
	public OrderSdkBuilder() {
		status = OrderStatusType.INCIDENTS;
		totalCurrency = new OrderTotalCurrencyBuilder<>(this);
	}

	/**
	 * <p>status.</p>
	 *
	 * @param status a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder status(OrderStatusType status) {
		this.status = status;
		return returnThis();
	}

	/**
	 * <p>substatusId.</p>
	 *
	 * @param substatusId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder substatusId(int substatusId) {
		this.substatusId = substatusId;
		return returnThis();
	}

	/**
	 * <p>
	 * totalCurrency.
	 * </p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalCurrencyBuilder} object
	 */
	public OrderTotalCurrencyBuilder<OrderSdkBuilder> totalCurrency() {
		return totalCurrency;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.Order} object
	 */
	public Order build() {
		OrderImpl order = new OrderImpl();
		setFields(order);
		order.setStatus(status);
		order.setSubstatusId(substatusId);
		order.setTotalCurrency(totalCurrency.build());
		return order;
	}

	@Override
	public OrderSdkBuilder returnThis() {
		return this;
	}
}
