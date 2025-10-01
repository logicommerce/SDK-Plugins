package com.logicommerce.sdk.models.emailsender;

/**
 * <p>EmailSenderParam interface.</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public interface EmailSenderParam {

	/**
	 * Gets the EmailSenderEmailParam object representing the From email.
	 *
	 * @return the EmailSenderEmailParam object representing the From email.
	 */
	EmailSenderEmailParam getFromEmail();

	/**
	 * Gets the EmailSenderRecipientsParam object representing the Recipients.
	 *
	 * @return the EmailSenderRecipientsParam object representing the Recipients.
	 */
	EmailSenderRecipientsParam getRecipients();

	/**
	 * Gets the EmailSenderContentParam object representing the Content.
	 *
	 * @return the EmailSenderContentParam object representing the Content.
	 */
	EmailSenderContentParam getContent();
}
