package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.MappedFieldDefinitionValue;

/**
 * <p>MappedFieldDefinitionValueImpl class.</p>
 *
 * @author LogiCommerce
 * @since 2.3.0
 */
public class MappedFieldDefinitionValueImpl extends DefinitionValueImpl implements MappedFieldDefinitionValue {

	public static class Builder<T>
		extends DefinitionValueImpl.Builder<T, MappedFieldDefinitionValue, MappedFieldDefinitionValueImpl, Builder<T>> {

		public Builder(T parentBuilder) {
			super(parentBuilder);
		}

		@Override
		public MappedFieldDefinitionValue build() {
			MappedFieldDefinitionValueImpl definitionValue = new MappedFieldDefinitionValueImpl();
			setAttributes(definitionValue);
			return definitionValue;
		}

		@Override
		public Builder<T> returnThis() {
			return this;
		}
	}
}
