package com.logicommerce.sdk.resources;

/**
 * <p>Connection interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Connection {

	/**
	 * <p>init.</p>
	 *
	 * @param endPoint a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	Connection init(String endPoint);

	/**
	 * <p>get.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.resources.Response} object
	 * @throws com.logicommerce.sdk.resources.PluginResourceException if any.
	 */
	Response get() throws PluginResourceException;

	/**
	 * <p>post.</p>
	 *
	 * @param body a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Response} object
	 * @throws com.logicommerce.sdk.resources.PluginResourceException if any.
	 */
	Response post(String body) throws PluginResourceException;

	/**
	 * <p>put.</p>
	 *
	 * @param body a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Response} object
	 * @throws com.logicommerce.sdk.resources.PluginResourceException if any.
	 */
	Response put(String body) throws PluginResourceException;

	/**
	 * <p>patch.</p>
	 *
	 * @param body a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Response} object
	 * @throws com.logicommerce.sdk.resources.PluginResourceException if any.
	 */
	Response patch(String body) throws PluginResourceException;

	/**
	 * <p>delete.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.resources.Response} object
	 * @throws com.logicommerce.sdk.resources.PluginResourceException if any.
	 */
	Response delete() throws PluginResourceException;

	/**
	 * <p>authorization.</p>
	 *
	 * @param authorization a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	Connection authorization(String authorization);

	/**
	 * <p>path.</p>
	 *
	 * @param path a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	Connection path(String path);

	/**
	 * <p>contentType.</p>
	 *
	 * @param contentType a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	Connection contentType(String contentType);

	/**
	 * <p>acceptType.</p>
	 *
	 * @param acceptType a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	Connection acceptType(String acceptType);

	/**
	 * <p>header.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	Connection header(String name, String value);

	/**
	 * <p>cookie.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	Connection cookie(String name, String value);

	/**
	 * <p>queryParam.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	Connection queryParam(String name, String value);

	/**
	 * <p>params.</p>
	 *
	 * @param params a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	Connection params(String params);

	/**
	 * <p>timeout.</p>
	 *
	 * @param timeout a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.resources.Connection} object
	 */
	Connection timeout(Integer timeout);

}
