package com.logicommerce.sdk.resources;

import java.util.List;
import java.util.Map;

/**
 * <p>Response interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Response {

	/**
	 * <p>getResponse.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getResponse();

	/**
	 * <p>getStatusCode.</p>
	 *
	 * @return a int
	 */
	int getStatusCode();

	/**
	 * <p>getHeaders.</p>
	 *
	 * @return a {@link java.util.Map} object
	 */
	Map<String, List<String>> getHeaders();

}
