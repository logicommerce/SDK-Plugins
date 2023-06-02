package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.PropertiesValidatorResponse;
import com.logicommerce.sdk.models.PropertyValueMap;

/**
 * PropertiesValidateService interface.
 * @author LogiCommerce
 * @since 1.1.16
 */
public interface PropertiesValidatorService extends PluginService {

	/**
	 * <p>Check property values.</p>
	 * <p>It is used for validate property values from the LogiCommerce 
	 * Backoffice before save the configuration.</p>
	 * 
	 * @param properties a {@link com.logicommerce.sdk.models.PropertyValueMap PropertyValueMap} object.
	 * @return {@link com.logicommerce.sdk.models.PropertiesValidatorResponse PropertiesValidatorResponse} object.
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	PropertiesValidatorResponse validate(PropertyValueMap properties) throws PluginServiceException;

}
