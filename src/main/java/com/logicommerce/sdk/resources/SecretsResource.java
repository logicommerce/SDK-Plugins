package com.logicommerce.sdk.resources;

import java.util.Map;

/**
 * secrets resource interface
 * 
 * @author LogiCommerce
 * @since 2.6.0
 */
public interface SecretsResource {

	/**
	 * get secrets from plugin configuration
	 * 
	 * @throws PluginResourceException if any.
	 */
	Map<String, String> getSecrets() throws PluginResourceException;

}
