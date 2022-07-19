package com.logicommerce.sdk;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>Property class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface Property {

	/**
	 * <p>name.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String name() default "";

	/**
	 * <p>connector.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ConnectorType} object
	 */
	public ConnectorType connector() default ConnectorType.NONE;

}
