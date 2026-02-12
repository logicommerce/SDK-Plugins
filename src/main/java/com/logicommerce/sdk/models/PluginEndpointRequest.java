package com.logicommerce.sdk.models;

import java.util.List;
import java.util.Map;

/**
 * <p>PluginEndpointRequest interface.</p>
 *
 * @author LogiCommerce
 * @since 2.7.1
 */
public interface PluginEndpointRequest {

	/** 
	 * <p>getHttpMethod. HTTP method of the request (e.g., "GET", "POST", "PUT", "DELETE", etc.)</p> * 
	 * 
	 * @return a {@link java.lang.String String} object representing the HTTP method of the request	
	 **/
	String getHttpMethod();

	/** 
	 * <p>getEndpointPath. The path of the endpoint being invoked</p> 
	 *  
	 * @return a {@link java.lang.String String} object representing the path of the endpoint being invoked 
	 **/
	String getEndpointPath();

	/** 
	 * <p>getBody. The body of the request as a String. If the request has no body, this will be null.</p>
	 *  
	 * @return a {@link java.lang.String String} object representing the body of the request, or null if there is no body 
	 **/
	String getBody();

	/**
	 * <p>getHeaders. map with header names as keys and lists of header values as values</p>
	 *  
	 * @return a {@link java.util.Map Map} object 
	 **/
	Map<String, List<String>> getHeaders();

	/** 
	 * <p>getQueryParams. map with query parameter names as keys and lists of parameter values as values</p>
	 *  
	 * @return a {@link java.util.Map Map} object
	 **/
	Map<String, List<String>> getQueryParams();

}
