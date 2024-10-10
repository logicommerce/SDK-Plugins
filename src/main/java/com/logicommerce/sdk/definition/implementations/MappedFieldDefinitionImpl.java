package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.MappedFieldDefinition;
import com.logicommerce.sdk.enums.MappedItemType;

/**
 * MappedFieldDefinition Implementation class.
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class MappedFieldDefinitionImpl implements MappedFieldDefinition {

	private MappedItemType type;
	private List<String> fields;
	private DefinitionLanguages summary;

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

	/** {@inheritDoc} */
	@Override
	public DefinitionLanguages getSummary() {
		return summary;
	}

	/**
	 * Defines the type of the mapped field.
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.MappedItemType} object
	 */
	public void setType(MappedItemType type) {
		this.type = type;
	}

	/**
	 * Set the list of fields.
	 *
	 * @param fields a {@link java.util.List} object
	 */
	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	/** 
	 * Set the summary of the mapped field.
	 */
	public void setSummary(DefinitionLanguages summary) {
		this.summary = summary;
	}

	/**
	 * MappedFieldDefinition Builder class.
	 */
	public static class Builder<T> {
		
		private T parentBuilder;
		private MappedItemType type;
		private List<String> fields;
		private DefinitionLanguagesImpl.Builder<Builder<T>> summary;

		public Builder() {
			summary = new DefinitionLanguagesImpl.Builder<>(this);
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
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(field);
			return this;
		}

		public DefinitionLanguagesImpl.Builder<Builder<T>> summary() {
			return summary;
		}
		
		public MappedFieldDefinition build() {
			MappedFieldDefinitionImpl mappedField = new MappedFieldDefinitionImpl();
			if (type == null) {
				throw new NullPointerException();
			}
			mappedField.setType(type);
			mappedField.setFields(fields);
			mappedField.setSummary(summary.build());
			return mappedField;
		}

		public T done() {
			return parentBuilder;
		}
	}
}
