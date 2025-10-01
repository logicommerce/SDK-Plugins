package com.logicommerce.sdk.models.emailsender;

/**
 * <p>EmailSenderAttachmentParam interface.</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public interface EmailSenderAttachmentParam {

	/**
	 * <p>Get name value of attachment.</p>
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * <p>
	 * get Base64Content of attachment.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object
	 */
	String getBase64Content();

}
