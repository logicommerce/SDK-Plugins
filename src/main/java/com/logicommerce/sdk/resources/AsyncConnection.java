package com.logicommerce.sdk.resources;

import java.util.concurrent.CompletableFuture;

/**
 * Asynchronous Connection for executing HTTP requests.
 * 
 * @author Logicommerce
 * @since 1.0.18
 */
public interface AsyncConnection {

	/**
	 * Initializes the connection.
	 * 
	 * @param endPoint a {@link String} object
	 * @return a {@link Connection} object
	 */
	AsyncConnection init(String endPoint);

	/**
	 * Sends a GET request.
	 * 
	 * @return a {@link CompletableFuture}&lt;{@link Response}&gt; object
	 */
	CompletableFuture<Response> get();

	/**
	 * Sends a POST request.
	 * 
	 * @param body a {@link String} object
	 * @return a {@link CompletableFuture}&lt;{@link Response}&gt; object
	 */
	CompletableFuture<Response> post(String body);

	/**
	 * Sends a PUT request.
	 *
	 * @param body a {@link String} object
	 * @return a {@link CompletableFuture}&lt;{@link Response}&gt; object
	 */
	CompletableFuture<Response> put(String body);

	/**
	 * Sends a PATCH request.
	 *
	 * @param body a {@link String} object
	 * @return a {@link CompletableFuture}&lt;{@link Response}&gt; object
	 */
	CompletableFuture<Response> patch(String body);

	/**
	 * Sends a DELETE request.
	 *
	 * @return a {@link CompletableFuture}&lt;{@link Response}&gt; object
	 */
	CompletableFuture<Response> delete();

	/**
	 * Adds an authorization header to the request.
	 *
	 * @param authorization a {@link String} object
	 * @return a {@link Connection} object
	 */
	AsyncConnection authorization(String authorization);

	/**
	 * Defines the path for the request.
	 *
	 * @param path a {@link String} object
	 * @return a {@link AsyncConnection} object
	 */
	AsyncConnection path(String path);

	/**
	 * Sets a content type to the request.
	 *
	 * @param contentType a {@link String} object
	 * @return a {@link AsyncConnection} object
	 */
	AsyncConnection contentType(String contentType);

	/**
	 * Sets an accept type to the request.
	 *
	 * @param acceptType a {@link String} object
	 * @return a {@link AsyncConnection} object
	 */
	AsyncConnection acceptType(String acceptType);

	/**
	 * Adds a header to the request.
	 *
	 * @param name  a {@link String} object
	 * @param value a {@link String} object
	 * @return a {@link AsyncConnection} object
	 */
	AsyncConnection header(String name, String value);

	/**
	 * Assign cookie
	 * 
	 * @param name  a {@link String} object
	 * @param value a {@link String} object
	 * @return a {@link AsyncConnection} object
	 */
	AsyncConnection cookie(String name, String value);

	/**
	 * Adds a cookie to the request.
	 *
	 * @param name  a {@link String} object
	 * @param value a {@link String} object
	 * @return a {@link AsyncConnection} object
	 */
	AsyncConnection queryParam(String name, String value);

	/**
	 * Adds a path parameter to the request.
	 * 
	 * @param params a {@link String} object
	 * @return a {@link AsyncConnection} object
	 */
	AsyncConnection params(String params);

	/**
	 * Defines the timeout in miliseconds for the request. Default is 3000.
	 *
	 * @param timeout a int in miliseconds
	 * @return a {@link AsyncConnection} object
	 */
	AsyncConnection timeout(int timeout);
}
