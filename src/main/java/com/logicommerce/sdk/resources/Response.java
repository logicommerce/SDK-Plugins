package com.logicommerce.sdk.resources;

import java.util.List;
import java.util.Map;

/**
 * Response interface for HTTP requests.
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Response {

	/**
	 * Response body.
	 *
	 * @return a {@link String} object
	 */
	String getResponse();

	/**
	 * Status code of the response.
	 *
	 * @return a int
	 */
	int getStatusCode();

	/**
	 * Headers of the response.
	 *
	 * @return a {@link Map} object
	 */
	Map<String, List<String>> getHeaders();

	/**
	 * Returns the value of the header with the given name.
	 *
	 * @since 1.0.16
	 * @param name a {@link String} object
	 * @return a {@link String} object
	 */
	String getHeader(String name);

	/**
	 * Parse the response body to a typed object.
	 * 
	 * @since 1.0.16
	 * @param <T> the generic type
	 * @param type a {@link Class}&lt;T&gt; object
	 * @return a T object or null if the response body is empty
	 * @throws ResponseException if any.
	 */
	default <T> T parse(Class<T> type) throws ResponseException {
		return ResponseParser.parse(getStatusCode(), getResponse(), type);
	}

}
