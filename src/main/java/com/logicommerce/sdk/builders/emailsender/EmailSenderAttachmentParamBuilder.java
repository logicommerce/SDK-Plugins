package com.logicommerce.sdk.builders.emailsender;

import com.logicommerce.sdk.models.emailsender.EmailSenderAttachmentParam;
import com.logicommerce.sdk.models.emailsender.implementations.EmailSenderAttachmentParamImpl;

/**
 * <p>EmailSenderAttachmentParamBuilder</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public class EmailSenderAttachmentParamBuilder<T> {

	private T parentBuilder;

	private String name;

	private String base64Content;

	/**
	 * <p>Constructor for EmailSenderAttachmentParamBuilder.</p>
	 */
	public EmailSenderAttachmentParamBuilder() {

	}

	/**
	 * <p>Constructor for EmailSenderAttachmentParamBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public EmailSenderAttachmentParamBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderAttachmentParamBuilder} object
	 */
	public EmailSenderAttachmentParamBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>base64Content.</p>
	 *
	 * @param base64Content a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderAttachmentParamBuilder} object
	 */
	public EmailSenderAttachmentParamBuilder<T> base64Content(String base64Content) {
		this.base64Content = base64Content;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.emailsender.EmailSenderAttachmentParam} object
	 */
	public EmailSenderAttachmentParam build() {
		EmailSenderAttachmentParamImpl emailSenderAttachmentParam = new EmailSenderAttachmentParamImpl();
		emailSenderAttachmentParam.setName(name);
		emailSenderAttachmentParam.setBase64Content(base64Content);
		return emailSenderAttachmentParam;
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
