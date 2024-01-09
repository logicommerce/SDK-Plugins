package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.Address;
import com.logicommerce.sdk.models.AddressValidated;

/**
 * AddressService for Address Systems
 * 
 * @author Logicommerce
 * @since 1.3.0
 */
public interface AddressService extends PluginService {

	/**
	 * Validate an Address
	 * 
	 * @param address a {@link Address} object
	 * @return a {@link AddressValidated} object
	 * @throws PluginServiceException if any.
	 */
	AddressValidated validate(Address address) throws PluginServiceException;

}
