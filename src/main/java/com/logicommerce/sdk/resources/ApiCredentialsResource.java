package com.logicommerce.sdk.resources;

import com.logicommerce.sdk.enums.ApiType;

/**
 * <p>Api Credentials resource interface.</p>
 *
 * @author Logicommerce
 * @since 2.7.5
 */
public interface ApiCredentialsResource {

	/**
	 * Obtains an Authorization header to use when calling internal APIs.
	 *
	 * @param apiType a {@link ApiType} object
	 * @return a {@link String} object (Authorization header)
	 */
	String getAuthorizationHeader(ApiType apiType) throws PluginResourceException;

}
