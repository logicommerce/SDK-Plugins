package com.logicommerce.sdk.services;

/**
 * InternalCacheSevice for clean cache of plugin from LogiCommerce.
 * 
 * @author LogiCommerce
 * @since 1.3.11
 */
public interface InternalCacheService extends PluginService {
	
	/**
	 * <p>
	 * clean.<br>
	 * Clean internal cache.
	 * </p>
	 *
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void clean() throws PluginServiceException;
}
