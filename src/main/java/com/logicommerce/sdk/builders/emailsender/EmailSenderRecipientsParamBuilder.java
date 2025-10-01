package com.logicommerce.sdk.builders.emailsender;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.emailsender.EmailSenderRecipientsParam;
import com.logicommerce.sdk.models.emailsender.implementations.EmailSenderRecipientsParamImpl;

/**
 * <p>EmailSenderRecipientsParamBuilder</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public class EmailSenderRecipientsParamBuilder<T> {

	private T parentBuilder;

	private List<EmailSenderEmailParamBuilder<EmailSenderRecipientsParamBuilder<T>>> toList;
	
	private List<EmailSenderEmailParamBuilder<EmailSenderRecipientsParamBuilder<T>>> ccList;
	
	private List<EmailSenderEmailParamBuilder<EmailSenderRecipientsParamBuilder<T>>> bccList;

	/**
	 * <p>Constructor for EmailSenderRecipientsParamBuilder.</p>
	 */
	public EmailSenderRecipientsParamBuilder() {
		toList = new ArrayList<>();
		ccList = new ArrayList<>();
		bccList = new ArrayList<>();
	}

	/**
	 * <p>Constructor for EmailSenderRecipientsParamBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public EmailSenderRecipientsParamBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>to.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderEmailParamBuilder} object
	 */
	public EmailSenderEmailParamBuilder<EmailSenderRecipientsParamBuilder<T>> to() {
		EmailSenderEmailParamBuilder<EmailSenderRecipientsParamBuilder<T>> to = new EmailSenderEmailParamBuilder<>(this);
		toList.add(to);
		return to;
	}

	/**
	 * <p>cc.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderEmailParamBuilder} object
	 */
	public EmailSenderEmailParamBuilder<EmailSenderRecipientsParamBuilder<T>> cc() {
		EmailSenderEmailParamBuilder<EmailSenderRecipientsParamBuilder<T>> cc = new EmailSenderEmailParamBuilder<>(this);
		ccList.add(cc);
		return cc;
	}

	/**
	 * <p>bcc.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.emailsender.EmailSenderEmailParamBuilder} object
	 */
	public EmailSenderEmailParamBuilder<EmailSenderRecipientsParamBuilder<T>> bcc() {
		EmailSenderEmailParamBuilder<EmailSenderRecipientsParamBuilder<T>> bcc = new EmailSenderEmailParamBuilder<>(this);
		bccList.add(bcc);
		return bcc;
	}

	public EmailSenderRecipientsParam build() {
		EmailSenderRecipientsParamImpl emailSenderRecipientsParam = new EmailSenderRecipientsParamImpl();
		emailSenderRecipientsParam.setTo(toList.stream()
				.map(EmailSenderEmailParamBuilder::build).collect(Collectors.toList()));
		emailSenderRecipientsParam.setCc(ccList.stream()
				.map(EmailSenderEmailParamBuilder::build).collect(Collectors.toList()));
		emailSenderRecipientsParam.setBcc(bccList.stream()
				.map(EmailSenderEmailParamBuilder::build).collect(Collectors.toList()));		
		return emailSenderRecipientsParam;
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
