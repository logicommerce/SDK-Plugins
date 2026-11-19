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

	/**
	 * Sends a POST request with a multipart/form-data body. The Content-Type header is set from the body
	 * and any value given with {@link #contentType(String)} is ignored.
	 *
	 * @since 2.9.1
	 * @param body a {@link MultipartBody} object
	 * @return a {@link Response} object
	 * @throws PluginResourceException if any, also when the body exceeds the maximum multipart size.
	 */
	default Response post(MultipartBody body) throws PluginResourceException {
		throw new UnsupportedOperationException(MULTIPART_NOT_SUPPORTED);
	}

	/**
	 * Sends a PUT request with a multipart/form-data body. The Content-Type header is set from the body
	 * and any value given with {@link #contentType(String)} is ignored.
	 *
	 * @since 2.9.1
	 * @param body a {@link MultipartBody} object
	 * @return a {@link Response} object
	 * @throws PluginResourceException if any, also when the body exceeds the maximum multipart size.
	 */
	default Response put(MultipartBody body) throws PluginResourceException {
		throw new UnsupportedOperationException(MULTIPART_NOT_SUPPORTED);
	}

	/**
	 * Defines the maximum size in bytes of a multipart body. Default and maximum value is
	 * {@link MultipartBody#MAX_SIZE}: greater values are reduced to it and values lower than 1 are ignored.
	 *
	 * @since 2.9.1
	 * @param maxSize the maximum size in bytes
	 * @return a {@link Connection} object.
	 */
	default Connection multipartMaxSize(int maxSize) {
		throw new UnsupportedOperationException(MULTIPART_NOT_SUPPORTED);
	}

	/**
	 * Message of the exception thrown by implementations without multipart support.
	 */
	String MULTIPART_NOT_SUPPORTED = "Multipart requests are not supported by this implementation";

}
