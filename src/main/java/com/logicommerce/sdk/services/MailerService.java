package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.emailsender.EmailSenderParam;

/**
 * <p>MailerService interface.</p>
 *
 * @author Logicommerce
 * @since 2.6.0
 */
public interface MailerService extends PluginService {
	
	void send(EmailSenderParam message) throws PluginServiceException;
	
}
