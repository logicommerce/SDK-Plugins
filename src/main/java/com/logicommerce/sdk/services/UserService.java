package com.logicommerce.sdk.services;

public interface UserService extends PluginService {

	void upsert() throws PluginServiceException;

	void delete() throws PluginServiceException;

	void login() throws PluginServiceException;

	void logout() throws PluginServiceException;

}
