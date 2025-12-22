package com.logicommerce.sdk.resources;

import java.nio.charset.Charset;
import java.security.KeyStore;
import com.logicommerce.sdk.enums.SslProtocol;

/**
 * Connection for executing HTTP requests.
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Connection {

	/**
	 * Initializes the connection.
	 *
	 * @param endPoint a {@link String} object
	 * @return a {@link Connection} object
	 */
	Connection init(String endPoint);

	/**
	 * Sends a GET request.
	 *
	 * @return a {@link Response} object
	 * @throws PluginResourceException if any.
	 */
	Response get() throws PluginResourceException;

	/**
	 * Sends a POST request.
	 *
	 * @param body a {@link String} object
	 * @return a {@link Response} object
	 * @throws PluginResourceException if any.
	 */
	Response post(String body) throws PluginResourceException;

	/**
	 * Sends a PUT request.
	 *
	 * @param body a {@link String} object
	 * @return a {@link Response} object
	 * @throws PluginResourceException if any.
	 */
	Response put(String body) throws PluginResourceException;

	/**
	 * Sends a PATCH request.
	 *
	 * @param body a {@link String} object
	 * @return a {@link Response} object
	 * @throws PluginResourceException if any.
	 */
	Response patch(String body) throws PluginResourceException;

	/**
	 * Sends a DELETE request.
	 *
	 * @return a {@link Response} object
	 * @throws PluginResourceException if any.
	 */
	Response delete() throws PluginResourceException;

	/**
	 * Adds an authorization header to the request.
	 *
	 * @param authorization a {@link String} object
	 * @return a {@link Connection} object
	 */
	Connection authorization(String authorization);

	/**
	 * Defines the path for the request.
	 *
	 * @param path a {@link String} object
	 * @return a {@link Connection} object
	 */
	Connection path(String path);

	/**
	 * Sets a content type to the request.
	 *
	 * @param contentType a {@link String} object
	 * @return a {@link Connection} object
	 */
	Connection contentType(String contentType);

	/**
	 * Sets an accept type to the request.
	 *
	 * @param acceptType a {@link String} object
	 * @return a {@link Connection} object
	 */
	Connection acceptType(String acceptType);

	/**
	 * Adds a header to the request.
	 *
	 * @param name a {@link String} object
	 * @param value a {@link String} object
	 * @return a {@link Connection} object
	 */
	Connection header(String name, String value);

	/**
	 * Adds a cookie to the request.
	 *
	 * @param name a {@link String} object
	 * @param value a {@link String} object
	 * @return a {@link Connection} object
	 */
	Connection cookie(String name, String value);

	/**
	 * Adds a query parameter to the request.
	 *
	 * @param name a {@link String} object
	 * @param value a {@link String} object
	 * @return a {@link Connection} object
	 */
	Connection queryParam(String name, String value);

	/**
	 * Adds a path parameter to the request.
	 *
	 * @param params a {@link String} object
	 * @return a {@link Connection} object
	 */
	Connection params(String params);

	/**
	 * Defines the timeout in miliseconds for the request. Default is 3000.
	 *
	 * @param timeout a int in miliseconds
	 * @return a {@link Connection} object.
	 */
	Connection timeout(int timeout);
	
	/**
	 * Defines the response charset in StandardCharsets for the request. Default is UTF-8.
	 *
	 * @since 1.3.12
	 * @param charset a java.nio.charset.Charset 
	 * @return a {@link Connection} object.
	 */
	Connection charset(Charset charset);

	/**
	 * Sets the keyStore for the request.
	 * 
	 * @since 2.7.0
	 * @param keyStore
	 * @return a {@link Connection} object.
	 */
	Connection keyStore(KeyStore keyStore);

	/**
	 * Sets the SSL protocol for the request.
	 * 
	 * @since 2.7.0
	 * @param sslProtocol
	 * @return a {@link Connection} object.
	 */
	Connection sslProtocol(SslProtocol sslProtocol);

}
