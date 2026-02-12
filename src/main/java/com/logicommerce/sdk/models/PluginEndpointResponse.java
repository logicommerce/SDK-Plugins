package com.logicommerce.sdk.models;

import java.util.List;
import java.util.Map;

/**
 * <p>PluginEndpointResponse interface.</p>
 *
 * @author LogiCommerce
 * @since 2.7.1
 */
public interface PluginEndpointResponse {

	/** 
	 * <p>Gets the HTTP status code of the response.</p>
	 * 
	 * @return an int representing the HTTP status code (e.g., 200 for OK, 404 for Not Found, etc.) 
	 */
	int getStatusCode();

	/**
     * Gets the response body. It can be:
     * - a String: the body will be sent as is.
     * - an Object: the body will be serialized to JSON before being sent.
     * - an InputStream: the body will be sent as a stream.
     */
	Object getBody();

	/**
	 * <p>getHeaders. map with header names as keys and lists of header values as values</p>
	 *
	 * @return a {@link java.util.Map Map} object
	 */
	Map<String, List<String>> getHeaders();
}
