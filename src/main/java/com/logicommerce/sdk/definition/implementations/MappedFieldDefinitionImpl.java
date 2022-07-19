package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.definition.MappedFieldDefinition;
import com.logicommerce.sdk.enums.MappedItemType;

/**
 * <p>MappedFieldDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class MappedFieldDefinitionImpl implements MappedFieldDefinition {

	private MappedItemType type;
	private List<String> fields;

	/** {@inheritDoc} */
	@Override
	public MappedItemType getType() {
		return type;
	}

	/** {@inheritDoc} */
	@Override
	public List<String> getFields() {
		return fields;
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
	 * <p>Setter for the field <code>fields</code>.</p>
	 *
	 * @param fields a {@link java.util.List} object
	 */
	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public static class Builder<T> {
		
		private T parentBuilder;
		private MappedItemType type;
		private List<String> fields;

		public Builder() {
			fields(null);
		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}
		
		public Builder<T> type(MappedItemType type) {
			this.type = type;
			return this;
		}
		
		public Builder<T> addField(String field) {
			this.fields.add(field);
			return this;
		}
		
		public Builder<T> fields(List<String> fields) {
			if (fields == null) {
				fields = new ArrayList<>();
			}
			this.fields = fields;
			return this;
		}
		
		public MappedFieldDefinition build() {
			MappedFieldDefinitionImpl mappedField = new MappedFieldDefinitionImpl();
			if (type == null) {
				throw new NullPointerException();
			}
			mappedField.setType(type);
			mappedField.setFields(fields);
			return mappedField;
		}

		public T done() {
			return parentBuilder;
		}
	}
}
