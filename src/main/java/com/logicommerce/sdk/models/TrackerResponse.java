package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.TrackerAmbience;
import com.logicommerce.sdk.enums.TrackerPageType;
import com.logicommerce.sdk.enums.TrackerPosition;
import com.logicommerce.sdk.enums.TrackerScriptType;

public interface TrackerResponse {

	String getScript();

	TrackerPageType getPageType();

	TrackerAmbience getAmbience();

	TrackerPosition getPosition();

	TrackerScriptType getScriptType();

}
