package com.logicommerce.sdk.models.product;

import com.logicommerce.sdk.enums.ContentType;

public interface AdditionalAttachment {

	ContentType getContentType();

	String getUrl();

	String getName();

}
