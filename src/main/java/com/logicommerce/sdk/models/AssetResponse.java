package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WidgetType;

public interface AssetResponse extends WidgetResponse{

	String getPath();

	WidgetType getType();

}
