package com.logicommerce.sdk.services;

import com.logicommerce.sdk.enums.CustomTagItemType;

/**
 * <p>CustomTagService interface. For processed plugin custom tags.</p>
 *
 * @see com.logicommerce.sdk.enums.CustomTagItemType CustomTagItemType
 * @author Logicommerce
 * @since 1.0.16
 */
public interface CustomTagService extends PluginService {

	/**
	 * <p>Get custom tag value to a itemtype and value.</p>
	 * <p>Return value of the custom tag processed by the plugin.</p>
	 *
	 * @param itemType a {@link com.logicommerce.sdk.enums.CustomTagItemType CustomTagItemType} object
	 * @param value a {@link java.lang.String String} object
	 * @see com.logicommerce.sdk.enums.CustomTagItemType CustomTagItemType
	 * @return a {@link java.lang.String String} object
	 * @since 1.0.16
	 * @throws com.logicommerce.sdk.services.PluginServiceException PluginServiceException if any.
	 */
	public String getCustomTagValue(CustomTagItemType itemType, String value) throws PluginServiceException;

}
