package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WidgetAmbience;
import com.logicommerce.sdk.enums.WidgetPageType;
import com.logicommerce.sdk.enums.WidgetPosition;
import com.logicommerce.sdk.enums.WidgetType;

/**
 * <p>AssetResponseImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class AssetResponseImpl implements AssetResponse {

	private String path;

	private WidgetPageType pageType;

	private WidgetAmbience ambience;

	private WidgetPosition position;

	private WidgetType type;

	/** {@inheritDoc} */
	@Override
	public String getPath() {
		return path;
	}

	/** {@inheritDoc} */
	@Override
	public WidgetPageType getPageType() {
		return pageType;
	}

	/** {@inheritDoc} */
	@Override
	public WidgetAmbience getAmbience() {
		return ambience;
	}

	/** {@inheritDoc} */
	@Override
	public WidgetPosition getPosition() {
		return position;
	}

	/** {@inheritDoc} */
	@Override
	public WidgetType getType() {
		return type;
	}

	/**
	 * <p>Setter for the field <code>path</code>.</p>
	 *
	 * @param path a {@link java.lang.String} object
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * <p>Setter for the field <code>pageType</code>.</p>
	 *
	 * @param pageType a {@link com.logicommerce.sdk.enums.WidgetPageType} object
	 */
	public void setPageType(WidgetPageType pageType) {
		this.pageType = pageType;
	}

	/**
	 * <p>Setter for the field <code>ambience</code>.</p>
	 *
	 * @param ambience a {@link com.logicommerce.sdk.enums.WidgetAmbience} object
	 */
	public void setAmbience(WidgetAmbience ambience) {
		this.ambience = ambience;
	}

	/**
	 * <p>Setter for the field <code>position</code>.</p>
	 *
	 * @param position a {@link com.logicommerce.sdk.enums.WidgetPosition} object
	 */
	public void setPosition(WidgetPosition position) {
		this.position = position;
	}

	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.WidgetType} object
	 */
	public void setType(WidgetType type) {
		this.type = type;
	}
}
