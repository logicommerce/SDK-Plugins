package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.enums.RelatedItemType;
import com.logicommerce.sdk.models.Product;

public interface RelatedItemsService extends PluginService {

	List<Integer> getItems(RelatedItemType relatedItemType, Integer id) throws PluginServiceException;
	
	List<Integer> getItems(RelatedItemType relatedItemType) throws PluginServiceException;
	
	List<Product> updateProducts(List<Product> products) throws PluginServiceException;

}
