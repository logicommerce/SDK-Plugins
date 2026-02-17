package com.logicommerce.sdk.lib.router;

/**
 * <p>StringUtils interface provides utility methods for string manipulation and type conversion.</p>
 *
 * @author LogiCommerce
 * @since 2.7.2
 */
public interface StringUtils {
	/** 
	 * Trims the specified prefix from the start of the string if it exists.
	 * @param s the string to trim
	 * @param prefix the prefix to remove
	 * @return
	 */
	static String trimStart(String s, String prefix) {
		if (s.startsWith(prefix)) {
			return s.substring(prefix.length());
		}
		return s;
	}

	/**
	 * Trims the specified suffix from the end of the string if it exists.
	 * 
	 * @param s the string to trim
	 * @param suffix the suffix to remove
	 * @return the trimmed string
	 */
	static String trimEnd(String s, String suffix) {
		if (s.endsWith(suffix)) {
			return s.substring(0, s.length() - suffix.length());
		}
		return s;
	}

	/**
	 * Converts the string to the specified target type.
	 * Types supported are: String, int/Integer, long/Long, boolean/Boolean.
	 * 
	 * @param s the string to convert
	 * @param targetType the target type class
	 * @return the converted object
	 * @throws RouterClientException if the conversion fails due to an invalid format
	 */
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
