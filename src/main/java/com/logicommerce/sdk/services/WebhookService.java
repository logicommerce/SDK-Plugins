package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.RequestParams;
import com.logicommerce.sdk.models.WebhookResponse;

/**
 * <p>UserService interface.</p>
 *
 * @author Logicommerce
 * @since 2.4.0
 */
public interface WebhookService extends PluginService {

	/**
	 * <p>
	 * shouldHandle, for a given request, this method return true if the plugin should handle the request.
	 * </p>
	 *
	 * @param requestParams a {@link com.logicommerce.sdk.models.RequestParams} object.
	 * @return a boolean.
	 */
	boolean shouldHandle(RequestParams requestParams) throws PluginServiceException;

	/**
	 * <p>
	 * process.
	 * </p>
	 *
	 * @param requestParams a {@link com.logicommerce.sdk.models.RequestParams} object.
	 */
	WebhookResponse process(RequestParams requestParams) throws PluginServiceException;
}
