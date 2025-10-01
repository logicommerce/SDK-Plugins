package com.logicommerce.sdk.models.emailsender.implementations;

import com.logicommerce.sdk.models.emailsender.EmailSenderAttachmentParam;

/**
 * <p>EmailSenderAttachmentParamImpl</p>
 *
 * @author LogiCommerce
 * @since 2.6.0
 */
public class EmailSenderAttachmentParamImpl implements EmailSenderAttachmentParam {

	private String name;

	private String base64Content;

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return name;
	}

	/** {@inheritDoc} */
	@Override
	public String getBase64Content() {
		return base64Content;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBase64Content(String base64Content) {
		this.base64Content = base64Content;
	}
}
