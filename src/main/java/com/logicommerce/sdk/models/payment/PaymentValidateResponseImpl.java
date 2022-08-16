package com.logicommerce.sdk.models.payment;

import java.time.LocalDateTime;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.enums.PaymentValidateResponseType;
import com.logicommerce.sdk.enums.PaymentValidateStatusType;

/**
 * <p>PaymentValidateResponseImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentValidateResponseImpl extends PaymentAbstract implements PaymentValidateResponse {

	private String authorizationCode;
	private boolean paid;
	private LocalDateTime paymentDate;
	private PaymentValidateResponseType type;
	private PaymentValidateStatusType status;
	private OrderStatusDefinition orderStatus;
	private String messageLog;

	/** {@inheritDoc} */
	@Override
	public String getAuthorizationCode() {
		return authorizationCode;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isPaid() {
		return paid;
	}

	/** {@inheritDoc} */
	@Override
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	/** {@inheritDoc} */
	@Override
	public PaymentValidateResponseType getType() {
		return type;
	}

	/** {@inheritDoc} */
	@Override
	public OrderStatusDefinition getOrderStatus() {
		return orderStatus;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getMessageLog() {
		return messageLog;
	}

	/**
	 * <p>Setter for the field <code>authorizationCode</code>.</p>
	 *
	 * @param authorizationCode a {@link java.lang.String} object
	 */
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	/**
	 * <p>Setter for the field <code>paid</code>.</p>
	 *
	 * @param paid a boolean
	 */
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	/**
	 * <p>Setter for the field <code>paymentDate</code>.</p>
	 *
	 * @param paymentDate a {@link java.time.LocalDateTime} object
	 */
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.PaymentValidateResponseType} object
	 */
	public void setType(PaymentValidateResponseType type) {
		this.type = type;
	}

	/**
	 * <p>Setter for the field <code>orderStatus</code>.</p>
	 *
	 * @param orderStatus a {@link com.logicommerce.sdk.definition.OrderStatusDefinition} object
	 */
	public void setOrderStatus(OrderStatusDefinition orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * <p>Setter for the field <code>messageLog</code>.</p>
	 *
	 * @param messageLog a {@link java.lang.String} object
	 */
	public void setMessageLog(String messageLog) {
		this.messageLog = messageLog;
	}
	
	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 * 
	 * @since 1.0.22
	 * @return a {@link com.logicommerce.sdk.enums.PaymentValidateStatusType} object
	 */
	public PaymentValidateStatusType getStatus() {
		return status;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @since 1.0.22
	 * @param status a {@link com.logicommerce.sdk.enums.PaymentValidateStatusType} object
	 */
	public void setStatus(PaymentValidateStatusType status) {
		this.status = status;
	}
}
