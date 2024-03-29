package com.logicommerce.sdk.models;

/**
 * <p>Cookie interface.</p>
 *
 * @author Logicommerce
 * @since 1.1.4
 */

public interface Cookie {

	/**
	 * <p>Get value of the cookie.</p>
	 * 
	 * @since  1.1.4
	 * @return a {@link java.lang.String String} object
	 */
	public String getValue();

	/**
	 * <p>Set value of the cookie.</p>
	 *
	 * @param value a {@link java.lang.String String} object
	 * @since  1.1.4
	 */
	public void setValue(String value);

	/**
	 * <p>Get name value of the cookie.</p>
	 * 
	 * @since  1.1.4
	 * @return a {@link java.lang.String String} object
	 */
	public String getName();

	/**
	 * <p>Set name value of the cookie.</p>
	 *
	 * @param name a {@link java.lang.String String} object
	 * @since  1.1.4
	 */
	public void setName(String name);

	/**
	 * <p>Get ttl value of the cookie.</p>
	 * 
	 * @since  1.1.4
	 * @return a int
	 */
	public int getTtl();

	/**
	 * <p>Set ttl value of the cookie.</p>
	 *
	 * @param ttl a int
	 * @since  1.1.4
	 */
	public void setTtl(int ttl);
	
	/**
	 * <p>Set httpOnly value of the cookie.</p>
	 *
	 * @param httpOnly a boolean
	 * @since  1.1.14
	 */
	public void setHttpOnly(boolean httpOnly);
	
	/**
	 * <p>Get httpOnly value of the cookie.</p>
	 *
	 * @since  1.1.14
	 * @return a boolean
	 */
	public boolean getHttpOnly();
	
	/**
	 * <p>Get secure value of the cookie.</p>
	 *
	 * @since  1.1.14
	 * @return a boolean
	 */
	public boolean getSecure();
	
	/**
	 * <p>Set secure value of the cookie.</p>
	 *
	 * @param secure a boolean
	 * @since  1.1.14
	 */
	public void setSecure(boolean secure);

}
