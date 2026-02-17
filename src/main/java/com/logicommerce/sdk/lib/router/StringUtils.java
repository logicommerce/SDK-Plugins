package com.logicommerce.sdk.lib.router;

public interface StringUtils {
	static String trimStart(String s, String prefix) {
		if (s.startsWith(prefix)) {
			return s.substring(prefix.length());
		}
		return s;
	}

	static String trimEnd(String s, String suffix) {
		if (s.endsWith(suffix)) {
			return s.substring(0, s.length() - suffix.length());
		}
		return s;
	}

	static Object convertTo(String s, Class<?> targetType) throws RouterClientException {
		try {
			if (targetType == String.class) {
				return s;
			} else if (targetType == int.class || targetType == Integer.class) {
				return Integer.parseInt(s);
			} else if (targetType == long.class || targetType == Long.class) {
				return Long.parseLong(s);
			} else if (targetType == boolean.class || targetType == Boolean.class) {
				return Boolean.parseBoolean(s);
			}
			throw new IllegalArgumentException("Unsupported target type: " + targetType);
		} catch (NumberFormatException e) {
			throw new RouterClientException(400, "Expected type %s but got value '%s'".formatted(targetType.getSimpleName(), s));
		}
	}
}
