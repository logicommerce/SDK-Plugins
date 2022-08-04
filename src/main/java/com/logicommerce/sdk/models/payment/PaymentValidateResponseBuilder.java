package com.logicommerce.sdk.models.payment;

import java.time.LocalDateTime;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.definition.implementations.OrderStatusDefinitionImpl;
import com.logicommerce.sdk.enums.PaymentValidateResponseType;
import com.logicommerce.sdk.enums.PaymentValidateStatusType;

/**
 * <p>PaymentValidateResponseBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentValidateResponseBuilder extends PaymentAbstractBuilder<PaymentValidateResponseBuilder, PaymentValidateResponse> {

	private String authorizationCode;
	private boolean paid;
	private LocalDateTime paymentDate;
	private PaymentValidateResponseType type;
	private OrderStatusDefinition orderStatus;
	private OrderStatusDefinitionImpl.Builder<PaymentValidateResponseBuilder> orderStatusBuilder;
	@Deprecated(since = "1.0.19", forRemoval = true)
	private boolean simulateAbort;
	@Deprecated(since = "1.0.22", forRemoval = true)
	private boolean validated;
	private String messageLog;

	/**
	 * <p>For a previous validated order.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder validated() {
		this.success = true;
		this.validated = true;
		this.status = PaymentValidateStatusType.VALIDATED;
		return returnThis();
	}

	/**
	 * <p>For skip order actions.</p>
	 *
	 * @since 	1.0.22
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder skip() {
		this.success = false;
		this.status = PaymentValidateStatusType.SKIP;
		return returnThis();
	}

	/**
	 * <p>simulateAbort.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	@Deprecated(since = "1.0.19")
	public PaymentValidateResponseBuilder simulateAbort() {
		this.success = false;
		this.simulateAbort = true;
		return returnThis();
	}

	/**
	 * <p>For a webhook request messages.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder webhookMessage() {
		this.type = PaymentValidateResponseType.WEBHOOK_MESSAGE;
		return returnThis();
	}

	/**
	 * <p>For a redirect response.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder redirect() {
		this.success = true;
		this.type = PaymentValidateResponseType.REDIRECT;
		this.status = PaymentValidateStatusType.OK;
		return returnThis();
	}

	/**
	 * <p>For set the authorization code.</p>
	 *
	 * @param authorizationCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder authorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
		return returnThis();
	}

	/**
	 * <p>For set is order is paid.</p>
	 *
	 * @param paid a boolean
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder paid(boolean paid) {
		this.paid = paid;
		return returnThis();
	}

	/**
	 * <p>For set the payment date.</p>
	 *
	 * @param paymentDate a {@link java.time.LocalDateTime} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder paymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
		return returnThis();
	}

	/**
	 * <p>form.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataFormBuilder} object
	 */
	public PaymentDataFormBuilder<PaymentValidateResponseBuilder> form() {
		this.type = PaymentValidateResponseType.FORM;
		PaymentDataFormBuilder<PaymentValidateResponseBuilder> form = new PaymentDataFormBuilder<>(returnThis());
		this.content = form;
		return form;
	}

	/**
	 * <p>noData.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder noData() {
		this.type = PaymentValidateResponseType.NO_DATA;
		this.content = new PaymentDataSimpleBuilder<>(returnThis());
		return this;
	}

	/**
	 * <p>For set the order status and substatus from OrderStatusDefiniton.</p>
	 *
	 * @param orderStatus a {@link com.logicommerce.sdk.definition.OrderStatusDefinition} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder orderStatus(OrderStatusDefinition orderStatus) {
		this.orderStatus = orderStatus;
		return returnThis();
	}

	/**
	 * <p>Order status builder.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.implementations.OrderStatusDefinitionImpl.Builder} object
	 */
	public OrderStatusDefinitionImpl.Builder<PaymentValidateResponseBuilder> orderStatus() {
		if (orderStatusBuilder == null) {
			orderStatusBuilder = new OrderStatusDefinitionImpl.Builder<>(returnThis());
		}
		return orderStatusBuilder;
	}

	/**
	 * <p>messageLog.</p>
	 *
	 * @param messageLog a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder messageLog(String messageLog) {
		this.messageLog = messageLog;
		return returnThis();
	}

	/**
	 * <p>Type of payment validate response.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.PaymentValidateResponseType } PaymentValidateResponseType
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 * @since 1.0.19
	 */
	public PaymentValidateResponseBuilder type(PaymentValidateResponseType type) {
		this.type = type;
		return returnThis();
	}

	/** {@inheritDoc} */
	@Override
	public PaymentValidateResponse build() {
		PaymentValidateResponseImpl payment = new PaymentValidateResponseImpl();
		setValues(payment);
		return payment;
	}

	/**
	 * <p>Set all the values from payment.</p>
	 *
	 * @param payment a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseImpl} object
	 */
	protected void setValues(PaymentValidateResponseImpl payment) {
		setItems(payment);
		payment.setAuthorizationCode(authorizationCode);
		payment.setPaid(paid);
		payment.setPaymentDate(paymentDate);
		payment.setType(type);
		if (orderStatus != null) {
			payment.setOrderStatus(orderStatus);
		} else if (orderStatusBuilder != null) {
			payment.setOrderStatus(orderStatusBuilder.build());
		}
		payment.setValidated(validated);
		payment.setMessageLog(messageLog);
		payment.setStatus(status);
	}

	/** {@inheritDoc} */
	@Override
	public PaymentValidateResponseBuilder returnThis() {
		return this;
	}

}