package com.logicommerce.sdk.models.emailsender;

import java.util.List;

/**
 * <p>EmailSenderRecipientsParam interface.</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public interface EmailSenderRecipientsParam {

	/**
	 * Gets a {@link java.util.List} with EmailSenderEmailParam object representing the TO email list.
	 *
	 * @return a {@link java.util.List} with EmailSenderEmailParam object representing the TO email list.
	 */
	List<EmailSenderEmailParam> getTo();

	/**
	 * Gets a {@link java.util.List} with EmailSenderEmailParam object representing the CC email list.
	 * @return a {@link java.util.List} with EmailSenderEmailParam object representing the CC email list.
	 */
	List<EmailSenderEmailParam> getCc();

	/**
	 * Gets a {@link java.util.List} with EmailSenderEmailParam object representing the BCC email list.
	 * 
	 * @return a {@link java.util.List} with EmailSenderEmailParam object representing the BCC email list.
	 */
	List<EmailSenderEmailParam> getBcc();
}
