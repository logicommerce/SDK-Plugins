package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WidgetAmbience;
import com.logicommerce.sdk.enums.WidgetPageType;
import com.logicommerce.sdk.enums.WidgetPosition;
import com.logicommerce.sdk.enums.WidgetType;

/**
 * <p>AssetResponseBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class AssetResponseBuilder {

	private String path;

	private WidgetPageType pageType = WidgetPageType.ALL;

	private WidgetAmbience ambience = WidgetAmbience.ALL;

	private WidgetPosition position = WidgetPosition.HEAD_TOP;

	private WidgetType type = WidgetType.JS;

	/**
	 * <p>path.</p>
	 *
	 * @param path a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.AssetResponseBuilder} object
	 */
	public AssetResponseBuilder path(String path) {
		this.path = path;
		return this;
	}

	/**
	 * <p>pageType.</p>
	 *
	 * @param pageType a {@link com.logicommerce.sdk.enums.WidgetPageType} object
	 * @return a {@link com.logicommerce.sdk.models.AssetResponseBuilder} object
	 */
	public AssetResponseBuilder pageType(WidgetPageType pageType) {
		this.pageType = pageType;
		return this;
	}

	/**
	 * <p>ambience.</p>
	 *
	 * @param ambience a {@link com.logicommerce.sdk.enums.WidgetAmbience} object
	 * @return a {@link com.logicommerce.sdk.models.AssetResponseBuilder} object
	 */
	public AssetResponseBuilder ambience(WidgetAmbience ambience) {
		this.ambience = ambience;
		return this;
	}

	/**
	 * <p>position.</p>
	 *
	 * @param position a {@link com.logicommerce.sdk.enums.WidgetPosition} object
	 * @return a {@link com.logicommerce.sdk.models.AssetResponseBuilder} object
	 */
	public AssetResponseBuilder position(WidgetPosition position) {
		this.position = position;
		return this;
	}

	/**
	 * <p>type.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.WidgetType} object
	 * @return a {@link com.logicommerce.sdk.models.AssetResponseBuilder} object
	 */
	public AssetResponseBuilder type(WidgetType type) {
		this.type = type;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.AssetResponse} object
	 */
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
