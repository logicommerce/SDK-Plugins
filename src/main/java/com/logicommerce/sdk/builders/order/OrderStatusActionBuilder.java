package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.SettingOrderSubstatusActionType;
import com.logicommerce.sdk.models.order.OrderStatusAction;
import com.logicommerce.sdk.models.order.implementations.OrderStatusActionImpl;

/**
 * <p>OrderStatusActionBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderStatusActionBuilder<T> {

	private T parentBuilder;

	protected Integer id;

	protected SettingOrderSubstatusActionType actionType;

	protected int actionId;

	protected String parameter1;

	protected String parameter2;

	protected boolean done;

	protected String sentText;

	/**
	 * <p>Constructor for OrderStatusActionBuilder.</p>
	 */
	public OrderStatusActionBuilder() {

	}

	/**
	 * <p>Constructor for OrderStatusActionBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderStatusActionBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderStatusActionBuilder} object
	 */
	public OrderStatusActionBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>actionType.</p>
	 *
	 * @param actionType a {@link com.logicommerce.sdk.enums.SettingOrderSubstatusActionType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderStatusActionBuilder} object
	 */
	public OrderStatusActionBuilder<T> actionType(SettingOrderSubstatusActionType actionType) {
		this.actionType = actionType;
		return this;
	}

	/**
	 * <p>actionId.</p>
	 *
	 * @param actionId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderStatusActionBuilder} object
	 */
	public OrderStatusActionBuilder<T> actionId(int actionId) {
		this.actionId = actionId;
		return this;
	}

	/**
	 * <p>parameter1.</p>
	 *
	 * @param parameter1 a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderStatusActionBuilder} object
	 */
	public OrderStatusActionBuilder<T> parameter1(String parameter1) {
		this.parameter1 = parameter1;
		return this;
	}

	/**
	 * <p>parameter2.</p>
	 *
	 * @param parameter2 a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderStatusActionBuilder} object
	 */
	public OrderStatusActionBuilder<T> parameter2(String parameter2) {
		this.parameter2 = parameter2;
		return this;
	}

	/**
	 * <p>done.</p>
	 *
	 * @param done a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderStatusActionBuilder} object
	 */
	public OrderStatusActionBuilder<T> done(boolean done) {
		this.done = done;
		return this;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}

	/**
	 * <p>sentText.</p>
	 *
	 * @param sentText a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderStatusActionBuilder} object
	 */
	public OrderStatusActionBuilder<T> sentText(String sentText) {
		this.sentText = sentText;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderStatusAction} object
	 */
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
}
