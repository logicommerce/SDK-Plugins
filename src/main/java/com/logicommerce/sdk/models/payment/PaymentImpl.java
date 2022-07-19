package com.logicommerce.sdk.models.payment;

import com.logicommerce.sdk.enums.PaymentType;

/**
 * <p>PaymentImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentImpl extends PaymentAbstract implements Payment {

	private PaymentType type;

	private String redirectUri;

	/** {@inheritDoc} */
	@Override
	public PaymentType getType() {
		return type;
	}

	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.PaymentType} object
	 */
	public void setType(PaymentType type) {
		this.type = type;
	}

	/** {@inheritDoc} */
	@Override
	public String getRedirectUri() {
		return redirectUri;
	}

	/**
	 * <p>Setter for the field <code>redirectUri</code>.</p>
	 *
	 * @param redirectUri a {@link java.lang.String} object
	 */
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

}
