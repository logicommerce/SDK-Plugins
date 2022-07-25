package com.logicommerce.sdk.resources;

/**
 * <p>PluginResourceException class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PluginResourceException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * <p>Constructor for PluginResourceException.</p>
	 *
	 * @param message a {@link java.lang.String} object
	 */
	public PluginResourceException(final String message) {
		super(message);
	}

	/**
	 * <p>Constructor for PluginResourceException.</p>
	 *
	 * @param exception a {@link java.lang.Exception} object
	 */
	public PluginResourceException(final Exception exception) {
		super(exception);
	}

	/**
	 * <p>Constructor for PluginResourceException.</p>
	 *
	 * @param message a {@link java.lang.String} object
	 * @param exception a {@link java.lang.Exception} object
	 */
	public PluginResourceException(String message, final Exception exception) {
		super(message, exception);
	}

	/**
	 * <p>Constructor for PluginResourceException.</p>
	 *
	 * @param clazz a {@link java.lang.Class} object
	 * @param exception a {@link java.lang.Exception} object
	 */
	public PluginResourceException(Class<?> clazz, final Exception exception) {
		super(clazz.getName(), exception);
	}

}
