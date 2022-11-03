package com.logicommerce.sdk.models.implementations;

import com.logicommerce.sdk.models.Cookie;

/**
 * <p>Cookie class.</p>
 *
 * @author Logicommerce
 * @since 1.1.4
 */
public class CookieImpl implements Cookie {

	private String name;

	private String value;

	private int ttl;

	/**
	 * <p>Constructor for CookieImpl.</p>
	 */
	public CookieImpl() {

	}

	/**
	 * <p>Constructor for CookieImpl.</p>
	 * 
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @param ttl a int
	 */
	public CookieImpl(String name, String value, int ttl) {
		this.name = name;
		this.value = value;
		this.ttl = ttl;
	}

	/** {@inheritDoc} */
	@Override
	public String getValue() {
		return value;
	}

	/** {@inheritDoc} */
	@Override
	public void setValue(String value) {
		this.value = value;
	}

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return name;
	}

	/** {@inheritDoc} */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/** {@inheritDoc} */
	@Override
	public int getTtl() {
		return ttl;
	}

	/** {@inheritDoc} */
	@Override
	public void setTtl(int ttl) {
		this.ttl = ttl;
	}

}
