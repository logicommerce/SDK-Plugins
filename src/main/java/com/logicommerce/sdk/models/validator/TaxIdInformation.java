package com.logicommerce.sdk.models.validator;

/**
 * TaxId Information
 *
 * @author LogiCommerce
 * @since 2.7.6
 */
public interface TaxIdInformation {

	/**
	 *  get TaxId information
	 * @return s String
	 */
	String getTaxIdCompact();

	/**
	 *  get TaxId information in standard format
	 * @return a String
	 */
	String getTaxIdStandard();

}
