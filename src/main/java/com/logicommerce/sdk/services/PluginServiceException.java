package com.logicommerce.sdk.services;

import com.logicommerce.sdk.SdkException;

/**
 * <p>PluginServiceException class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PluginServiceException extends SdkException {

	private static final long serialVersionUID = 1L;

	/**
	 * <p>Constructor for PluginServiceException.</p>
	 *
	 * @param message a {@link java.lang.String} object
	 */
	public PluginServiceException(final String message) {
		super(message);
	}

	/**
	 * <p>Constructor for PluginServiceException.</p>
	 *
	 * @param exception a {@link java.lang.Exception} object
	 */
	public PluginServiceException(final Exception exception) {
		super(exception);
	}

	/**
	 * <p>Constructor for PluginServiceException.</p>
	 *
	 * @param message a {@link java.lang.String} object
	 * @param exception a {@link java.lang.Exception} object
	 */
	public PluginServiceException(final String message, final Exception exception) {
		super(message, exception);
	}

	/**
	 * <p>Constructor for PluginServiceException.</p>
	 *
	 * @param clazz a {@link java.lang.Class} object
	 * @param message a {@link java.lang.String} object
	 */
	public PluginServiceException(final Class<?> clazz, final String message) {
		super(clazz, message);
	}

	/**
	 * <p>Constructor for PluginServiceException.</p>
	 *
	 * @param clazz a {@link java.lang.Class} object
	 * @param exception a {@link java.lang.Exception} object
	 */
	public PluginServiceException(final Class<?> clazz, final Exception exception) {
		super(clazz, exception);
	}

	/**
	 * <p>Constructor for PluginServiceException.</p>
	 *
	 * @param clazz a {@link java.lang.Class} object
	 * @param message a {@link java.lang.String} object
	 * @param exception a {@link java.lang.Exception} object
	 */
	public PluginServiceException(Class<?> clazz, final String message, final Exception exception) {
		super(clazz, message, exception);
	}

}
