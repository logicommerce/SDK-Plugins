package com.logicommerce.sdk.models.emailsender.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.emailsender.EmailSenderEmailParam;
import com.logicommerce.sdk.models.emailsender.EmailSenderRecipientsParam;

/**
 * <p>EmailSenderRecipientsParam class.</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public class EmailSenderRecipientsParamImpl implements EmailSenderRecipientsParam {

	private List<EmailSenderEmailParam> to;

	private List<EmailSenderEmailParam> cc;

	private List<EmailSenderEmailParam> bcc;

	public EmailSenderRecipientsParamImpl() {
		to = new ArrayList<>();
		cc = new ArrayList<>();
		bcc = new ArrayList<>();
	}

	/** {@inheritDoc} */
	@Override
	public List<EmailSenderEmailParam> getTo() {
		return to;
	}

	/** {@inheritDoc} */
	@Override
	public List<EmailSenderEmailParam> getCc() {
		return cc;
	}

	/** {@inheritDoc} */
	@Override
	public List<EmailSenderEmailParam> getBcc() {
		return bcc;
	}

	public void setTo(List<EmailSenderEmailParam> to) {
		this.to = to;
	}

	public void addTo(EmailSenderEmailParam email) {
		to.add(email);
	}

	public void addTo(String email) {
		to.add(new EmailSenderEmailParamImpl(email));
	}

	public void setCc(List<EmailSenderEmailParam> cc) {
		this.cc = cc;
	}

	public void addCc(String email) {
		cc.add(new EmailSenderEmailParamImpl(email));
	}

	public void setBcc(List<EmailSenderEmailParam> bcc) {
		this.bcc = bcc;
	}

	public void addBcc(String email) {
		bcc.add(new EmailSenderEmailParamImpl(email));
	}
}
