package com.logicommerce.sdk.models.emailsender.implementations;

import com.logicommerce.sdk.models.emailsender.EmailSenderEmailParam;

/**
 * <p>EmailSenderEmailParamImpl.</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public class EmailSenderEmailParamImpl implements EmailSenderEmailParam {

	private String name;

	private String email;

	public EmailSenderEmailParamImpl() {
	}

	public EmailSenderEmailParamImpl(String email) {
		this.email = email;
	}

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return name;
	}

	/** {@inheritDoc} */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * setter for field name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * setter for field email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
