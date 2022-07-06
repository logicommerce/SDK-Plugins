package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.TrackerScriptType;

public interface TrackerResponse extends WidgetResponse {

	String getScript();

	TrackerScriptType getScriptType();

}
