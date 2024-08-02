package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.definition.MappedFieldDefinition;
import com.logicommerce.sdk.definition.PropertyDefinitionValue;
import com.logicommerce.sdk.enums.MappedItemType;

/**
 * <p>MappedFieldDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class MappedFieldDefinitionImpl implements MappedFieldDefinition {

	private MappedItemType type;
	private List<PropertyDefinitionValue> values;

	/** {@inheritDoc} */
	@Override
	public MappedItemType getType() {
		return type;
	}

	/** {@inheritDoc} */
	@Override
	public List<PropertyDefinitionValue> getValues() {
		return values;
	}

	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.MappedItemType} object
	 */
	public void setType(MappedItemType type) {
		this.type = type;
	}

	/**
	 * <p>Setter for the field <code>newFields</code>.</p>
	 *
	 * @param values a {@link java.util.List} object
	 */
	public void setValues(List<PropertyDefinitionValue> values) {
		this.values = values;
	}

	public static class Builder<T> {
		
		private T parentBuilder;
		private MappedItemType type;
		private List<PropertyDefinitionValue> values;
		private List<PropertyDefinitionValueImpl.Builder<Builder<T>>> builderValues;

		public Builder() {
		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}
		
		public Builder<T> type(MappedItemType type) {
			this.type = type;
			return this;
		}

		public Builder<T> addValue(PropertyDefinitionValue value) {
			this.values.add(value);
			return this;
		}

		public PropertyDefinitionValueImpl.Builder<Builder<T>> value() {
			if (builderValues == null) {
				builderValues = new ArrayList<>();
			}
			var value = new PropertyDefinitionValueImpl.Builder<>(this);
			this.builderValues.add(value);
			return value;
		}
		
		public MappedFieldDefinition build() {
			MappedFieldDefinitionImpl mappedField = new MappedFieldDefinitionImpl();
			if (type == null) {
				throw new NullPointerException();
			}
			mappedField.setType(type);
			if (builderValues != null) {
				values = new ArrayList<>();
				for (var builder : builderValues) {
					values.add(builder.build());
				}
			}
			mappedField.setValues(values);
			return mappedField;
		}

		public T done() {
			return parentBuilder;
		}
	}
}
