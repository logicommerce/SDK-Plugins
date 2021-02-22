package com.logicommerce.sdk.services;

public interface CustomFormService extends PluginService {
	
	void processForm(String data) throws PluginServiceException;

}
