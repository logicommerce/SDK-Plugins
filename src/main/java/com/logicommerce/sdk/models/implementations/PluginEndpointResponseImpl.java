package com.logicommerce.sdk.models.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.logicommerce.sdk.models.PluginEndpointResponse;

/**
 * <p>PluginEndpointResponseImpl class.</p>
 *
 * @author LogiCommerce
 * @since 2.7.1
 */
public class PluginEndpointResponseImpl implements PluginEndpointResponse {

	private int statusCode;

	private Object body;

	private Map<String, List<String>> headers;
	
	public PluginEndpointResponseImpl(int statusCode, Object body, Map<String, List<String>> headers) {
		this.statusCode = statusCode;
		this.body = body;
		this.headers = headers;
	}

	public PluginEndpointResponseImpl() {
		this(200, null, Map.of());
	}

	/** {@inheritDoc} */
	@Override
	public int getStatusCode() {
		return statusCode;
	}

	/** 
	 * setStatusCode. HTTP status code of the response (e.g., 200 for OK, 404 for Not Found, etc.) 
	 **/
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/** 
	 * setStatusCode. HTTP status code of the response (e.g., 200 for OK, 404 for Not Found, etc.) 
	 **/
	public PluginEndpointResponse statusCode(int statusCode) {
		setStatusCode(statusCode);
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Object getBody() {
		return body;
	}

	/**
     * Sets the response body. It can be:
     * - a String: the body will be sent as is.
     * - an Object: the body will be serialized to JSON before being sent.
     * - an InputStream: the body will be sent as a stream.
     */
	public void setBody(Object body) {
		this.body = body;
	}

	/**
     * Gets the response body. It can be:
     * - a String: the body will be sent as is.
     * - an Object: the body will be serialized to JSON before being sent.
     * - an InputStream: the body will be sent as a stream.
     */
	public PluginEndpointResponse body(Object body) {
		setBody(body);
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Map<String, List<String>> getHeaders() {
		return headers;
	}

	/** 
	 * setHeaders. map with header names as keys and lists of header values as values 
	 **/
	public void setHeaders(Map<String, List<String>> headers) {
		this.headers = headers;
	}

	/** 
	 * set one header by key and value.<br>
	 * If the header already exists, the value will be added to the list of values for that header. 	
	 **/
	public PluginEndpointResponse header(String key, String value) {
		this.headers.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
		return this;
	}

}
