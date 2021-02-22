package com.logicommerce.sdk.services;

public interface NewsletterService extends PluginService {

	void subscribe(String email) throws PluginServiceException;

	void unsubscribe(String email) throws PluginServiceException;

	boolean isSubscribed(String email) throws PluginServiceException;

}
