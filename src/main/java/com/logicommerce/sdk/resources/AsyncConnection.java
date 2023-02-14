package com.logicommerce.sdk.resources;

import java.util.concurrent.CompletableFuture;

/**
 * Asynchronous Connection
 * @author Logicommerce
 * @since 1.0.18
 */
public interface AsyncConnection {

	/**
	 * Initializes the connection
	 * @param endPoint a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	AsyncConnection init(String endPoint);

	/**
	 * GET method
	 * @return a {@link java.util.concurrent.CompletableFuture} object
	 */
	CompletableFuture<Response> get();

	/**
	 * POST method
	 * @param body a {@link java.lang.String} object
	 * @return a {@link java.util.concurrent.CompletableFuture} object
	 */
	CompletableFuture<Response> post(String body);

	/**
	 * PUT method
	 * @param body a {@link java.lang.String} object
	 * @return a {@link java.util.concurrent.CompletableFuture} object
	 */
	CompletableFuture<Response> put(String body);

	/**
	 * PATCH method
	 * @param body a {@link java.lang.String} object
	 * @return a {@link java.util.concurrent.CompletableFuture} object
	 */
	CompletableFuture<Response> patch(String body);

	/**
	 * DELETE method
	 * @return a {@link java.util.concurrent.CompletableFuture} object
	 */
	CompletableFuture<Response> delete();

	/**
	 * Authorization
	 * @param authorization a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	AsyncConnection authorization(String authorization);

	/**
	 * Assign path
	 * @param path a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.AsyncConnection} object
	 */
	AsyncConnection path(String path);

	/**
	 * Assign contentType
	 * @param contentType a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.AsyncConnection} object
	 */
	AsyncConnection contentType(String contentType);

	/**
	 * Assign acceptType
	 * @param acceptType a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.AsyncConnection} object
	 */
	AsyncConnection acceptType(String acceptType);

	/**
	 * Assign header
	 * @param name  a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.AsyncConnection} object
	 */
	AsyncConnection header(String name, String value);

	/**
	 * Assign cookie
	 * @param name  a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.AsyncConnection} object
	 */
	AsyncConnection cookie(String name, String value);

	/**
	 * Assign queryParam
	 * @param name  a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.AsyncConnection} object
	 */
	AsyncConnection queryParam(String name, String value);

	/**
	 * Assign params
	 * @param params a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.AsyncConnection} object
	 */
	AsyncConnection params(String params);

	/**
	 * Assign timeout
	 * @param timeout a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.resources.AsyncConnection} object
	 */
	AsyncConnection timeout(Integer timeout);
}
