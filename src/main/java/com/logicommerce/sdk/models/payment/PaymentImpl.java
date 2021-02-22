package com.logicommerce.sdk.models.payment;

import com.logicommerce.sdk.enums.PaymentType;

public class PaymentImpl extends PaymentAbstract implements Payment {

	private PaymentType type;

	private String redirectUri;

	@Override
	public PaymentType getType() {
		return type;
	}

	public void setType(PaymentType type) {
		this.type = type;
	}

	@Override
	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

}
