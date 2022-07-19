package com.logicommerce.sdk.models.payment;

import com.logicommerce.sdk.enums.PaymentType;

/**
 * <p>PaymentBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentBuilder extends PaymentAbstractBuilder<PaymentBuilder,  Payment> {

	protected PaymentType type;

	private String redirectUri;

	/**
	 * <p>form.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataFormBuilder} object
	 */
	public PaymentDataFormBuilder<PaymentBuilder> form() {
		this.type = PaymentType.FORM;
		PaymentDataFormBuilder<PaymentBuilder> form = new PaymentDataFormBuilder<>(this);
		this.content = form;
		return form;
	}

	/**
	 * <p>offline.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentBuilder} object
	 */
	public PaymentBuilder offline() {
		this.type = PaymentType.OFFLINE;
		return setSimpleContent();
	}

	/**
	 * <p>noPay.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataNoPayBuilder} object
	 */
	public PaymentDataNoPayBuilder<PaymentBuilder> noPay() {
		this.type = PaymentType.NO_PAY;
		PaymentDataNoPayBuilder<PaymentBuilder> data = new PaymentDataNoPayBuilder<>(this);
		this.content = data;
		return data;
	}

	/**
	 * <p>cashOnDelivery.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentBuilder} object
	 */
	public PaymentBuilder cashOnDelivery() {
		this.type = PaymentType.CASH_ON_DELIVERY;
		return setSimpleContent();
	}

	/**
	 * <p>widget.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentBuilder} object
	 */
	public PaymentBuilder widget() {
		this.type = PaymentType.WIDGET;
		return setSimpleContent();
	}

	private PaymentBuilder setSimpleContent() {
		this.content = new PaymentDataSimpleBuilder<>(this);
		return returnThis();
	}
	
	/**
	 * <p>redirectUri.</p>
	 *
	 * @param redirectUri a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentBuilder} object
	 */
	public PaymentBuilder redirectUri(String redirectUri) {
		this.type = PaymentType.REDIRECT;
		this.redirectUri = redirectUri;
		return setSimpleContent();
	}

	/** {@inheritDoc} */
	@Override
	public Payment build() {
		PaymentImpl payment = new PaymentImpl();
		setItems(payment);
		payment.setType(type);
		payment.setRedirectUri(redirectUri);
		return payment;
	}

	/** {@inheritDoc} */
	@Override
	public PaymentBuilder returnThis() {
		return this;
	}

}
