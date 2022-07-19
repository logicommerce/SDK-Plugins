package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.WidgetType;
/**
 * Interface for a assets attributes extends {@link com.logicommerce.sdk.models.WidgetResponse}.
 *
 * @author	Logicommerce
 * @since	1.0.16
 */
public interface AssetResponse extends WidgetResponse {

	/**
	 * Return String path param value, define the asset relative path.
	 *
	 * @return          {@link java.lang.String}
	 * @since           1.0.16
	 */
	String getPath();

	/**
	 * Return {@link com.logicommerce.sdk.enums.WidgetType} param value.
	 *
	 * @return          WidgetType
	 * @see             WidgetType
	 * @since           1.0.16
	 */
	WidgetType getType();

}
