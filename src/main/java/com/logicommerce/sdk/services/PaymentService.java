package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.payment.Payment;
import com.logicommerce.sdk.models.payment.PaymentToken;
import com.logicommerce.sdk.models.payment.PaymentValidateParams;
import com.logicommerce.sdk.models.payment.PaymentValidateResponse;

public interface PaymentService extends PluginService {

	Payment getPayment(Order order, String transactionId) throws PluginServiceException;

	PaymentValidateResponse validate(Order order, PaymentValidateParams paymentValidateParams) throws PluginServiceException;

	List<PaymentToken> getPaymentTokens();

	void deletePaymentToken(String token);

}
