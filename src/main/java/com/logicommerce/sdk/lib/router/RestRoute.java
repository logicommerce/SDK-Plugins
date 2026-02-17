package com.logicommerce.sdk.lib.router;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public record RestRoute(
	Method method,
	String httpMethod,
	String template,
	String[] segments,
	boolean[] isVar,
	String[] varNames,

	int segmentCount,
	int literalCount,
	int literalCharCount
) {
	public static RestRoute from(Method m, String httpMethod, String template) {
		String[] segments = splitSegments(template);
		boolean[] isVar = new boolean[segments.length];
		String[] varNames = new String[segments.length];

		int literalCount = 0;
		int literalCharCount = 0;

		for (int i = 0; i < segments.length; i++) {
			String s = segments[i];
			if (s.startsWith("{") && s.endsWith("}") && s.length() >= 3) {
				isVar[i] = true;
				varNames[i] = s.substring(1, s.length() - 1);
			} else {
				isVar[i] = false;
				varNames[i] = null;
				literalCount++;
				literalCharCount += s.length();
			}
		}

		return new RestRoute(
				m,
				httpMethod,
				template,
				segments,
				isVar,
				varNames,
				segments.length,
				literalCount,
				literalCharCount
		);
	}

	public Optional<Map<String, String>> match(String requestPath) {
		if (countSegments(requestPath) != segments.length) {
			return Optional.empty();
		}

		String[] reqSegs = splitSegments(requestPath);
		Map<String, String> out = new HashMap<>();
		for (int i = 0; i < segments.length; i++) {
			if (isVar[i]) {
				out.put(varNames[i], reqSegs[i]);
			} else if (!segments[i].equals(reqSegs[i])) {
				return Optional.empty();
			}
		}
		return Optional.of(out);
	}

	private static String[] splitSegments(String path) {
		return path.split("/");
	}

	private static long countSegments(String path) {
		return path.chars().filter(ch -> ch == '/').count() + 1;
	}

	public static final Comparator<RestRoute> SPECIFICITY =
		Comparator.comparingInt((RestRoute r) -> r.segmentCount).reversed()
				.thenComparing(Comparator.comparingInt((RestRoute r) -> r.literalCount).reversed())
				.thenComparing(Comparator.comparingInt((RestRoute r) -> r.literalCharCount).reversed())
				.thenComparing(Comparator.comparing((RestRoute r) -> r.template).reversed())
				.thenComparing(Comparator.comparing((RestRoute r) -> r.method.getName()));

}
