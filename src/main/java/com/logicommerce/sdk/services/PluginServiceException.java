package com.logicommerce.sdk.services;

public class PluginServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public PluginServiceException(final String message) {
		super(message);
	}
	
	public PluginServiceException(final Exception exception) {
		super(exception);
	}

	public PluginServiceException(final String message, final Exception exception) {
		super(message, exception);
	}

	public PluginServiceException(final Class<?> clazz, final String message) {
		this(getMessage(clazz, message));
	}

	public PluginServiceException(final  Class<?> clazz, final Exception exception) {
		this(clazz.getName(), exception);
	}

	public PluginServiceException(Class<?> clazz, final String message, final Exception exception) {
		this(getMessage(clazz, message), exception);
	}
	
	private static String getMessage(final Class<?> clazz, final String message) {
		return String.format("%s %s", clazz.getName(), message);
	}
}
