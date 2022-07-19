package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.TrackerScriptType;

/**
 * <p>TrackerResponse interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface TrackerResponse extends WidgetResponse {

	/**
	 * <p>getScript.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getScript();

	/**
	 * <p>getScriptType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.TrackerScriptType} object
	 */
	TrackerScriptType getScriptType();

}
