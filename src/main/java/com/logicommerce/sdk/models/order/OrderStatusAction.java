package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.SettingOrderSubstatusActionType;

public interface OrderStatusAction {

	Integer getId();

	SettingOrderSubstatusActionType getActionType();

	int getActionId();

	String getParameter1();

	String getParameter2();

	boolean isDone();

	String getSentText();

}
