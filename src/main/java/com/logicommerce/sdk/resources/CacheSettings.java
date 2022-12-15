package com.logicommerce.sdk.resources;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Cache settings
 *
 * @author Logicommerce
 * @since 1.1.7
 *
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface CacheSettings {

	/**
	 * Name of cache. If it is not defined or empty, the name of cache will be the name of field.
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String name() default "";

	/**
	 * Duration of cache in seconds.
	 * @return a long
	 */
	public long duration() default 300;

}
