package com.logicommerce.sdk.lib.router;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.UnaryOperator;
import com.logicommerce.sdk.lib.router.Annotations.Path;

/**
 * <p>RestRouteExtractor class is responsible for extracting REST routes from handler classes using reflection and caching the results for performance.</p>
 *
 * @author LogiCommerce
 * @since 2.7.2
 */
public class RestRouteExtractor {

	private static Map<Class<?>, List<RestRoute>> cache = new HashMap<>();

	private final UnaryOperator<String> pathNormalizer;

	public RestRouteExtractor(UnaryOperator<String> pathNormalizer) {
		this.pathNormalizer = pathNormalizer;
	}

	/** 
	 * <p>Extracts REST routes from the given handler class. Uses caching to improve performance on subsequent calls for the same class.</p>
	 * 
	 * @param handlerClass {@link Class} object representing the handler class to extract routes from
	 * @return List of RestRoute objects extracted from the handler class
	 */
	public List<RestRoute> getRoutes(Class<?> handlerClass) {
		if (cache.containsKey(handlerClass)) {
			return cache.get(handlerClass);
		}
		List<RestRoute> routes = collectRoutes(handlerClass);
		routes.sort(RestRoute.SPECIFICITY);
		cache.put(handlerClass, routes);
		return routes;
	}

	private List<RestRoute> collectRoutes(Class<?> handlerClass) {
		List<RestRoute> routes = new ArrayList<>();
		for (Method m : getAllDeclaredMethods(handlerClass)) {
			Optional<RestRoute> r = extractRoute(m);
			r.ifPresent(routes::add);
		}
		return routes;
	}

	private Optional<RestRoute> extractRoute(Method m) {
		Path path = m.getAnnotation(Path.class);
		if (path == null) {
			return Optional.empty();
		}
		String httpMethod = getHttpMethod(m);
		if (httpMethod == null) {
			return Optional.empty();
		}
		String template = pathNormalizer.apply(path.value());
		return Optional.of(RestRoute.from(m, httpMethod, template));
	}

	private static String getHttpMethod(Method m) {
		for (Class<? extends Annotation> annotationClass : Annotations.HTTP_METHOD_ANNOTATIONS) {
			if (m.getAnnotation(annotationClass) != null) {
				return annotationClass.getSimpleName();
			}
		}
		return null;
	}

	private static List<Method> getAllDeclaredMethods(Class<?> type) {
		List<Method> out = new ArrayList<>();
		Class<?> c = type;
		while (c != null && c != Object.class) {
			out.addAll(List.of(c.getDeclaredMethods()));
			c = c.getSuperclass();
		}
		return out;
	}
}
