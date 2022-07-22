package com.logicommerce.sdk.services;

import java.util.Map;

/**
 * <p>DataService interface. To implement service for fetching data that plugin may need for the front end.</p>
 * <p>This service is called from the resource REST /executePluginAction with the parameters defined by the plugin.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface DataService extends PluginService {

	/**
	 * <p>This method is for define some action to execute in the plugin.</p>
	 * <p>Action parameter is to know what action should be performed.</p>
	 * <p>Params contains the data defined by the plugin.</p>
	 *
	 * @param action a {@link java.lang.String String} object
	 * @param params a {@link java.util.Map Map}&lt;{@link java.lang.String String}, {@link java.lang.String String}&gt; object
	 * @return a {@link java.util.Map Map}&lt;{@link java.lang.String String} {@link java.lang.Object Object}&gt; object
	 * @since 1.0.16
	 * @throws com.logicommerce.sdk.services.PluginServiceException PluginServiceException if any.
	 */
	Map<String, Object> executeAction(String action, Map<String, String> params) throws PluginServiceException;

}
