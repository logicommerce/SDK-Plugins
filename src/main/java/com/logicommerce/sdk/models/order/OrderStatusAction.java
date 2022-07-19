package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.SettingOrderSubstatusActionType;

/**
 * <p>OrderStatusAction interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderStatusAction {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getActionType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.SettingOrderSubstatusActionType} object
	 */
	SettingOrderSubstatusActionType getActionType();

	/**
	 * <p>getActionId.</p>
	 *
	 * @return a int
	 */
	int getActionId();

	/**
	 * <p>getParameter1.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getParameter1();

	/**
	 * <p>getParameter2.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getParameter2();

	/**
	 * <p>isDone.</p>
	 *
	 * @return a boolean
	 */
	boolean isDone();

	/**
	 * <p>getSentText.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getSentText();

}
