package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WidgetAmbience;
import com.logicommerce.sdk.enums.WidgetPageType;
import com.logicommerce.sdk.enums.WidgetPosition;
import com.logicommerce.sdk.enums.WidgetType;

public class AssetResponseImpl implements AssetResponse {

	private String path;

	private WidgetPageType pageType;

	private WidgetAmbience ambience;

	private WidgetPosition position;

	private WidgetType type;

	@Override
	public String getPath() {
		return path;
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
	public WidgetType getType() {
		return type;
	}

	public void setPath(String path) {
		this.path = path;
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

	public void setType(WidgetType type) {
		this.type = type;
	}
}
