package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.TrackerScriptType;
import com.logicommerce.sdk.enums.WidgetAmbience;
import com.logicommerce.sdk.enums.WidgetPageType;
import com.logicommerce.sdk.enums.WidgetPosition;

public class TrackerResponseImpl implements TrackerResponse {

	private String script;

	private WidgetPageType pageType;

	private WidgetAmbience ambience;

	private WidgetPosition position;

	private TrackerScriptType type;

	@Override
	public String getScript() {
		return script;
	}

	@Override
	public WidgetPageType getPageType() {
		return pageType;
	}

	@Override
	public WidgetAmbience getAmbience() {
		return ambience;
	}

	@Override
	public WidgetPosition getPosition() {
		return position;
	}

	@Override
	public TrackerScriptType getScriptType() {
		return type;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public void setPageType(WidgetPageType pageType) {
		this.pageType = pageType;
	}

	public void setAmbience(WidgetAmbience ambience) {
		this.ambience = ambience;
	}

	public void setPosition(WidgetPosition position) {
		this.position = position;
	}

	public void setScriptType(TrackerScriptType type) {
		this.type = type;
	}

}
