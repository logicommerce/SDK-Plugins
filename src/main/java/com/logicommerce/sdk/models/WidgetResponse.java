package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WidgetAmbience;
import com.logicommerce.sdk.enums.WidgetPageType;
import com.logicommerce.sdk.enums.WidgetPosition;

public interface WidgetResponse {

	WidgetPageType getPageType();

	WidgetAmbience getAmbience();

	WidgetPosition getPosition();

}
