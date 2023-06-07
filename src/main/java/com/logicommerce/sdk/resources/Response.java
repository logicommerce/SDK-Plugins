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

}
