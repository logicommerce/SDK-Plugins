package com.logicommerce.sdk.models.product;

import com.logicommerce.sdk.enums.ContentType;

public class AdditionalAttachmentImpl implements AdditionalAttachment {

	private ContentType contentType;

	private String url;

	private String name;

	@Override
	public ContentType getContentType() {
		return contentType;
	}

	@Override
	public String getUrl() {
		return url;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setName(String name) {
		this.name = name;
	}
}
