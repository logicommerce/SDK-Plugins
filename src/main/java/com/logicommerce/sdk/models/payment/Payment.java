package com.logicommerce.sdk.models.payment;

import com.logicommerce.sdk.enums.PaymentType;

public interface Payment {

	boolean isSuccess();

	String getMessage();
	
	String getRedirectUri();

	String getTransactionId();

	PaymentType getType();

	PaymentData getData();

}
