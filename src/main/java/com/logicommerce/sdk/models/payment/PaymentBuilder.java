package com.logicommerce.sdk.models.payment;

import com.logicommerce.sdk.enums.PaymentStatusType;
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
	
	private PaymentStatusType status;

	/**
	 * <p>
	 * Use for validate response success,<br>
	 * Set status to OK.
	 * </p>
	 *
	 * @since 1.1.0
	 * @return a PaymentValidateResponseBuilder object
	 */
	public PaymentBuilder ok() {
		this.status = PaymentStatusType.OK;
		return returnThis();
	}

	/**
	 * <p>
	 * Use for validate response unsuccess,<br>
	 * Set status to KO.
	 * </p>
	 *
	 * @since 1.1.0
	 * @return a PaymentValidateResponseBuilder object
	 */
	public PaymentBuilder ko() {
		this.status = PaymentStatusType.KO;
		return returnThis();
	}

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
		payment.setStatus(status);
		return payment;
	}

	/** {@inheritDoc} */
	@Override
	public PaymentBuilder returnThis() {
		return this;
	}

}
