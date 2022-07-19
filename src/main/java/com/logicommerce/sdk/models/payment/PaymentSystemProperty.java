package com.logicommerce.sdk.models.payment;

import java.util.Map;

/**
 * <p>PaymentSystemProperty interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentSystemProperty {

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * <p>setName.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	void setName(String name);

	/**
	 * <p>getValues.</p>
	 *
	 * @return a {@link java.util.Map} object
	 */
	Map<String, String> getValues();

	/**
	 * <p>setValues.</p>
	 *
	 * @param value a {@link java.util.Map} object
	 */
	void setValues(Map<String, String> value);

}
