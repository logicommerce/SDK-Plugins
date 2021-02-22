package com.logicommerce.sdk.services;

import java.util.List;

public interface SearchProductsService extends PluginService {
	
	List<Integer> getProducts(String q) throws PluginServiceException;
	
}
