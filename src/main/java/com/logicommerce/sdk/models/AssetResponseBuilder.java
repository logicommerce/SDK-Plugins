package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WidgetAmbience;
import com.logicommerce.sdk.enums.WidgetPageType;
import com.logicommerce.sdk.enums.WidgetPosition;
import com.logicommerce.sdk.enums.WidgetType;

public class AssetResponseBuilder {

	private String path;

	private WidgetPageType pageType = WidgetPageType.ALL;

	private WidgetAmbience ambience = WidgetAmbience.ALL;

	private WidgetPosition position = WidgetPosition.HEAD_TOP;

	private WidgetType type = WidgetType.JS;

	public AssetResponseBuilder path(String path) {
		this.path = path;
		return this;
	}

	public AssetResponseBuilder pageType(WidgetPageType pageType) {
		this.pageType = pageType;
		return this;
	}

	public AssetResponseBuilder ambience(WidgetAmbience ambience) {
		this.ambience = ambience;
		return this;
	}

	public AssetResponseBuilder position(WidgetPosition position) {
		this.position = position;
		return this;
	}

	public AssetResponseBuilder type(WidgetType type) {
		this.type = type;
		return this;
	}

	public AssetResponse build() {
		AssetResponseImpl response = new AssetResponseImpl();
		response.setAmbience(ambience);
		response.setPageType(pageType);
		response.setPosition(position);
		response.setPath(path);
		response.setType(type);
		return response;
	}
}