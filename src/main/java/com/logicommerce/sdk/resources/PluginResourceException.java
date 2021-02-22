package com.logicommerce.sdk.resources;

public class PluginResourceException extends Exception {

	private static final long serialVersionUID = 1L;

	public PluginResourceException(final String message) {
		super(message);
	}

	public PluginResourceException(final Exception exception) {
		super(exception);
	}

	public PluginResourceException(String message, final Exception exception) {
		super(message, exception);
	}

	public PluginResourceException(Class<?> clazz, final Exception exception) {
		super(clazz.getName(), exception);
	}

}
