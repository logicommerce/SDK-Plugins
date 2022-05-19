package com.logicommerce.sdk.services;

public interface BasketService extends PluginService {

	void calculate() throws PluginServiceException;

	@Deprecated
	void addItem(String itemHash, Integer quantity) throws PluginServiceException;

	@Deprecated
	void updateItem(String itemHash, Integer quantity) throws PluginServiceException;

	@Deprecated
	void deleteItem(String itemHash) throws PluginServiceException;

	void clear() throws PluginServiceException;

}
