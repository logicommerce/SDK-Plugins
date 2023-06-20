package com.logicommerce.sdk.models.queues;

public class Validator {

	static final int MAX_KEY_LENGTH = 100;
	static final int MAX_VALUE_LENGTH = 250;
	static final String KEY_PATTERN = "^[a-zA-Z0-9_]+$";

	static final String ILLEGAL_NULL = "%s cannot be null";
	static final String ILLEGAL_EMPTY = "%s cannot be empty or blank";
	static final String ILLEGAL_LENGTH = "%s cannot be longer than %d characters";
	static final String ILLEGAL_KEY_PATTERN = "%s can only contain alphanumeric characters and underscores";
	static final String ILLEGAL_TYPE = "%s must be of type %s";

	private Validator() {}

	static void validateKey(String keyName, String keyValue) {
		validateNotNull(keyValue, keyValue);
		validateNotEmpty(keyName, keyValue);
		if (keyValue.length() > MAX_KEY_LENGTH) {
			raiseError(ILLEGAL_LENGTH, keyName, MAX_KEY_LENGTH);
		} else if (!keyValue.matches(KEY_PATTERN)) {
			raiseError(ILLEGAL_KEY_PATTERN, keyName);
		}
	}

	static void validateBooleanValue(String title, Object value) {
		validateNotNull(title, value);
		if (!(value instanceof Boolean)) {
			raiseError(ILLEGAL_TYPE, title, Boolean.class.getSimpleName());
		}
	}

	static void validateIntegerValue(String title, Object value) {
		validateNotNull(title, value);
		if (!(value instanceof Integer)) {
			raiseError(ILLEGAL_TYPE, title, Integer.class.getSimpleName());
		}
	}

	static void validateDoubleValue(String title, Object value) {
		validateNotNull(title, value);
		if (!(value instanceof Double)) {
			raiseError(ILLEGAL_TYPE, title, Double.class.getSimpleName());
		}
	}

	static void validateStringValue(String title, Object value) {
		validateNotNull(title, value);
		validateNotEmpty(title, value.toString());
		if (value.toString().length() > MAX_VALUE_LENGTH) {
			raiseError(ILLEGAL_LENGTH, title, MAX_VALUE_LENGTH);
		}
	}

	static void validateNotNull(String title, Object content) {
		if (content == null) {
			raiseError(ILLEGAL_NULL, title);
		}
	}

	static void validateNotEmpty(String title, String content) {
		if (content.isBlank()) {
			raiseError(ILLEGAL_EMPTY, title);
		}
	}

	static void raiseError(String message, Object... args) {
		if (args.length > 0) {
			throw new IllegalArgumentException(String.format(message, args));
		} else {
			throw new IllegalArgumentException(message);
		}
	}
	
}
