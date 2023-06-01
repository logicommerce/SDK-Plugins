package com.logicommerce.sdk.services;

import java.util.Map;

/**
 * CheckConnectionService interface. To implement service of check connection.
 * @author LogiCommerce
 * @since 1.1.16
 */
public interface CheckConnectionService extends PluginService {

	/**
	 * <p>Check connection.</p>
	 * <p>It is used for check connection from the LogiCommerce Backoffice after save the configuration.</p>
	 * <p>If the connection is not successful, the plugin will not be activated.</p>
	 * 
	 * @return true, if successful
	 * @throws com.logicommerce.sdk.services.PluginServiceException the plugin service exception
	 */
	boolean checkConnection() throws PluginServiceException;

	/**
	 * <p>Check connection with params.</p>
	 * <p>It is used for check connection from the LogiCommerce Backoffice before save the configuration.</p>
	 * 
	 * @param params a {@link java.util.Map Map}&lt;{@link java.lang.String String}, {@link java.lang.String String}&gt; object
	 * @return true, if successful
	 * @throws com.logicommerce.sdk.services.PluginServiceException the plugin service exception
	 */
	boolean checkConnection(Map<String, String> params) throws PluginServiceException;
 
}
