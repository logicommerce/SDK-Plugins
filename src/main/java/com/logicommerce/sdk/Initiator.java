package com.logicommerce.sdk;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * <p>Initiator class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface Initiator {

}
