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
	 * 
	 * @param filter
	 * @return
	 */
	List<ProviderPickupPoint> getPickupPoints(PickupPointFilter filter)  throws PluginServiceException;
	
	
	boolean validatePickupPoint(ProviderPickupPoint pickupPoint, double weight)  throws PluginServiceException;

}