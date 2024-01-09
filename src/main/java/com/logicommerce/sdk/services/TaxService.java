package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.TaxCodeCollection;

/**
 * TaxService for Sales Tax Systems
 *
 * @author Logicommerce
 * @since 1.3.0
 */
public interface TaxService extends PluginService {

	/**
	 * Obtain a filtered and paginated list of TaxCodes.
	 *
	 * @param q a {@link String} object
	 * @param page a int
	 * @param perPage a int
	 * @return a {@link TaxCodeCollection} object
	 * @throws PluginServiceException if any.
	 */
	TaxCodeCollection getTaxCodes(String q, int page, int perPage) throws PluginServiceException;

}
