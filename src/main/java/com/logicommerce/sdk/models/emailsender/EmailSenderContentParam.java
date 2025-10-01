package com.logicommerce.sdk.models.emailsender;

import java.util.List;
import com.logicommerce.sdk.enums.EmailSenderMimeType;

/**
 * <p>EmailSenderContentParam interface.</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public interface EmailSenderContentParam {

	/**
	 * <p>get the Subject from the content email.</p>
	 * @return the subject
	 */
	String getSubject();

	/**
	 * <p>get the Body from the content email.</p>
	 * 
	 * @return the body
	 */
	String getBody();

	/**
	 * <p>
	 * getMimeType.
	 * </p>
	 * 
	 * @return the mime type
	 */
	EmailSenderMimeType getMimeType();

	/**
	 * <p>
	 * getAttachments.
	 * </p>
	 * 
	 * @return the list of attachments
	 */
	List<EmailSenderAttachmentParam> getAttachments();
}
