package com.logicommerce.sdk.services;

import java.util.List;

/**
 * <p>SearchProductsService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface SearchProductsService extends PluginService {
	
	/**
	 * <p>getProducts.</p>
	 *
	 * @param q a {@link java.lang.String} object
	 * @return a {@link java.util.List} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	List<Integer> getProducts(String q) throws PluginServiceException;
	
}
