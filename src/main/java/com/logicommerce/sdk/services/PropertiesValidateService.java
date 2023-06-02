package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.PropertyValueMap;

/**
 * PropertiesValidateService interface.
 * @author LogiCommerce
 * @since 1.1.16
 */
public interface PropertiesValidateService extends PluginService {

	/**
	 * <p>Check property values.</p>
	 * <p>It is used for validate property values from the LogiCommerce 
	 * Backoffice before save the configuration.</p>
	 * 
	 * @param properties a {@link com.logicommerce.sdk.models.PropertyValueMap PropertyValueMap} object
	 * @return true, if successful
	 * @throws com.logicommerce.sdk.services.PluginServiceException the plugin service exception
	 */
	boolean validate(PropertyValueMap properties) throws PluginServiceException;

}
