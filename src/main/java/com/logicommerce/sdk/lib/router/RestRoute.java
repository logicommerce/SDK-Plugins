package com.logicommerce.sdk.lib.router;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * <p>RestRoute record represents a REST route with its associated metadata and matching logic.</p>
 *
 * @author LogiCommerce
 * @since 2.7.2
 */
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
	/**
	 * <p>Factory method to create a RestRoute instance from a Method, HTTP method, and path template.</p>
	 * 
	 * @param m The method to be invoked for this route
	 * @param httpMethod The HTTP method (e.g., GET, POST) associated with this route
	 * @param template The path template (e.g., "/users/{id}") for this route
	 * @return A RestRoute instance representing the given method, HTTP method, and path template
	 */
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

	/**
	 * Matches the given request path against this route's template. If the path matches, returns an Optional containing a map of variable names to their corresponding values from the request path. If the path does not match, returns an empty Optional.
	 * @param requestPath
	 * @return
	 */
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

	/** 
	 * Comparator to sort RestRoute instances by specificity. Routes with more segments are considered more specific. If two routes have the same number of segments, the one with more literal segments is considered more specific. If they also have the same number of literal segments, the one with more literal characters is considered more specific. If they are still tied, the one with the lexicographically smaller template is considered more specific. Finally, if all else is equal, the one with the lexicographically smaller HTTP method name is considered more specific.
	 */
	public static final Comparator<RestRoute> SPECIFICITY =
		Comparator.comparingInt((RestRoute r) -> r.segmentCount).reversed()
				.thenComparing(Comparator.comparingInt((RestRoute r) -> r.literalCount).reversed())
				.thenComparing(Comparator.comparingInt((RestRoute r) -> r.literalCharCount).reversed())
				.thenComparing(Comparator.comparing((RestRoute r) -> r.template).reversed())
				.thenComparing(Comparator.comparing((RestRoute r) -> r.method.getName()));

}
