package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.Cart;
import com.logicommerce.sdk.models.ExpressCheckoutValidateResponse;
import com.logicommerce.sdk.models.ValidateParams;

/**
 * ExpressCheckoutService interface.
 * 
 * This interface provides methods for interacting with the Express Checkout service.
 * It extends the PluginService interface and defines additional methods specific to Express Checkout.
 *
 * @author Logicommerce
 * @since 1.3.5
 */
public interface ExpressCheckoutService extends PluginService {

	/**
	 * Gets the URL for the Express Checkout service.
	 *
	 * @param cart the {@link Cart} to use for the Express Checkout service
	 * @return the URL for the Express Checkout service
	 * @throws PluginServiceException if an error occurs while retrieving the URL
	 */
	String getUrl(Cart cart) throws PluginServiceException;

	/**
	 * Validates the given parameters for Express Checkout.
	 *
	 * @param validateParams the parameters to validate. {@link ValidateParams}.
	 * @return the validation response
	 * @throws PluginServiceException if an error occurs while validating the parameters
	 */
	ExpressCheckoutValidateResponse validate(ValidateParams validateParams) throws PluginServiceException;

}
