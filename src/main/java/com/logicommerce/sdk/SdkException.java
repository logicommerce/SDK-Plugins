package com.logicommerce.sdk;

public class SdkException extends Exception {

	private static final long serialVersionUID = 1L;

	public SdkException(final String message) {
		super(message);
	}
	
	public SdkException(final Exception exception) {
		super(exception);
	}

	public SdkException(final String message, final Exception exception) {
		super(message, exception);
	}

	public SdkException(final Class<?> clazz, final String message) {
		this(getMessage(clazz, message));
	}

	public SdkException(final  Class<?> clazz, final Exception exception) {
		this(clazz.getName(), exception);
	}

	public SdkException(Class<?> clazz, final String message, final Exception exception) {
		this(getMessage(clazz, message), exception);
	}
	
	private static String getMessage(final Class<?> clazz, final String message) {
		return String.format("%s %s", clazz.getName(), message);
	}

}
