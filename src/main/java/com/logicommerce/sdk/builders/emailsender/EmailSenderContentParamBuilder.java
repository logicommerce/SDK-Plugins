package com.logicommerce.sdk.builders.emailsender;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.enums.EmailSenderMimeType;
import com.logicommerce.sdk.models.emailsender.EmailSenderContentParam;
import com.logicommerce.sdk.models.emailsender.implementations.EmailSenderContentParamImpl;

/**
 * <p>EmailSenderContentParamBuilder</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public class EmailSenderContentParamBuilder<T> {

	private T parentBuilder;

	private String subject;

	private String body;

	private EmailSenderMimeType mimeType;

	private List<EmailSenderAttachmentParamBuilder<EmailSenderContentParamBuilder<T>>> attachmentsList;

	/**
	 * <p>Constructor for EmailSenderContentParamBuilder.</p>
	 */
	public EmailSenderContentParamBuilder() {
		this.mimeType = EmailSenderMimeType.TEXT_HTML;
		this.attachmentsList = new ArrayList<>();
	}

	/**
	 * <p>Constructor for EmailSenderContentParamBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public EmailSenderContentParamBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>subject.</p>
	 *
	 * @param subject a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderContentParamBuilder} object
	 */
	public EmailSenderContentParamBuilder<T> subject(String subject) {
		this.subject = subject;
		return this;
	}

	/**
	 * <p>body.</p>
	 *
	 * @param body a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderContentParamBuilder} object
	 */
	public EmailSenderContentParamBuilder<T> body(String body) {
		this.body = body;
		return this;
	}

	/**
	 * <p>
	 * mimeType.
	 * </p>
	 *
	 * @param mimeType a {@link com.logicommerce.sdk.enums.EmailSenderMimeType} object
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderContentParamBuilder} object
	 */
	public EmailSenderContentParamBuilder<T> mimeType(EmailSenderMimeType mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	/**
	 * <p>attachments.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderEmailParamBuilder} object
	 */
	public EmailSenderAttachmentParamBuilder<EmailSenderContentParamBuilder<T>> attachment() {
		EmailSenderAttachmentParamBuilder<EmailSenderContentParamBuilder<T>> attachment = new EmailSenderAttachmentParamBuilder<>(this);
		attachmentsList.add(attachment);
		return attachment;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.emailsender.EmailSenderContentParam} object
	 */
	public EmailSenderContentParam build() {
		EmailSenderContentParamImpl emailSenderContentParam = new EmailSenderContentParamImpl();
		emailSenderContentParam.setSubject(subject);
		emailSenderContentParam.setBody(body);
		emailSenderContentParam.setMimeType(mimeType);
		emailSenderContentParam.setAttachments(attachmentsList.stream()
				.map(EmailSenderAttachmentParamBuilder::build).collect(Collectors.toList()));		
		return emailSenderContentParam;
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
