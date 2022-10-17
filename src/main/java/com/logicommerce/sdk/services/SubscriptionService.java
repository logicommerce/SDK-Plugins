package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.SubscriptionResponse;

/**
 * <p>SubscriptionService interface.</p>
 *
 * @author Logicommerce
 * @since 1.1.2
 */
public interface SubscriptionService extends PluginService {

	/**
	 * <p>Subscribe.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.SubscriptionResponse} object
	 * @since 1.1.2
	 * @throws com.logicommerce.sdk.services.PluginServiceException PluginServiceException if any.
	 */
	SubscriptionResponse subscribe(String email) throws PluginServiceException;

	/**
	 * <p>Unsubscribe.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.SubscriptionResponse} object
	 * @since 1.1.2
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	SubscriptionResponse unsubscribe(String email) throws PluginServiceException;

	/**
	 * <p>Get status.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.SubscriptionResponse} object
	 * @since 1.1.2
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	SubscriptionResponse getStatus(String email) throws PluginServiceException;

}
