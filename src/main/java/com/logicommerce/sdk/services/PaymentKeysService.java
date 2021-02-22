package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.payment.PaymentKeys;
import com.logicommerce.sdk.models.payment.PaymentValidateParams;

public interface PaymentKeysService extends PluginService {

	PaymentKeys getPaymentKeys(PaymentValidateParams paymentValidateParams) throws PluginServiceException;
	
}
