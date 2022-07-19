package com.logicommerce.sdk;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import com.logicommerce.sdk.enums.ConnectorType;
import com.logicommerce.sdk.enums.MappedItemType;

/**
 * <p>Mapped class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface Mapped {

	/**
	 * <p>value.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.MappedItemType} object
	 */
	public MappedItemType value();
	
	/**
	 * <p>connector.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ConnectorType} object
	 */
	public ConnectorType connector() default ConnectorType.NONE;

}
