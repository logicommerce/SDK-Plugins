package com.logicommerce.sdk.models.validator;

/**
 * TaxId Validation
 *
 * @author LogiCommerce
 * @since 2.7.5
 */
public interface TaxIdValidation extends Validation {

	/**
	 * get blocking status of the taxId validation
	 *
	 * @return a boolean
	 */
	boolean isBlocking();

	/**
	 *  get TaxId information of the taxId validation
	 * @return {@link TaxIdInformation}
	 */
	TaxIdInformation getTaxIdInformation();
}
