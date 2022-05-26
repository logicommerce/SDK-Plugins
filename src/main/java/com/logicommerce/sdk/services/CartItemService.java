package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.CartItem;

public interface CartItemService extends PluginService {

	void addItem(CartItem item) throws PluginServiceException;

	void updateItem(CartItem item) throws PluginServiceException;

	void addItems(List<CartItem> items) throws PluginServiceException;

	void updateItems(List<CartItem> items) throws PluginServiceException;

	void deleteItem(String itemHash) throws PluginServiceException;

}
