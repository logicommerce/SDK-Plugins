package com.logicommerce.sdk.services;

import java.util.List;
import java.util.Map;
import com.logicommerce.sdk.models.Carriers;
import com.logicommerce.sdk.models.ElementProperty;

/**
 * <p>ShipperService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ShipperService extends PluginService {

	/**
	 * <p>getAvailableCarriers.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.Carriers} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	Carriers getAvailableCarriers() throws PluginServiceException;

	/**
	 * <p>selectShipper.</p>
	 *
	 * @param shippingHash a {@link java.lang.String} object
	 * @param additionalData a {@link java.util.Map} object
	 * @return a {@link java.util.List} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	List<ElementProperty> selectShipper(String shippingHash, Map<String, String> additionalData) throws PluginServiceException;

}
