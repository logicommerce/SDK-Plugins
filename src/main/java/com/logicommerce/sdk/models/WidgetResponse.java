package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WidgetAmbience;
import com.logicommerce.sdk.enums.WidgetPageType;
import com.logicommerce.sdk.enums.WidgetPosition;
/**
 * Interface for a widgets attributes.
 *
 * @author	Logicommerce
 * @since	%I%, %G%
 * @since	1.0.16
 * @see             WidgetPageType
 * @see             WidgetAmbience
 * @see             WidgetPosition
 */
public interface WidgetResponse {
	/**
	 * Return {@link com.logicommerce.sdk.enums.WidgetPageType} param value.
	 *
	 * @return          WidgetPageType
	 * @see             WidgetPageType
	 * @since           1.0.16
	 */
	WidgetPageType getPageType();
	/**
	 * Return {@link com.logicommerce.sdk.enums.WidgetAmbience} param value.
	 *
	 * @return          WidgetAmbience
	 * @see             WidgetAmbience
	 * @since           1.0.16
	 */
	WidgetAmbience getAmbience();
	/**
	 * Return {@link com.logicommerce.sdk.enums.WidgetPosition} param value.
	 *
	 * @return          WidgetPosition
	 * @see             WidgetPosition
	 * @since           1.0.16
	 */
	WidgetPosition getPosition();

}
