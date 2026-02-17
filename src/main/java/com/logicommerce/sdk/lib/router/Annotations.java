package com.logicommerce.sdk.lib.router;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

@SuppressWarnings("checkstyle:AbbreviationAsWordInNameCheck")
public interface Annotations {

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.METHOD})
	public static @interface Path {
		String value();
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.PARAMETER})
	public static @interface PathParam {
		String value();
	}

	public static List<Class<? extends Annotation>> HTTP_METHOD_ANNOTATIONS = List.of(
		GET.class, POST.class, PUT.class, DELETE.class, PATCH.class, HEAD.class, OPTIONS.class
	);

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.METHOD})
	public static @interface GET {}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.METHOD})
	public static @interface POST {}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.METHOD})
	public static @interface PUT {}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.METHOD})
	public static @interface DELETE {}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.METHOD})
	public static @interface PATCH {}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.METHOD})
	public static @interface HEAD {}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.METHOD})
	public static @interface OPTIONS {}

}
