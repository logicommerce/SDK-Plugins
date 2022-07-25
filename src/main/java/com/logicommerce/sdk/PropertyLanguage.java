package com.logicommerce.sdk;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>PropertyLanguage class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface PropertyLanguage {
	
	/**
	 * <p>name.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String name() default "";
	
	/**
	 * <p>lcModuleType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ConnectorType} object
	 */
	public ConnectorType lcModuleType() default ConnectorType.NONE;

	/**
	 * <p>type.</p>
	 *
	 * @return a {@link java.lang.Class} object
	 */
	public Class<?> type();

}
