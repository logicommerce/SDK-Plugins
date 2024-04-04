package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.pickuppoints.PickupPointFilter;
import com.logicommerce.sdk.models.pickuppoints.ProviderPickupPoint;

/**
 * PickupPointProviderService.
 * Return the list of PickupPointProviders and their pickup points.
 * 
 * @author LogiCommerce
 * @since 1.3.6
 * 
 */
public interface ProviderPickupPointService extends PluginService {

	/**
	 * 
	 * @param filter
	 * @return
	 */
	List<ProviderPickupPoint> getPickupPoints(PickupPointFilter filter)  throws PluginServiceException;
	
	
	boolean validatePickupPoint(String key, String countryCode, String postalCode, String weight)  throws PluginServiceException;

}