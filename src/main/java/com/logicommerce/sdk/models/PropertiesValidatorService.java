package com.logicommerce.sdk.models;

import com.logicommerce.sdk.services.PluginService;
import com.logicommerce.sdk.services.PluginServiceException;
import com.logicommerce.sdk.services.PropertiesValidatorResponse;

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
	 * @param properties a {@link com.logicommerce.sdk.models.PropertyValueMap PropertyValueMap} object
	 * @return {@link com.logicommerce.sdk.services.PropertiesValidatorResponse PropertiesValidatorResponse} object
	 * @throws {@link com.logicommerce.sdk.services.PluginServiceException PluginServiceException} the plugin service exception
	 */
	PropertiesValidatorResponse validate(PropertyValueMap properties) throws PluginServiceException;

}
