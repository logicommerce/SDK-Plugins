package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.PropertiesValidatorResponse;
import com.logicommerce.sdk.models.PropertyValueMap;

/**
 * PropertiesValidateService for validate property values from the LogiCommerce Backoffice.
 * 
 * @author LogiCommerce
 * @since 1.1.16
 */
public interface PropertiesValidatorService extends PluginService {

	/**
	 * Check property values. It is used for validate property values from the LogiCommerce 
	 * Backoffice before save the configuration.
	 * 
	 * @param properties a {@link PropertyValueMap PropertyValueMap} object.
	 * @return {@link PropertiesValidatorResponse PropertiesValidatorResponse} object.
	 * @throws PluginServiceException if any.
	 */
	PropertiesValidatorResponse validate(PropertyValueMap properties) throws PluginServiceException;

}
