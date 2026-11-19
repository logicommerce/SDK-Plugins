package com.logicommerce.sdk.enums;

/**
 * <p>Type of the api-plugins authentication definition that authenticated an endpoint request.</p>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public enum ApiPluginsAuthenticationType {
	HEADER,
	QUERY_PARAM,
	JWT,
	PLUGIN_SESSION,
	PATH_PREFIX
}
