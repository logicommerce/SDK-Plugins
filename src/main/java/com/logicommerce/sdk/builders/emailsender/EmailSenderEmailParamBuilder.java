package com.logicommerce.sdk.builders.emailsender;

import com.logicommerce.sdk.models.emailsender.EmailSenderEmailParam;
import com.logicommerce.sdk.models.emailsender.implementations.EmailSenderEmailParamImpl;

/**
 * <p>EmailSenderEmailParamBuilder</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public class EmailSenderEmailParamBuilder<T> {

	private T parentBuilder;

	private String name;

	private String email;

	/**
	 * <p>Constructor for EmailSenderEmailParamBuilder.</p>
	 */
	public EmailSenderEmailParamBuilder() {

	}

	/**
	 * <p>Constructor for EmailSenderEmailParamBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public EmailSenderEmailParamBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderEmailParamBuilder} object
	 */
	public EmailSenderEmailParamBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>email.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderEmailParamBuilder} object
	 */
	public EmailSenderEmailParamBuilder<T> email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.emailsender.EmailSenderEmailParam} object
	 */
	public EmailSenderEmailParam build() {
		EmailSenderEmailParamImpl emailSenderEmailParam = new EmailSenderEmailParamImpl();
		emailSenderEmailParam.setName(name);
		emailSenderEmailParam.setEmail(email);
		return emailSenderEmailParam;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
