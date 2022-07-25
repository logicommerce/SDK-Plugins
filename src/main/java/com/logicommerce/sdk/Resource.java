package com.logicommerce.sdk;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * <p>Resource class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface Resource {

}
