package com.logicommerce.sdk.models.payment;

import java.time.LocalDateTime;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.definition.implementations.OrderStatusDefinitionImpl;
import com.logicommerce.sdk.enums.PaymentValidateResponseType;

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
	private boolean simulateAbort;
	private boolean validated;
	private String messageLog;

	/**
	 * <p>validated.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder validated() {
		this.type = PaymentValidateResponseType.VALIDATED; 
		this.success = true;
		this.paid = true;
		this.validated = true;
		return returnThis();
	}

	/**
	 * <p>simulateAbort.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder simulateAbort() {
		this.success = false;
		this.simulateAbort = true;
		return returnThis();
	}

	/**
	 * <p>authorizationCode.</p>
	 *
	 * @param authorizationCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder authorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
		return returnThis();
	}

	/**
	 * <p>paid.</p>
	 *
	 * @param paid a boolean
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder paid(boolean paid) {
		this.paid = paid;
		return returnThis();
	}

	/**
	 * <p>paymentDate.</p>
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
	 * <p>orderStatus.</p>
	 *
	 * @param orderStatus a {@link com.logicommerce.sdk.definition.OrderStatusDefinition} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public PaymentValidateResponseBuilder orderStatus(OrderStatusDefinition orderStatus) {
		this.orderStatus = orderStatus;
		return returnThis();
	}
	
	/**
	 * <p>orderStatus.</p>
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
	
	/** {@inheritDoc} */
	@Override
	public PaymentValidateResponse build() {
		PaymentValidateResponseImpl payment = new PaymentValidateResponseImpl();
		setValues(payment);
		return payment;
	}

	/**
	 * <p>setValues.</p>
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
		payment.setSimulateAbort(simulateAbort);
		payment.setValidated(validated);
		payment.setMessageLog(messageLog);
	}

	/** {@inheritDoc} */
	@Override
	public PaymentValidateResponseBuilder returnThis() {
		return this;
	}

}
