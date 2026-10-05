package com.logicommerce.sdk.models.basket;

/**
 * <p>The buyer's client, as the calling plugin knows it (for instance from the signals an agent platform sends). Core
 * uses it instead of the caller's request headers when it rebuilds the request context of a basket, and treats the
 * client as a person, never as a bot. Build it with {@link com.logicommerce.sdk.builders.basket.ClientInfoBuilder}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface ClientInfo {

	/**
	 * Returns the buyer's user agent.
	 *
	 * @return the user agent, or null (or empty) when unknown
	 */
	String getUserAgent();

	/**
	 * Returns the buyer's IP address.
	 *
	 * @return the IP address, or null (or empty) when unknown
	 */
	String getIp();

}
