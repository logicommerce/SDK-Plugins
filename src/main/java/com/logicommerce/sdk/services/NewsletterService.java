package com.logicommerce.sdk.services;

/**
 * <p>NewsletterService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 * @deprecated
 */
@Deprecated(since = "1.1.2", forRemoval = true)
public interface NewsletterService extends PluginService {

	/**
	 * <p>subscribe.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void subscribe(String email) throws PluginServiceException;

	/**
	 * <p>unsubscribe.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void unsubscribe(String email) throws PluginServiceException;

	/**
	 * <p>isSubscribed.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a boolean
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	boolean isSubscribed(String email) throws PluginServiceException;

}
