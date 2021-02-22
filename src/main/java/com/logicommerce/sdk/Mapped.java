package com.logicommerce.sdk;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import com.logicommerce.sdk.enums.ConnectorType;
import com.logicommerce.sdk.enums.MappedItemType;

@Retention(RUNTIME)
@Target(FIELD)
public @interface Mapped {

	public MappedItemType value();
	
	public ConnectorType connector() default ConnectorType.NONE;

}
