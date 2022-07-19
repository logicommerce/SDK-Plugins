package com.logicommerce.sdk.resources;

/**
 * <p>Logger interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Logger {

	/**
	 * <p>info.</p>
	 *
	 * @param args a {@link java.lang.String} object
	 */
	void info(String... args);
	
	/**
	 * <p>warning.</p>
	 *
	 * @param args a {@link java.lang.String} object
	 */
	void warning(String... args);
	
	/**
	 * <p>severe.</p>
	 *
	 * @param args a {@link java.lang.String} object
	 */
	void severe(String... args);

}
