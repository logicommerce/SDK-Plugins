package com.logicommerce.sdk.models.payment;

import java.util.Map;

/**
 * <p>PaymentToken interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentToken {

	/**
	 * <p>getToken.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getToken();
	
	/**
	 * <p>setToken.</p>
	 *
	 * @param token a {@link java.lang.String} object
	 */
	void setToken(String token);

	/**
	 * <p>getData.</p>
	 *
	 * @return a {@link java.util.Map} object
	 */
	Map<String, String> getData();
	
	/**
	 * <p>setData.</p>
	 *
	 * @param data a {@link java.util.Map} object
	 */
	void setData(Map<String, String> data);
	
	/**
	 * <p>addItem.</p>
	 *
	 * @param key a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 */
	void addItem(String key, String value);

}
