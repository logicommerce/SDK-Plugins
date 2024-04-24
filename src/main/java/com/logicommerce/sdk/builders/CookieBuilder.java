package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.Cookie;
import com.logicommerce.sdk.models.implementations.CookieImpl;

public class CookieBuilder {

	private String name;

	private String value;

	private int ttl = 1000;
	
	private boolean secure = false;
	
	private boolean httpOnly = true;

	public CookieBuilder() {
		//
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a boolean
	 */
	public void name(String name) {
		this.name = name;
	}

	/**
	 * <p>Setter for the field <code>value</code>.</p>
	 *
	 * @param value a boolean
	 */
	public void value(String value) {
		this.value = value;
	}
	
	/**
	 * <p>Setter for the field <code>ttl</code>.</p>
	 *
	 * @param ttl a boolean
	 */
	public void ttl(int ttl) {
		this.ttl = ttl;
	}
	
	/**
	 * <p>Setter for the field <code>secure</code>.</p>
	 *
	 * @param secure a boolean
	 */
	public void secure(boolean secure) {
		this.secure = secure;
	}
	
	/**
	 * <p>Setter for the field <code>httpOnly</code>.</p>
	 *
	 * @param httpOnly a boolean
	 */
	public void httpOnly(boolean httpOnly) {
		this.httpOnly = httpOnly;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.Cookie} object
	 */
	public Cookie build() {
		CookieImpl cookie = new CookieImpl();
		cookie.setName(name);
		cookie.setSecure(secure);
		cookie.setValue(value);
		cookie.setHttpOnly(httpOnly);
		cookie.setTtl(ttl);
		return cookie;
	}
}
