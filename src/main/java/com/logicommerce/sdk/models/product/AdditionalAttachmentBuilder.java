package com.logicommerce.sdk.models.product;

import com.logicommerce.sdk.enums.ContentType;

/**
 * AdditionalAttachment model builder.
 *
 * @author LogiCommerce
 * @see AdditionalAttachment
 * @param <T> parent builder type
 * @since 2.8.2
 */
public class AdditionalAttachmentBuilder<T> {

	private T parentBuilder;

	private ContentType contentType;

	private String url;

	private String name;

	/**
	 * <p>Constructor for AdditionalAttachmentBuilder.</p>
	 */
	public AdditionalAttachmentBuilder() {
	}

	/**
	 * <p>Constructor for AdditionalAttachmentBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public AdditionalAttachmentBuilder(T parentBuilder) {
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the content type of the additional attachment.
	 *
	 * @param contentType a {@link com.logicommerce.sdk.enums.ContentType} object
	 * @return a {@link AdditionalAttachmentBuilder} object
	 */
	public AdditionalAttachmentBuilder<T> contentType(ContentType contentType) {
		this.contentType = contentType;
		return this;
	}

	/**
	 * Sets the url of the additional attachment.
	 *
	 * @param url a {@link java.lang.String} object
	 * @return a {@link AdditionalAttachmentBuilder} object
	 */
	public AdditionalAttachmentBuilder<T> url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Sets the name of the additional attachment.
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link AdditionalAttachmentBuilder} object
	 */
	public AdditionalAttachmentBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Builds a {@link AdditionalAttachmentImpl} object.
	 *
	 * @return a {@link AdditionalAttachment} object
	 */
	public AdditionalAttachment build() {
		AdditionalAttachmentImpl additionalAttachment = new AdditionalAttachmentImpl();
		additionalAttachment.setContentType(contentType);
		additionalAttachment.setUrl(url);
		additionalAttachment.setName(name);
		return additionalAttachment;
	}

	/**
	 * Returns the parent builder.
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
