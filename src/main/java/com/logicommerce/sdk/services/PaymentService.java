package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.payment.Payment;
import com.logicommerce.sdk.models.payment.PaymentToken;
import com.logicommerce.sdk.models.payment.PaymentValidateParams;
import com.logicommerce.sdk.models.payment.PaymentValidateResponse;

/**
 * <p>PaymentService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentService extends PluginService {

	/**
	 * <p>getPayment.</p>
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @param transactionId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.Payment} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	Payment getPayment(Order order, String transactionId) throws PluginServiceException;

	/**
	 * <p>validate.</p>
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @param paymentValidateParams a {@link com.logicommerce.sdk.models.payment.PaymentValidateParams} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponse} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	PaymentValidateResponse validate(Order order, PaymentValidateParams paymentValidateParams) throws PluginServiceException;

	/**
	 * <p>getPaymentTokens.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<PaymentToken> getPaymentTokens();

	/**
	 * <p>deletePaymentToken.</p>
	 *
	 * @param token a {@link java.lang.String} object
	 */
	void deletePaymentToken(String token);

}
