package com.logicommerce.sdk.models.basket;

/**
 * <p>The buyer's client, as the calling plugin knows it. It is used instead of the caller's request headers, and the
 * client is never treated as a bot. Build it with {@link com.logicommerce.sdk.builders.basket.ClientInfoBuilder}.</p>
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
