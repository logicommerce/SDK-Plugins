package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.enums.DocumentType;
import com.logicommerce.sdk.models.order.Order;

/**
 * <p>OrderIntegrationService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderIntegrationService extends PluginService {

	/**
	 * <p>importOrders.</p>
	 *
	 * @param documentType a {@link com.logicommerce.sdk.enums.DocumentType} object
	 * @param marketplaceId a {@link java.lang.String} object
	 * @return a {@link java.util.List} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	List<Order> importOrders(DocumentType documentType, String marketplaceId) throws PluginServiceException;

}
