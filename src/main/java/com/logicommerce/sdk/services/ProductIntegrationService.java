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
	 * <p>getProduct.</p>
	 *
	 * <p>Detail of a product that is being imported for the first time, so it is expected to return the
	 * whole record.</p>
	 *
	 * @param productId the ID of the product in LogiCommerce, useful to apply the plugin own rules
	 * @param identifier the identifier of the product in the external source
	 * @param code the first of the codes of the product reference
	 * @return a {@link Product} object, or {@code null} when the product must not be imported
	 * @throws PluginServiceException if any.
	 */
	Product getProduct(Integer productId, String identifier, String code) throws PluginServiceException;

	/**
	 * <p>getUpdateProduct.</p>
	 *
	 * <p>Detail of a product that is already imported and has to be updated. Unlike
	 * {@link #getProduct(Integer, String, String) getProduct} it may return a reduced projection: only the
	 * informed blocks are applied over the existing product, the rest are kept as they are. This lets the
	 * implementation leave out whatever must not overwrite what the commerce already has, such as images or
	 * custom tags edited by hand.</p>
	 *
	 * @param productId the ID of the product in LogiCommerce, useful to apply the plugin own rules
	 * @param identifier the identifier of the product in the external source
	 * @param code the first of the codes of the product reference
	 * @return a {@link Product} object, or {@code null} when the product must not be updated
	 * @throws PluginServiceException if any.
	 */
	Product getUpdateProduct(Integer productId, String identifier, String code) throws PluginServiceException;

}
