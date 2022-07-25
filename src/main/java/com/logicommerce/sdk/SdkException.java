package com.logicommerce.sdk;

/**
 * <p>SdkException class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class SdkException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * <p>Constructor for SdkException.</p>
	 *
	 * @param message a {@link java.lang.String} object
	 */
	public SdkException(final String message) {
		super(message);
	}
	
	/**
	 * <p>Constructor for SdkException.</p>
	 *
	 * @param exception a {@link java.lang.Exception} object
	 */
	public SdkException(final Exception exception) {
		super(exception);
	}

	/**
	 * <p>Constructor for SdkException.</p>
	 *
	 * @param message a {@link java.lang.String} object
	 * @param exception a {@link java.lang.Exception} object
	 */
	public SdkException(final String message, final Exception exception) {
		super(message, exception);
	}

	/**
	 * <p>Constructor for SdkException.</p>
	 *
	 * @param clazz a {@link java.lang.Class} object
	 * @param message a {@link java.lang.String} object
	 */
	public SdkException(final Class<?> clazz, final String message) {
		this(getMessage(clazz, message));
	}

	/**
	 * <p>Constructor for SdkException.</p>
	 *
	 * @param clazz a {@link java.lang.Class} object
	 * @param exception a {@link java.lang.Exception} object
	 */
	public SdkException(final  Class<?> clazz, final Exception exception) {
		this(clazz.getName(), exception);
	}

	/**
	 * <p>Constructor for SdkException.</p>
	 *
	 * @param clazz a {@link java.lang.Class} object
	 * @param message a {@link java.lang.String} object
	 * @param exception a {@link java.lang.Exception} object
	 */
	public SdkException(Class<?> clazz, final String message, final Exception exception) {
		this(getMessage(clazz, message), exception);
	}
	
	private static String getMessage(final Class<?> clazz, final String message) {
		return String.format("%s %s", clazz.getName(), message);
	}

}
