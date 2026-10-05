package com.logicommerce.sdk.builders.basket;

import com.logicommerce.sdk.models.basket.ClientInfo;
import com.logicommerce.sdk.models.basket.implementations.ClientInfoImpl;

/**
 * <p>Builder of {@link ClientInfo}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class ClientInfoBuilder {

	private String userAgent;

	private String ip;

	/**
	 * <p>Constructor for ClientInfoBuilder.</p>
	 */
	public ClientInfoBuilder() {
		// defaults are set in the fields
	}

	/**
	 * <p>Sets <code>userAgent</code>.</p>
	 *
	 * @param userAgent the buyer's user agent
	 * @return this builder
	 */
	public ClientInfoBuilder userAgent(String userAgent) {
		this.userAgent = userAgent;
		return this;
	}

	/**
	 * <p>Sets <code>ip</code>.</p>
	 *
	 * @param ip the buyer's IP address
	 * @return this builder
	 */
	public ClientInfoBuilder ip(String ip) {
		this.ip = ip;
		return this;
	}

	/**
	 * <p>Builds the {@link ClientInfo}.</p>
	 *
	 * @return a {@link ClientInfo} object
	 */
	public ClientInfo build() {
		ClientInfoImpl result = new ClientInfoImpl();
		result.setUserAgent(userAgent);
		result.setIp(ip);
		return result;
	}

}
