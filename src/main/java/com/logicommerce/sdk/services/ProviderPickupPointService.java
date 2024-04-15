package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.pickuppoints.PickupPointFilter;
import com.logicommerce.sdk.models.pickuppoints.ProviderPickupPoint;

/**
 * PickupPointProviderService.
 * Return the list of PickupPointProviders and their pickup points.
 * 
 * @author LogiCommerce
 * @since 1.3.7
 * 
 */
public interface ProviderPickupPointService extends PluginService {

	/**
	 * Get provider pickup points list for a filter.
	 * 
	 * @param filter a {@link com.logicommerce.sdk.models.pickuppoints.PickupPointFilter PickupPointFilter} object
	 * @see	com.logicommerce.sdk.models.pickuppoints.PickupPointFilter PickupPointFilter
	 * @return a List{@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPoint} object
	 * @throws PluginServiceException if any.
	 * @since 1.3.7
	 */
	List<ProviderPickupPoint> getPickupPoints(PickupPointFilter filter)  throws PluginServiceException;
	
	/**
	 * Check provider pickup point is available.
	 * 
	 * @param pickupPoint a {@link com.logicommerce.sdk.models.pickuppoints.ProviderPickupPoint ProviderPickupPoint} object
	 * @see	com.logicommerce.sdk.models.pickuppoints.ProviderPickupPoint ProviderPickupPoint
	 * @param weight a double
	 * @return a boolean
	 * @throws PluginServiceException if any.
	 * @since 1.3.7
	 */
	boolean validatePickupPoint(ProviderPickupPoint pickupPoint, double weight)  throws PluginServiceException;

}