package com.logicommerce.sdk.resources;

/**
 * Interface for logging messages.
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Logger {

	/**
	 * Logs a message at the DEBUG level.
	 * Logs will only be generated if the debug mode is enabled.
	 *
	 * @param args a {@link java.lang.String} object
	 * @since 1.1.17
	 */
	void debug(String... args);

	/**
	 * Logs a message at the INFO level.
	 *
	 * @param args a {@link java.lang.String} object
	 */
	void info(String... args);
	
	/**
	 * Logs a message at the WARNING level.
	 *
	 * @param args a {@link java.lang.String} object
	 */
	void warning(String... args);
	
	/**
	 * Logs a message at the SEVERE level.
	 *
	 * @param args a {@link java.lang.String} object
	 */
	void severe(String... args);

}
