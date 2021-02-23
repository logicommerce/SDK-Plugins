package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.definition.MappedFieldDefinition;
import com.logicommerce.sdk.enums.MappedItemType;

public class MappedFieldDefinitionImpl implements MappedFieldDefinition {

	private MappedItemType type;
	private List<String> fields;

	@Override
	public MappedItemType getType() {
		return type;
	}

	@Override
	public List<String> getFields() {
		return fields;
	}

	public void setType(MappedItemType type) {
		this.type = type;
	}

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
