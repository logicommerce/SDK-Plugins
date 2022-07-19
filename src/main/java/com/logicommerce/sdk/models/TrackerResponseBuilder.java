package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.TrackerScriptType;
import com.logicommerce.sdk.enums.WidgetAmbience;
import com.logicommerce.sdk.enums.WidgetPageType;
import com.logicommerce.sdk.enums.WidgetPosition;

/**
 * <p>TrackerResponseBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class TrackerResponseBuilder {

	private String script;

	private WidgetPageType pageType = WidgetPageType.ALL;

	private WidgetAmbience ambience = WidgetAmbience.ALL;

	private WidgetPosition position = WidgetPosition.HEAD_TOP;

	private TrackerScriptType type = TrackerScriptType.CODE;

	/**
	 * <p>script.</p>
	 *
	 * @param script a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.TrackerResponseBuilder} object
	 */
	public TrackerResponseBuilder script(String script) {
		this.script = script;
		return this;
	}

	/**
	 * <p>pageType.</p>
	 *
	 * @param pageType a {@link com.logicommerce.sdk.enums.WidgetPageType} object
	 * @return a {@link com.logicommerce.sdk.models.TrackerResponseBuilder} object
	 */
	public TrackerResponseBuilder pageType(WidgetPageType pageType) {
		this.pageType = pageType;
		return this;
	}

	/**
	 * <p>ambience.</p>
	 *
	 * @param ambience a {@link com.logicommerce.sdk.enums.WidgetAmbience} object
	 * @return a {@link com.logicommerce.sdk.models.TrackerResponseBuilder} object
	 */
	public TrackerResponseBuilder ambience(WidgetAmbience ambience) {
		this.ambience = ambience;
		return this;
	}

	/**
	 * <p>position.</p>
	 *
	 * @param position a {@link com.logicommerce.sdk.enums.WidgetPosition} object
	 * @return a {@link com.logicommerce.sdk.models.TrackerResponseBuilder} object
	 */
	public TrackerResponseBuilder position(WidgetPosition position) {
		this.position = position;
		return this;
	}

	/**
	 * <p>scriptType.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.TrackerScriptType} object
	 * @return a {@link com.logicommerce.sdk.models.TrackerResponseBuilder} object
	 */
	public TrackerResponseBuilder scriptType(TrackerScriptType type) {
		this.type = type;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.TrackerResponse} object
	 */
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
