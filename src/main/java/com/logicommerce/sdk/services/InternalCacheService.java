package com.logicommerce.sdk.services;

import java.util.Map;

/**
 * InternalCacheSevice for clean cache of plugin from LogiCommerce.
 * 
 * @author LogiCommerce
 * @since 1.3.11
 */
public interface InternalCacheService extends PluginService {
	
	/**
	 * Clean internal cache.
	 * This method is called when a configuration is updated.
	 * 
	 * @param type a {@link java.lang.String} object 
	 * @param additionalInformation a {@link java.util.Map} object
	 *
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void clean(String type, Map<String, String> additionalInformation) throws PluginServiceException;
}
