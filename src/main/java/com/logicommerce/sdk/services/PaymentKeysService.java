package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.RequestParams;
import com.logicommerce.sdk.models.payment.PaymentKeys;

/**
 * <p>PaymentKeysService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentKeysService extends PluginService {

	/**
	 * <p>getPaymentKeys.</p>
	 *
	 * @param requestParams a {@link com.logicommerce.sdk.models.RequestParams} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentKeys} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	PaymentKeys getPaymentKeys(RequestParams requestParams) throws PluginServiceException;

}
