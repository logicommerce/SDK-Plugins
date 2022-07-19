package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.SettingOrderSubstatusActionType;
import com.logicommerce.sdk.models.order.OrderStatusAction;

/**
 * <p>OrderStatusActionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderStatusActionImpl implements OrderStatusAction {

	private Integer id;

	private SettingOrderSubstatusActionType actionType;

	private int actionId;

	private String parameter1;

	private String parameter2;

	private boolean done;

	private String sentText;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>actionType</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.SettingOrderSubstatusActionType} object
	 */
	public SettingOrderSubstatusActionType getActionType() {
		return actionType;
	}

	/**
	 * <p>Getter for the field <code>actionId</code>.</p>
	 *
	 * @return a int
	 */
	public int getActionId() {
		return actionId;
	}

	/**
	 * <p>Getter for the field <code>parameter1</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getParameter1() {
		return parameter1;
	}

	/**
	 * <p>Getter for the field <code>parameter2</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getParameter2() {
		return parameter2;
	}

	/**
	 * <p>isDone.</p>
	 *
	 * @return a boolean
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * <p>Getter for the field <code>sentText</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getSentText() {
		return sentText;
	}

	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <p>Setter for the field <code>actionType</code>.</p>
	 *
	 * @param actionType a {@link com.logicommerce.sdk.enums.SettingOrderSubstatusActionType} object
	 */
	public void setActionType(SettingOrderSubstatusActionType actionType) {
		this.actionType = actionType;
	}

	/**
	 * <p>Setter for the field <code>actionId</code>.</p>
	 *
	 * @param actionId a int
	 */
	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	/**
	 * <p>Setter for the field <code>parameter1</code>.</p>
	 *
	 * @param parameter1 a {@link java.lang.String} object
	 */
	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	/**
	 * <p>Setter for the field <code>parameter2</code>.</p>
	 *
	 * @param parameter2 a {@link java.lang.String} object
	 */
	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}

	/**
	 * <p>Setter for the field <code>done</code>.</p>
	 *
	 * @param done a boolean
	 */
	public void setDone(boolean done) {
		this.done = done;
	}

	/**
	 * <p>Setter for the field <code>sentText</code>.</p>
	 *
	 * @param sentText a {@link java.lang.String} object
	 */
	public void setSentText(String sentText) {
		this.sentText = sentText;
	}
}
