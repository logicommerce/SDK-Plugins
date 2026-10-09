package com.logicommerce.sdk.resources;

import java.time.Duration;

/**
 * <p>Atomic Shared Storage resource interface.</p>
 *
 * <p>A key/value store of small text values that every node serving the commerce sees, where each entry expires on its
 * own and where the conditional operations are atomic: {@link #putIfAbsent(String, String, Duration)},
 * {@link #replace(String, String, String, Duration)}, {@link #remove(String, String)} and
 * {@link #increment(String, long, Duration)} are each resolved as a single operation, so two requests running at the
 * same time on different nodes can never both believe they won. That is what makes the resource usable to coordinate
 * concurrent work: idempotency records, locks and leader election, refreshing a third party token once instead of once
 * per request, discarding duplicate notifications or throttling calls to an external API.</p>
 *
 * <p>Unlike {@link Cache}, a read never answers from a copy held by the node that serves the request, so a value
 * written by one node is immediately visible to the others; and unlike {@link Storage} or {@link SessionStorage}, the
 * entries belong to no user, session or basket, and are written as they are set instead of at the end of the
 * request.</p>
 *
 * <p>Keys are scoped to the commerce and to the plugin, so neither another plugin nor another commerce can read or
 * overwrite them; a plugin that keeps more than one kind of entry should prefix its own keys. Every write states how
 * long the entry lives, because this is coordination state and not a document store: values are meant to be small and
 * to expire.</p>
 *
 * @author Logicommerce
 * @since 2.8.4
 */
public interface AtomicSharedStorage {

	/**
	 * Gets the value stored under a key.
	 *
	 * @param key the key to read
	 * @return a {@link String} object, or null when the key does not exist or has already expired
	 * @throws PluginResourceException if the store cannot be read
	 */
	String get(String key) throws PluginResourceException;

	/**
	 * Stores a value, replacing whatever the key held, and starts its expiration again.
	 *
	 * @param key the key to write
	 * @param value the value to store
	 * @param ttl how long the entry lives; must be positive
	 * @throws PluginResourceException if the store cannot be written
	 */
	void put(String key, String value, Duration ttl) throws PluginResourceException;

	/**
	 * Stores a value only when the key holds none, as a single atomic operation. Of two calls made at the same time with
	 * the same key, exactly one stores its value and gets null back; the other gets the value the winner stored.
	 *
	 * @param key the key to write
	 * @param value the value to store
	 * @param ttl how long the entry lives; must be positive
	 * @return null when the value was stored, or the value the key already held
	 * @throws PluginResourceException if the store cannot be written
	 */
	String putIfAbsent(String key, String value, Duration ttl) throws PluginResourceException;

	/**
	 * Replaces the value of a key only when it currently holds an expected value, as a single atomic operation, and
	 * starts its expiration again.
	 *
	 * @param key the key to write
	 * @param expectedValue the value the key must currently hold
	 * @param value the value to store
	 * @param ttl how long the entry lives; must be positive
	 * @return true when the key held the expected value and was replaced
	 * @throws PluginResourceException if the store cannot be written
	 */
	boolean replace(String key, String expectedValue, String value, Duration ttl) throws PluginResourceException;

	/**
	 * Removes a key.
	 *
	 * @param key the key to remove
	 * @return true when the key existed
	 * @throws PluginResourceException if the store cannot be written
	 */
	boolean remove(String key) throws PluginResourceException;

	/**
	 * Removes a key only when it currently holds an expected value, as a single atomic operation. This is how the owner
	 * of a lock releases it without ever removing a lock that somebody else took after its own expired.
	 *
	 * @param key the key to remove
	 * @param expectedValue the value the key must currently hold
	 * @return true when the key held the expected value and was removed
	 * @throws PluginResourceException if the store cannot be written
	 */
	boolean remove(String key, String expectedValue) throws PluginResourceException;

	/**
	 * Adds an amount to the counter stored under a key, as a single atomic operation, and returns the result. The
	 * counter is created with the given expiration when the key holds none; a counter that already exists keeps the
	 * expiration it has, so the window a first call opened is not extended by the calls that follow it.
	 *
	 * @param key the counter to add to
	 * @param amount the amount to add, which may be negative
	 * @param ttl how long the counter lives when this call creates it; must be positive
	 * @return the value of the counter after adding the amount
	 * @throws PluginResourceException if the store cannot be written or the key holds a value that is not a number
	 */
	long increment(String key, long amount, Duration ttl) throws PluginResourceException;

}
