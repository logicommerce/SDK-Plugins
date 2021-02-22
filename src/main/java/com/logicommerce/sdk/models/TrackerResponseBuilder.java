package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.TrackerAmbience;
import com.logicommerce.sdk.enums.TrackerPageType;
import com.logicommerce.sdk.enums.TrackerPosition;
import com.logicommerce.sdk.enums.TrackerScriptType;

public class TrackerResponseBuilder {

	private String script;

	private TrackerPageType pageType = TrackerPageType.ALL;

	private TrackerAmbience ambience = TrackerAmbience.ALL;

	private TrackerPosition position = TrackerPosition.HEAD_TOP;

	private TrackerScriptType type = TrackerScriptType.CODE;

	public TrackerResponseBuilder script(String script) {
		this.script = script;
		return this;
	}

	public TrackerResponseBuilder pageType(TrackerPageType pageType) {
		this.pageType = pageType;
		return this;
	}

	public TrackerResponseBuilder ambience(TrackerAmbience ambience) {
		this.ambience = ambience;
		return this;
	}

	public TrackerResponseBuilder position(TrackerPosition position) {
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
