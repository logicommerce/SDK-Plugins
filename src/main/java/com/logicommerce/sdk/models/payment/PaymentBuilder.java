package com.logicommerce.sdk.models.payment;

import com.logicommerce.sdk.enums.PaymentType;

public class PaymentBuilder extends PaymentAbstractBuilder<PaymentBuilder,  Payment> {

	protected PaymentType type;
	
	private String redirectUri;

	public PaymentDataFormBuilder<PaymentBuilder> form() {
		this.type = PaymentType.FORM;
		PaymentDataFormBuilder<PaymentBuilder> form = new PaymentDataFormBuilder<>(this);
		this.content = form;
		return form;
	}

	public PaymentBuilder offline() {
		this.type = PaymentType.OFFLINE;
		return setSimpleContent();
	}

	public PaymentBuilder noPay() {
		this.type = PaymentType.NO_PAY;
		return setSimpleContent();
	}

	public PaymentBuilder cashOnDelivery() {
		this.type = PaymentType.CASH_ON_DELIVERY;
		return setSimpleContent();
	}

	private PaymentBuilder setSimpleContent() {
		this.content = new PaymentDataSimpleBuilder<>(this);
		return returnThis();
	}
	
	public PaymentBuilder redirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
		return this;
	}

	@Override
	public Payment build() {
		PaymentImpl payment= new PaymentImpl();
		setItems(payment);
		payment.setType(type);
		payment.setRedirectUri(redirectUri);
		return payment;
	}

	@Override
	public PaymentBuilder returnThis() {
		return this;
	}

}
