package com.logicommerce.sdk.builders.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.order.OrderBaseStatus;
import com.logicommerce.sdk.models.order.implementations.OrderBaseStatusImpl;

/**
 * <p>Abstract OrderBaseStatusBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public abstract class OrderBaseStatusBuilder<T, P> {

	private P parentBuilder;

	protected List<OrderStatusActionBuilder<OrderBaseStatusBuilder<T, P>>> actions;

	protected LocalDateTime currentDateTime;

	protected Integer id;

	protected T status;

	protected int substatusId;

	/**
	 * <p>Constructor for OrderBaseStatusBuilder.</p>
	 */
	protected OrderBaseStatusBuilder() {
		id = null;
		actions = new ArrayList<>();
		currentDateTime = LocalDateTime.now();
		substatusId = 0;
	}

	/**
	 * <p>Constructor for OrderBaseStatusBuilder.</p>
	 *
	 * @param parentBuilder a P object
	 */
	protected OrderBaseStatusBuilder(P parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderBaseStatusBuilder} object
	 */
	public OrderBaseStatusBuilder<T, P> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>actions.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderStatusActionBuilder} object
	 */
	public OrderStatusActionBuilder<OrderBaseStatusBuilder<T, P>> actions() {
		OrderStatusActionBuilder<OrderBaseStatusBuilder<T, P>> action = new OrderStatusActionBuilder<>(this);
		actions.add(action);
		return action;
	}

	/**
	 * <p>currentDateTime.</p>
	 *
	 * @param currentDateTime a {@link java.time.LocalDateTime} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderBaseStatusBuilder} object
	 */
	public OrderBaseStatusBuilder<T, P> currentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
		return this;
	}

	/**
	 * <p>status.</p>
	 *
	 * @param status a T object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderBaseStatusBuilder} object
	 */
	public OrderBaseStatusBuilder<T, P> status(T status) {
		this.status = status;
		return this;
	}

	/**
	 * <p>substatusId.</p>
	 *
	 * @param substatusId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderBaseStatusBuilder} object
	 */
	public OrderBaseStatusBuilder<T, P> substatusId(int substatusId) {
		this.substatusId = substatusId;
		return this;
	}

	/**
	 * <p>setFields.</p>
	 *
	 * @param statusLine a {@link com.logicommerce.sdk.models.order.implementations.OrderBaseStatusImpl} object
	 */
	protected void setFields(OrderBaseStatusImpl<T> statusLine) {
		statusLine.setId(null);
		statusLine.setActions(actions.stream().map(OrderStatusActionBuilder::build).collect(Collectors.toList()));
		statusLine.setCurrentDateTime(currentDateTime);
		statusLine.setStatus(status);
		statusLine.setSubstatusId(substatusId);
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderBaseStatus} object
	 */
	public abstract OrderBaseStatus<T> build();

	/**
	 * <p>done.</p>
	 *
	 * @return a P object
	 */
	public P done() {
		return parentBuilder;
	}
}
