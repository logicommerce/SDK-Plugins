package com.logicommerce.sdk.services;

import java.util.Map;
import com.logicommerce.sdk.models.payment.PaymentSystemProperties;

/**
 * <p>PaymentSystemService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentSystemService extends PluginService {

	/**
	 * <p>getProperties.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentSystemProperties} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	PaymentSystemProperties getProperties() throws PluginServiceException;

	/**
	 * <p>selectProperty.</p>
	 *
	 * @param propertyName a {@link java.lang.String} object
	 * @param additionalData a {@link java.util.Map} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void selectProperty(String propertyName, Map<String, String> additionalData) throws PluginServiceException;

}
