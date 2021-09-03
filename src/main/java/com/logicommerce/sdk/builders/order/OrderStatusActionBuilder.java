package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.SettingOrderSubstatusActionType;
import com.logicommerce.sdk.models.order.OrderStatusAction;
import com.logicommerce.sdk.models.order.implementations.OrderStatusActionImpl;

public class OrderStatusActionBuilder<T> {

	private T parentBuilder;

	protected Integer id;

	protected SettingOrderSubstatusActionType actionType;

	protected int actionId;

	protected String parameter1;

	protected String parameter2;

	protected boolean done;

	protected String sentText;

	public OrderStatusActionBuilder() {

	}

	public OrderStatusActionBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderStatusActionBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderStatusActionBuilder<T> actionType(SettingOrderSubstatusActionType actionType) {
		this.actionType = actionType;
		return this;
	}

	public OrderStatusActionBuilder<T> actionId(int actionId) {
		this.actionId = actionId;
		return this;
	}

	public OrderStatusActionBuilder<T> parameter1(String parameter1) {
		this.parameter1 = parameter1;
		return this;
	}

	public OrderStatusActionBuilder<T> parameter2(String parameter2) {
		this.parameter2 = parameter2;
		return this;
	}

	public OrderStatusActionBuilder<T> done(boolean done) {
		this.done = done;
		return this;
	}

	public OrderStatusActionBuilder<T> sentText(String sentText) {
		this.sentText = sentText;
		return this;
	}

	public OrderStatusAction build() {
		OrderStatusActionImpl action = new OrderStatusActionImpl();
		action.setId(null);
		action.setActionType(actionType);
		action.setActionId(actionId);
		action.setParameter1(parameter1);
		action.setParameter2(parameter2);
		action.setDone(done);
		action.setSentText(sentText);
		return action;
	}

	public T done() {
		return parentBuilder;
	}
}
