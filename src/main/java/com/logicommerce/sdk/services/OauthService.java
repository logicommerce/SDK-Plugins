package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.OauthUser;

/**
 * <p>OauthService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OauthService extends PluginService {
		
	/**
	 * <p>getOauthUri.</p>
	 *
	 * @param redirectBaseUri a {@link java.lang.String} object
	 * @param state a {@link java.lang.String} object
	 * @return a {@link java.lang.String} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	String getOauthUri(String redirectBaseUri, String state) throws PluginServiceException;

	/**
	 * <p>callback.</p>
	 *
	 * @param redirectBaseUri a {@link java.lang.String} object
	 * @param state a {@link java.lang.String} object
	 * @param code a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.OauthUser} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	OauthUser callback(String redirectBaseUri, String state, String code) throws PluginServiceException;

}
