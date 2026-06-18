package com.logicommerce.sdk.services;

import com.logicommerce.sdk.enums.TaxIdOwnerType;
import com.logicommerce.sdk.enums.TaxIdType;
import com.logicommerce.sdk.models.validator.TaxIdValidation;
import com.logicommerce.sdk.models.validator.ViesValidation;

/**
 * ValidatorService
 * 
 * @author LogiCommerce
 * @since 2.7.6
 */
public interface ValidatorService extends PluginService {

	/**
	 * validate vies
	 *
	 * @param taxId String
	 * @param countryCode String
	 *
	 * @return a {@link ViesValidation} object
	 * @throws PluginServiceException if any.
	 */
	ViesValidation validateVies(String taxId, String countryCode) throws PluginServiceException;

	/**
	 * validate taxId
	 *
	 * @param taxId String
	 * @param countryCode String
	 * @param taxIdType {@link TaxIdType}
	 * @param taxIdOwnerType {@link TaxIdOwnerType}
	 *
	 * @return a {@link TaxIdValidation} object
	 * @throws PluginServiceException
	 */
	TaxIdValidation validateTaxId(String taxId, String countryCode, TaxIdType taxIdType, TaxIdOwnerType taxIdOwnerType) throws PluginServiceException;

}
