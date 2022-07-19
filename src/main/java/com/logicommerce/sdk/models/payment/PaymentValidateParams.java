package com.logicommerce.sdk.models.payment;

import java.util.Map;

/**
 * <p>PaymentValidateParams interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentValidateParams {

	/**
	 * <p>getParams.</p>
	 *
	 * @return a {@link java.util.Map} object
	 */
	Map<String, String> getParams();

	/**
	 * <p>getBody.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getBody();

}
