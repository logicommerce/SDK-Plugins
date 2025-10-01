package com.logicommerce.sdk.models.emailsender.implementations;

import com.logicommerce.sdk.models.emailsender.EmailSenderContentParam;
import com.logicommerce.sdk.models.emailsender.EmailSenderEmailParam;
import com.logicommerce.sdk.models.emailsender.EmailSenderParam;
import com.logicommerce.sdk.models.emailsender.EmailSenderRecipientsParam;

/**
 * <p>EmailSenderParamImpl class.</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public class EmailSenderParamImpl implements EmailSenderParam {

	private EmailSenderEmailParam fromEmail;

	private EmailSenderRecipientsParam recipients;

	private EmailSenderContentParam content;

	/** {@inheritDoc} */
	@Override
	public EmailSenderEmailParam getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(EmailSenderEmailParam fromEmail) {
		this.fromEmail = fromEmail;
	}

	/** {@inheritDoc} */
	@Override
	public EmailSenderRecipientsParam getRecipients() {
		return recipients;
	}

	public void setRecipients(EmailSenderRecipientsParam recipients) {
		this.recipients = recipients;
	}

	/** {@inheritDoc} */
	@Override
	public EmailSenderContentParam getContent() {
		return content;
	}

	public void setContent(EmailSenderContentParam content) {
		this.content = content;
	}

}
