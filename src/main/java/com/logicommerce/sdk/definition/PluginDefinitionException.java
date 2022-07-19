package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.SdkException;

/**
 * <p>PluginDefinitionException class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PluginDefinitionException extends SdkException {

	private static final long serialVersionUID = 1L;

	/**
	 * <p>Constructor for PluginDefinitionException.</p>
	 *
	 * @param clazz a {@link java.lang.Class} object
	 * @param message a {@link java.lang.String} object
	 */
	public PluginDefinitionException(Class<?> clazz, String message) {
		super(clazz, message);
	}

}
