package com.logicommerce.sdk.services;

import com.logicommerce.sdk.SdkException;

public class PluginServiceException extends SdkException {

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
		super(clazz, message);
	}

	public PluginServiceException(final Class<?> clazz, final Exception exception) {
		super(clazz, exception);
	}

	public PluginServiceException(Class<?> clazz, final String message, final Exception exception) {
		super(clazz, message, exception);
	}

}
