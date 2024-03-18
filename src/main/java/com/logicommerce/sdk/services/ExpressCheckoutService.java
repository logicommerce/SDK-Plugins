package com.logicommerce.sdk.services;

import com.logicommerce.sdk.definition.ExpressCheckoutDefinition;
import com.logicommerce.sdk.models.Cart;
import com.logicommerce.sdk.models.ExpressCheckoutCustomer;
import com.logicommerce.sdk.models.RequestParams;

/**
 * The ExpressCheckoutService interface provides methods for handling express checkout functionality.
 * It extends the PluginService interface.
 * 
 * @see PluginService
 * @see Cart
 * @see ExpressCheckoutCustomer
 * @see RequestParams
 * @see PluginServiceException
 * @see ExpressCheckoutDefinition
 * 
 * @author LogiCommerce
 * @since 1.3.5
 * 
 */
public interface ExpressCheckoutService extends PluginService {

	/**
	 * Returns the URL for the express checkout process based on the provided cart.
	 *
	 * @param cart The {@link Cart} object containing the items to be checked out.
	 * @return The URL for the express checkout process.
	 * @throws PluginServiceException If an error occurs while retrieving the URL.
	 */
	String getUrl(Cart cart) throws PluginServiceException;

	/**
	 * Validates the request parameters for the express checkout process.
	 *
	 * @param requestParams The request parameters to be validated. {@link RequestParams}.
	 * @return True if the request parameters are valid, false otherwise.
	 * @throws PluginServiceException If an error occurs while validating the request parameters.
	 */
	boolean validate(RequestParams requestParams) throws PluginServiceException;

	/**
	 * Retrieves the express checkout customer information based on the provided request parameters.
	 *
	 * @param requestParams The request parameters containing the customer information. {@link RequestParams}.
	 * @return The express checkout customer object.
	 * @throws PluginServiceException If an error occurs while retrieving the customer information.
	 */
	ExpressCheckoutCustomer getCustomer(RequestParams requestParams) throws PluginServiceException;

}
