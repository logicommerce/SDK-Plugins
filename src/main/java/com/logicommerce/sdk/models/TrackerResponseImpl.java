package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.TrackerScriptType;
import com.logicommerce.sdk.enums.WidgetAmbience;
import com.logicommerce.sdk.enums.WidgetPageType;
import com.logicommerce.sdk.enums.WidgetPosition;

/**
 * <p>TrackerResponseImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class TrackerResponseImpl implements TrackerResponse {

	private String script;

	private WidgetPageType pageType;

	private WidgetAmbience ambience;

	private WidgetPosition position;

	private TrackerScriptType type;

	/** {@inheritDoc} */
	@Override
	public String getScript() {
		return script;
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
	public TrackerScriptType getScriptType() {
		return type;
	}

	/**
	 * <p>Setter for the field <code>script</code>.</p>
	 *
	 * @param script a {@link java.lang.String} object
	 */
	public void setScript(String script) {
		this.script = script;
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
	 * <p>setScriptType.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.TrackerScriptType} object
	 */
	public void setScriptType(TrackerScriptType type) {
		this.type = type;
	}

}
