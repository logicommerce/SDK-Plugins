package com.logicommerce.sdk.builders.emailsender;

import com.logicommerce.sdk.models.emailsender.EmailSenderParam;
import com.logicommerce.sdk.models.emailsender.implementations.EmailSenderParamImpl;

/**
 * <p>EmailSenderParamBuilder</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public class EmailSenderParamBuilder {

	private EmailSenderEmailParamBuilder<EmailSenderParamBuilder> fromEmail;

	private EmailSenderRecipientsParamBuilder<EmailSenderParamBuilder> recipients;

	private EmailSenderContentParamBuilder<EmailSenderParamBuilder> content;

	public EmailSenderParamBuilder() {
		this.fromEmail = new EmailSenderEmailParamBuilder<>(this);
		this.recipients = new EmailSenderRecipientsParamBuilder<>(this);
		this.content = new EmailSenderContentParamBuilder<>(this);
	}

	/**
	 * <p>
	 * fromEmail.
	 * </p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderEmailParamBuilder} object
	 */
	public EmailSenderEmailParamBuilder<EmailSenderParamBuilder> fromEmail() {
		return fromEmail;
	}

	/**
	 * <p>
	 * recipients.
	 * </p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderRecipientsParamBuilder} object
	 */
	public EmailSenderRecipientsParamBuilder<EmailSenderParamBuilder> recipients() {
		return recipients;
	}

	/**
	 * <p>
	 * content.
	 * </p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderContentParamBuilder} object
	 */
	public EmailSenderContentParamBuilder<EmailSenderParamBuilder> content() {
		return content;
	}

	/**
	 * <p>
	 * build.
	 * </p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.emailsender.EmailSenderParam} object
	 */
	public EmailSenderParam build() {
		EmailSenderParamImpl emailSenderParam = new EmailSenderParamImpl();
		emailSenderParam.setFromEmail(fromEmail.build());
		emailSenderParam.setRecipients(recipients.build());
		emailSenderParam.setContent(content.build());
		return emailSenderParam;
	}

}
