package com.logicommerce.sdk.builders.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.order.OrderBaseStatus;
import com.logicommerce.sdk.models.order.implementations.OrderBaseStatusImpl;

public abstract class OrderBaseStatusBuilder<T, P> {
	
	private P parentBuilder;
	
	protected List<OrderStatusActionBuilder<OrderBaseStatusBuilder<T, P>>> actions;
	
	protected LocalDateTime currentDateTime;
	
	protected Integer id;
	
	protected T status;
	
	protected int substatusId;
	
	public OrderBaseStatusBuilder() {
		id = null;
		actions = new ArrayList<>();
		currentDateTime = LocalDateTime.now();
		substatusId = 0;
	}

	public OrderBaseStatusBuilder(P parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderBaseStatusBuilder<T, P> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderStatusActionBuilder<OrderBaseStatusBuilder<T, P>> actions() {
		OrderStatusActionBuilder<OrderBaseStatusBuilder<T, P>> action = new OrderStatusActionBuilder<>(this);
		actions.add(action);
		return action;
	}

	public OrderBaseStatusBuilder<T, P> currentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
		return this;
	}

	public OrderBaseStatusBuilder<T, P> status(T status) {
		this.status = status;
		return this;
	}

	public OrderBaseStatusBuilder<T, P> substatusId(int substatusId) {
		this.substatusId = substatusId;
		return this;
	}
	
	protected void setFields(OrderBaseStatusImpl<T> statusLine) {
		statusLine.setId(null);
		statusLine.setActions(actions.stream().map(OrderStatusActionBuilder::build).collect(Collectors.toList()));
		statusLine.setCurrentDateTime(currentDateTime);
		statusLine.setStatus(status);
		statusLine.setSubstatusId(substatusId);
	}
	
	public abstract OrderBaseStatus<T> build();

	public P done() {
		return parentBuilder;
	}
}