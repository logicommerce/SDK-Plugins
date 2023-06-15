package com.logicommerce.sdk.resources;

import com.logicommerce.utilities.JsonConverterException;
import com.logicommerce.utilities.JsonMapper;

public class ResponseException extends Exception {

	private static final long serialVersionUID = 1L;

	public ResponseException(String message) {
		super(message);
	}

	public ResponseException(String message, Exception e) {
		super(message, e);
	}

	public <T> T getError(Class<T> type) throws JsonConverterException {
		String body = getMessage();
		if (body == null || body.isBlank()) {
			return null;
		}
		JsonMapper<T> jsonMapper = new JsonMapper<>(type);
		return jsonMapper.fromJson(body);
	}

}
