package com.logicommerce.sdk.lib.router;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import com.logicommerce.sdk.lib.router.Annotations.PathParam;

/**
 * <p>RestRouter class is responsible for routing HTTP requests to the appropriate handler methods based on annotations and request paths.</p>
 *
 * @author LogiCommerce
 * @since 2.7.2
 */
public class RestRouter<T> {

	private final Object handler;

	private static final RestRouteExtractor routeExtractor = new RestRouteExtractor(RestRouter::normalizePath);

	public RestRouter(Object handler) {
		this.handler = handler;
	}

	public T route(String httpMethod, String requestPath, String body) throws RouterClientException, InvocationTargetException {
		requestPath = normalizePath(requestPath);
		Set<String> allowedMethods = new HashSet<>();
		for (RestRoute r : routeExtractor.getRoutes(handler.getClass())) {
			Optional<Map<String, String>> pathParams = r.match(requestPath);
			if (pathParams.isEmpty()) {
				continue;
			}
			if (r.httpMethod().equals(httpMethod)) {
				return invokeMethod(r, pathParams.get(), body);
			} else {
				allowedMethods.add(r.httpMethod());
			}
		}
		if (!allowedMethods.isEmpty()) {
			throw new RouterClientException(405, "Method not allowed. Allowed methods: " + String.join(", ", allowedMethods));
		}
		throw new RouterClientException(404, "No route found for path: " + requestPath);
	}

	@SuppressWarnings("unchecked")
	private T invokeMethod(
		RestRoute route,
		Map<String, String> pathParams,
		String body
	) throws InvocationTargetException, RouterClientException {
		Object[] args = buildInvocationArgs(route.method(), pathParams, body);
		try {
			route.method().setAccessible(true);
			Object out = route.method().invoke(handler, args);
			return (T) out;
		} catch (IllegalAccessException | IllegalArgumentException e) {
			throw new RuntimeException("Failed to invoke route method", e);
		}
	}

	private static String normalizePath(String path) {
		if (path == null) {
			return "";
		}
		path = path.trim();

		int q = path.indexOf('?');
		if (q >= 0) {
			path = path.substring(0, q);
		}

		path = StringUtils.trimStart(path, "/");
		path = StringUtils.trimEnd(path, "/");
		return path;
	}

	private static Object[] buildInvocationArgs(Method method, Map<String, String> pathParams, String body) throws RouterClientException {
		Parameter[] params = method.getParameters();
		Object[] args = new Object[params.length];

		for (int i = 0; i < params.length; i++) {
			Parameter p = params[i];

			PathParam pathParam = p.getAnnotation(PathParam.class);
			if (pathParam != null) {
				String raw = pathParams.get(pathParam.value());
				args[i] = StringUtils.convertTo(raw, p.getType());
			} else {
				args[i] = body;
			}
		}
		return args;
	}
}
