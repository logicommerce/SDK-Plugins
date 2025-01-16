package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.PropertyDefinitionValue;

/**
 * <p>PropertyDefinitionValueImpl class.</p>
 *
 * @author LogiCommerce
 * @since 2.3.0
 */
public class PropertyDefinitionValueImpl extends DefinitionValueImpl implements PropertyDefinitionValue {

	public static class Builder<T> extends DefinitionValueImpl.Builder<T, PropertyDefinitionValue, PropertyDefinitionValueImpl> {

		public Builder(T parentBuilder) {
			super(parentBuilder);
		}

		@Override
		public PropertyDefinitionValue build() {
			PropertyDefinitionValueImpl definitionValue = new PropertyDefinitionValueImpl();
			setAttributes(definitionValue);
			return definitionValue;
		}

	}
}
