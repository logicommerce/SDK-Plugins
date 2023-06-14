package com.logicommerce.sdk.resources;

import com.logicommerce.utilities.JsonConverterException;
import com.logicommerce.utilities.JsonMapper;

public class ResponseParser<T> {

	private ResponseParser() {}

	public static <T> T parse(int statusCode, String body, Class<T> type) throws ResponseException {
		if (statusCode > 399) {
			throw new ResponseException(body);
		}
		if (body == null || body.isBlank()) {
			return null;
		}
		JsonMapper<T> jsonMapper = new JsonMapper<>(type);
		try {
			return jsonMapper.fromJson(body);
		} catch (JsonConverterException e) {
			throw new ResponseException(body, e);
		}
	}

}
