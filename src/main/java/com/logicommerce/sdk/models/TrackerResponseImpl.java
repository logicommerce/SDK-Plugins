package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.TrackerAmbience;
import com.logicommerce.sdk.enums.TrackerPageType;
import com.logicommerce.sdk.enums.TrackerPosition;
import com.logicommerce.sdk.enums.TrackerScriptType;

public class TrackerResponseImpl implements TrackerResponse {

	private String script;

	private TrackerPageType pageType;

	private TrackerAmbience ambience;

	private TrackerPosition position;

	private TrackerScriptType type;

	@Override
	public String getScript() {
		return script;
	}

	@Override
	public TrackerPageType getPageType() {
		return pageType;
	}

	@Override
	public TrackerAmbience getAmbience() {
		return ambience;
	}

	@Override
	public TrackerPosition getPosition() {
		return position;
	}

	@Override
	public TrackerScriptType getScriptType() {
		return type;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public void setPageType(TrackerPageType pageType) {
		this.pageType = pageType;
	}

	public void setAmbience(TrackerAmbience ambience) {
		this.ambience = ambience;
	}

	public void setPosition(TrackerPosition position) {
		this.position = position;
	}

	public void setScriptType(TrackerScriptType type) {
		this.type = type;
	}

}
