package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.SettingOrderSubstatusActionType;
import com.logicommerce.sdk.models.order.OrderStatusAction;

public class OrderStatusActionImpl implements OrderStatusAction {

	private Integer id;

	private SettingOrderSubstatusActionType actionType;

	private int actionId;

	private String parameter1;

	private String parameter2;

	private boolean done;

	private String sentText;

	public Integer getId() {
		return id;
	}

	public SettingOrderSubstatusActionType getActionType() {
		return actionType;
	}

	public int getActionId() {
		return actionId;
	}

	public String getParameter1() {
		return parameter1;
	}

	public String getParameter2() {
		return parameter2;
	}

	public boolean isDone() {
		return done;
	}

	public String getSentText() {
		return sentText;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setActionType(SettingOrderSubstatusActionType actionType) {
		this.actionType = actionType;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public void setSentText(String sentText) {
		this.sentText = sentText;
	}
}