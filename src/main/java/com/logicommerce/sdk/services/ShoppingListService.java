package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.Product;

/**
 * <p>ShoppingListService interface.</p>
 *
 * @author Logicommerce
 * @since 1.1.11
 */
public interface ShoppingListService extends PluginService {

	/**
	 * <p>add Element to default shoppingList .</p>
	 *
	 * @param product a {@link com.logicommerce.sdk.models.Product} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void upsert(List<Product> product) throws PluginServiceException;

}