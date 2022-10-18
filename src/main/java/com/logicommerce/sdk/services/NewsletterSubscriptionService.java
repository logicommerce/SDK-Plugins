package com.logicommerce.sdk.services;

import java.util.Map;
import com.logicommerce.sdk.models.SubscriptionResponse;

/**
 * <p>NewsletterSubscriptionService interface.</p>
 *
 * @author Logicommerce
 * @since 1.1.2
 */
public interface NewsletterSubscriptionService extends PluginService {

	/**
	 * <p>Subscribe.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @param data a {@link java.util.Map} object
	 * @return a {@link com.logicommerce.sdk.models.SubscriptionResponse} object
	 * @since 1.1.2
	 * @throws com.logicommerce.sdk.services.PluginServiceException PluginServiceException if any.
	 */
	SubscriptionResponse subscribe(final String email, final Map<String, String> data) throws PluginServiceException;

	/**
	 * <p>Unsubscribe.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @param data a {@link java.util.Map} object
	 * @return a {@link com.logicommerce.sdk.models.SubscriptionResponse} object
	 * @since 1.1.2
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	SubscriptionResponse unsubscribe(final String email, final Map<String, String> data) throws PluginServiceException;

	/**
	 * <p>Get status.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @param data a {@link java.util.Map} object
	 * @return a {@link com.logicommerce.sdk.models.SubscriptionResponse} object
	 * @since 1.1.2
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	SubscriptionResponse getStatus(final String email, final Map<String, String> data) throws PluginServiceException;

}
