package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.payment.PaymentKeys;
import com.logicommerce.sdk.models.payment.PaymentValidateParams;

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
	 * @param paymentValidateParams a {@link com.logicommerce.sdk.models.payment.PaymentValidateParams} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentKeys} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	PaymentKeys getPaymentKeys(PaymentValidateParams paymentValidateParams) throws PluginServiceException;

}
