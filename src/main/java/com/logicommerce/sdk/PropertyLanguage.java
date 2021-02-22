package com.logicommerce.sdk;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import com.logicommerce.sdk.enums.ConnectorType;

@Retention(RUNTIME)
@Target(FIELD)
public @interface PropertyLanguage {
	
	public String name() default "";
	
	public ConnectorType lcModuleType() default ConnectorType.NONE;

	public Class<?> type();

}
