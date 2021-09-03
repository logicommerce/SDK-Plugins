package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.TrackerScriptType;
import com.logicommerce.sdk.enums.WidgetAmbience;
import com.logicommerce.sdk.enums.WidgetPageType;
import com.logicommerce.sdk.enums.WidgetPosition;

public class TrackerResponseBuilder {

	private String script;

	private WidgetPageType pageType = WidgetPageType.ALL;

	private WidgetAmbience ambience = WidgetAmbience.ALL;

	private WidgetPosition position = WidgetPosition.HEAD_TOP;

	private TrackerScriptType type = TrackerScriptType.CODE;

	public TrackerResponseBuilder script(String script) {
		this.script = script;
		return this;
	}

	public TrackerResponseBuilder pageType(WidgetPageType pageType) {
		this.pageType = pageType;
		return this;
	}

	public TrackerResponseBuilder ambience(WidgetAmbience ambience) {
		this.ambience = ambience;
		return this;
	}

	public TrackerResponseBuilder position(WidgetPosition position) {
		this.position = position;
		return this;
	}

	public TrackerResponseBuilder scriptType(TrackerScriptType type) {
		this.type = type;
		return this;
	}

	public TrackerResponse build() {
		TrackerResponseImpl response = new TrackerResponseImpl();
		response.setAmbience(ambience);
		response.setPageType(pageType);
		response.setPosition(position);
		response.setScript(script);
		response.setScriptType(type);
		return response;
	}

}
