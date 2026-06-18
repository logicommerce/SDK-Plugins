package com.logicommerce.sdk.models.validator;

/**
 * ViesValidation model
 *
 * @author LogiCommerce
 * @since 2.7.6
 */
public interface ViesValidation extends Validation {

	/**
	 *  get VIES information of the VIES validation
	 * @return {@link ViesInformation}
	 */
	ViesInformation getViesInformation();
}
