package com.logicommerce.sdk.resources;

import java.time.Duration;
import java.util.Map;

/**
 * <p>Session Storage resource interface.</p>
 *
 * @author Logicommerce
 * @since 2.7.5
 */
public interface SessionStorage {

	/**
	 * Checks if there is an active api-plugins session.
	 *
	 * @return true if there is a session
	 */
	boolean hasSession();

	/**
	 * Checks if there is not an active api-plugins session.
	 *
	 * @return true if there isn't a session
	 */
	boolean isAnonymous();

	/**
	 * Gets the api-plugins session token.
	 *
	 * @return a {@link String} object
	 */
	String getSessionToken();

	/**
	 * Gets all the information in the session.
	 *
	 * @return a {@link Map} object
	 */
	Map<String, String> getSessionData();

	/**
	 * Creates a new api-plugins session. The previous session token is discarded,
	 * but the underlying session is not destroyed.
	 *
	 * @param ttl the session time to live.
	 */
	void createNewSession(Duration ttl);

	/**
	 * Destroys the current session.
	 *
	 */
	void deleteSession();

	/**
	 * Gets a single value from the session storage.
	 *
	 * @param key the key of the value to retrieve
	 * @return a {@link String} object if the key exists, null otherwise
	 */
	String get(String key);

	/**
	 * Sets a single value in the session storage.
	 *
	 * @param key the key of the value to set
	 * @param value the value to set
	 */
	void set(String key, String value);

	/**
	 * Removes a single value from the session storage.
	 *
	 * @param key the key of the value to remove
	 */
	void remove(String key);
}
