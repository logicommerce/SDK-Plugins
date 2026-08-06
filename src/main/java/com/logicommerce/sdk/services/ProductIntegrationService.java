package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.product.Product;
import com.logicommerce.sdk.models.product.ProductReference;

/**
 * <p>ProductIntegrationService interface.</p>
 *
 * @author LogiCommerce
 * @since 2.8.0
 */
public interface ProductIntegrationService extends PluginService {

	/**
	 * <p>getProducts.</p>
	 *
	 * @return a {@link List} of {@link ProductReference} objects, one for every product of the external source
	 * @throws PluginServiceException if any
	 */
	List<ProductReference> getProducts() throws PluginServiceException;

	/**
	 * <p>getUpdatedProducts.</p>
	 *
	 * @return a {@link List} of {@link ProductReference} objects, one for every product modified in the external
	 *         source. Products whose {@link ProductReference#getUpdatedAt() updatedAt} is not later than the date
	 *         of their last import are discarded, so returning it avoids importing a product that has not changed
	 * @throws PluginServiceException if any.
	 */
	List<ProductReference> getUpdatedProducts() throws PluginServiceException;

	/**
	 * getProduct
	 * @param productId the ID of the product
	 * @param identifier the identifier of the product
	 * @param code the code of the product
	 * @return a {@link Product} object
	 * @throws PluginServiceException if any.
	 */
	Product getProduct(Integer productId, String identifier, String code) throws PluginServiceException;

}
