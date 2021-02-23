package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.SdkException;

public class PluginDefinitionException extends SdkException {

	private static final long serialVersionUID = 1L;

	public PluginDefinitionException(Class<?> clazz, String message) {
		super(clazz, message);
	}

}
