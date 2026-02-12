package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.PluginEndpointRequest;
import com.logicommerce.sdk.models.PluginEndpointResponse;

/**
 * Interface to be able to implement the api plugins service.<br>
 * Once implemented, it allows API endpoints to be invoked.<br><br> 
 * This service is used to invoke API endpoints defined in the plugin definition.
 *
 * @author	LogiCommerce
 * @since	2.7.1
 */
public interface ApiPluginsService extends PluginService {

	/** 
	 * Invoke an API endpoint defined in the plugin definition.
	 * @param request The request object containing details of the API endpoint to invoke
	 * @return The response from the invoked API endpoint
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any error occurs while invoking the endpoint 
	 **/
	PluginEndpointResponse invokeEndpoint(PluginEndpointRequest request) throws PluginServiceException;

}
