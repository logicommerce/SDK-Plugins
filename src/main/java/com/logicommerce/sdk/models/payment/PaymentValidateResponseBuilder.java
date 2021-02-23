package com.logicommerce.sdk.models.payment;

import java.time.LocalDateTime;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.definition.implementations.OrderStatusDefinitionImpl;
import com.logicommerce.sdk.enums.PaymentValidateResponseType;

public class PaymentValidateResponseBuilder extends PaymentAbstractBuilder<PaymentValidateResponseBuilder, PaymentValidateResponse>{
	
	private String authorizationCode;
	private boolean paid;
	private LocalDateTime paymentDate;
	private PaymentValidateResponseType type;
	private OrderStatusDefinition orderStatus;
	private OrderStatusDefinitionImpl.Builder<PaymentValidateResponseBuilder> orderStatusBuilder;
	private boolean simulateAbort;
	private String messageLog;

	public PaymentValidateResponseBuilder simulateAbort() {
		this.success = false;
		this.simulateAbort = true;
		return returnThis();
	}

	public PaymentValidateResponseBuilder authorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
		return returnThis();
	}

	public PaymentValidateResponseBuilder paid(boolean paid) {
		this.paid = paid;
		return returnThis();
	}

	public PaymentValidateResponseBuilder paymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
		return returnThis();
	}

	public PaymentDataFormBuilder<PaymentValidateResponseBuilder> form() {
		this.type = PaymentValidateResponseType.FORM;
		PaymentDataFormBuilder<PaymentValidateResponseBuilder> form = new PaymentDataFormBuilder<>(returnThis());
		this.content = form;
		return form;
	}

	public PaymentValidateResponseBuilder noData() {
		this.type = PaymentValidateResponseType.NO_DATA;
		this.content = new PaymentDataSimpleBuilder<>(returnThis());
		return this;
	}

	public PaymentValidateResponseBuilder orderStatus(OrderStatusDefinition orderStatus) {
		this.orderStatus = orderStatus;
		return returnThis();
	}

	public PaymentValidateResponseBuilder messageLog(String messageLog) {
		this.messageLog = messageLog;
		return returnThis();
	}
	
	public OrderStatusDefinitionImpl.Builder<PaymentValidateResponseBuilder> orderStatus() {
		if (orderStatusBuilder == null) {
			orderStatusBuilder = new OrderStatusDefinitionImpl.Builder<>(returnThis());
		}
		return orderStatusBuilder;
	}

	@Override
	public PaymentValidateResponse build() {
		PaymentValidateResponseImpl payment = new PaymentValidateResponseImpl();
		setValues(payment);
		return payment;
	}

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
		payment.setMessageLog(messageLog);
	}

	@Override
	public PaymentValidateResponseBuilder returnThis() {
		return this;
	}

}
