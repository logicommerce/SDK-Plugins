package com.logicommerce.sdk.services;

public interface BasketService extends PluginService {

	void calculate() throws PluginServiceException;

	void addItem(String itemHash, Integer quantity) throws PluginServiceException;

	void updateItem(String itemHash, Integer quantity) throws PluginServiceException;

	void deleteItem(String itemHash) throws PluginServiceException;

	void clear() throws PluginServiceException;

}
