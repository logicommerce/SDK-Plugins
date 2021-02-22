package com.logicommerce.sdk.models.payment;

import java.time.LocalDateTime;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.enums.PaymentValidateResponseType;

public class PaymentValidateResponseImpl extends PaymentAbstract implements PaymentValidateResponse {

	private String authorizationCode;
	private boolean paid;
	private LocalDateTime paymentDate;
	private PaymentValidateResponseType type;
	private OrderStatusDefinition orderStatus;
	private boolean simulateAbort;
	private String messageLog;

	@Override
	public String getAuthorizationCode() {
		return authorizationCode;
	}

	@Override
	public boolean isPaid() {
		return paid;
	}

	@Override
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	@Override
	public PaymentValidateResponseType getType() {
		return type;
	}

	@Override
	public OrderStatusDefinition getOrderStatus() {
		return orderStatus;
	}

	@Override
	public boolean simulateAbort() {
		return simulateAbort;
	}
	
	@Override
	public String getMessageLog() {
		return messageLog;
	}
	
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public void setType(PaymentValidateResponseType type) {
		this.type = type;
	}

	public void setOrderStatus(OrderStatusDefinition orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setSimulateAbort(boolean simulateAbort) {
		this.simulateAbort = simulateAbort;
	}

	public void setMessageLog(String messageLog) {
		this.messageLog = messageLog;
		
	}

}
