package com.logicommerce.sdk.models.emailsender.implementations;

import java.util.List;
import com.logicommerce.sdk.enums.EmailSenderMimeType;
import com.logicommerce.sdk.models.emailsender.EmailSenderAttachmentParam;
import com.logicommerce.sdk.models.emailsender.EmailSenderContentParam;

/**
 * <p>EmailSenderContentParamImpl</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public class EmailSenderContentParamImpl implements EmailSenderContentParam {

	private String subject;

	private String body;

	private EmailSenderMimeType mimeType;

	private List<EmailSenderAttachmentParam> attachments;

	/** {@inheritDoc} */
	@Override
	public String getSubject() {
		return subject;
	}

	/** {@inheritDoc} */
	@Override
	public String getBody() {
		return body;
	}

	/** {@inheritDoc} */
	@Override
	public EmailSenderMimeType getMimeType() {
		if (mimeType == null) {
			return EmailSenderMimeType.TEXT_HTML;
		}
		return mimeType;
	}

	/** {@inheritDoc} */
	@Override
	public List<EmailSenderAttachmentParam> getAttachments() {
		return attachments;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setMimeType(EmailSenderMimeType mimeType) {
		this.mimeType = mimeType;
	}

	public void setAttachments(List<EmailSenderAttachmentParam> attachments) {
		this.attachments = attachments;
	}
}
