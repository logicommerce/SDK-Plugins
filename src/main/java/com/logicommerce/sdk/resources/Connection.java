package com.logicommerce.sdk.resources;

public interface Connection {

	Connection init(String endPoint);

	Response get() throws PluginResourceException;

	Response post(String body) throws PluginResourceException;

	Response put(String body) throws PluginResourceException;

	Response patch(String body) throws PluginResourceException;

	Response delete() throws PluginResourceException;

	Connection authorization(String authorization);

	Connection path(String path);

	Connection contentType(String contentType);

	Connection acceptType(String acceptType);

	Connection header(String name, String value);

	Connection cookie(String name, String value);

	Connection params(String params);
	
	Connection timeout(Integer timeout);

}
