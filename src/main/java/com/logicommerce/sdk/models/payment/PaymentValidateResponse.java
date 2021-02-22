package com.logicommerce.sdk.models.payment;

import java.time.LocalDateTime;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.enums.PaymentValidateResponseType;

public interface PaymentValidateResponse {

	boolean isSuccess();

	String getMessage();
	
	String getMessageLog();

	String getTransactionId();

	String getAuthorizationCode();

	boolean isPaid();

	LocalDateTime getPaymentDate();

	PaymentValidateResponseType getType();

	PaymentData getData();

	OrderStatusDefinition getOrderStatus();
		
	boolean simulateAbort();

}
