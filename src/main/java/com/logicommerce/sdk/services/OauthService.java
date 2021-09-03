package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.OauthUser;

public interface OauthService extends PluginService {
		
	String getOauthUri(String redirectBaseUri, String state) throws PluginServiceException;

	OauthUser callback(String redirectBaseUri, String state, String code) throws PluginServiceException;

}