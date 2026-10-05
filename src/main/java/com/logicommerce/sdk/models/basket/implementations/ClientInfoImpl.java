package com.logicommerce.sdk.models.basket.implementations;

import com.logicommerce.sdk.models.basket.ClientInfo;

/**
 * <p>Implementation of {@link ClientInfo}.</p>
 *
 * @see com.logicommerce.sdk.builders.basket.ClientInfoBuilder
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class ClientInfoImpl implements ClientInfo {

	private String userAgent;

	private String ip;

	/**
	 * <p>Constructor for ClientInfoImpl.</p>
	 */
	public ClientInfoImpl() {
		// fields are set with the setters
	}

	/** {@inheritDoc} */
	@Override
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * <p>Setter for the field <code>userAgent</code>.</p>
	 *
	 * @param userAgent the buyer's user agent
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/** {@inheritDoc} */
	@Override
	public String getIp() {
		return ip;
	}

	/**
	 * <p>Setter for the field <code>ip</code>.</p>
	 *
	 * @param ip the buyer's IP address
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

}
