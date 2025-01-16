package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.MappedFieldDefinition;
import com.logicommerce.sdk.definition.MappedFieldDefinitionValue;
import com.logicommerce.sdk.enums.MappedItemType;

/**
 * MappedFieldDefinition Implementation class.
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class MappedFieldDefinitionImpl implements MappedFieldDefinition {

	private MappedItemType type;
	@Deprecated(since = "2.3.0", forRemoval = true)
	private List<String> fields;
	private List<MappedFieldDefinitionValue> newFields;
	private DefinitionLanguages summary;
	private DefinitionLanguages title;

	/** {@inheritDoc} */
	@Override
	public MappedItemType getType() {
		return type;
	}

	/** {@inheritDoc} */
	@Override
	@Deprecated(since = "2.3.0", forRemoval = true)
	public List<String> getFields() {
		return fields;
	}

	/** {@inheritDoc} */
	@Override
	public List<MappedFieldDefinitionValue> getNewFields() {
		return newFields;
	}

	/** {@inheritDoc} */
	@Override
	public DefinitionLanguages getSummary() {
		return summary;
	}

	/** {@inheritDoc} */
	@Override
	public DefinitionLanguages getTitle() {
		return title;
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
	@Deprecated(since = "2.3.0", forRemoval = true)
	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	/**
	 * Set the list of fields.
	 *
	 * @param fields a {@link java.util.List} object
	 */
	public void setNewFields(List<MappedFieldDefinitionValue> fields) {
		this.newFields = fields;
	}

	/** 
	 * Set the summary of the mapped field.
	 */
	public void setSummary(DefinitionLanguages summary) {
		this.summary = summary;
	}

	/** 
	 * Set the title of the mapped field.
	 */
	public void setTitle(DefinitionLanguages title) {
		this.title = title;
	}

	/**
	 * MappedFieldDefinition Builder class.
	 */
	public static class Builder<T> {
		
		private T parentBuilder;
		private MappedItemType type;
		@Deprecated(since = "2.3.0", forRemoval = true)
		private List<String> fields;
		private List<MappedFieldDefinitionValueImpl.Builder<Builder<T>>> newFields;
		private DefinitionLanguagesImpl.Builder<Builder<T>> summary;
		private DefinitionLanguagesImpl.Builder<Builder<T>> title;

		public Builder() {
			summary = new DefinitionLanguagesImpl.Builder<>(this);
			title = new DefinitionLanguagesImpl.Builder<>(this);
			newFields = new ArrayList<>();
		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> type(MappedItemType type) {
			this.type = type;
			return this;
		}

		@Deprecated(since = "2.3.0", forRemoval = true)
		public Builder<T> addField(String field) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(field);
			return this;
		}

		public MappedFieldDefinitionValueImpl.Builder<Builder<T>> addField() {
			var field = new MappedFieldDefinitionValueImpl.Builder<>(this);
			this.newFields.add(field);
			return field;
		}

		public DefinitionLanguagesImpl.Builder<Builder<T>> summary() {
			return summary;
		}

		public DefinitionLanguagesImpl.Builder<Builder<T>> title() {
			return title;
		}

		public MappedFieldDefinition build() {
			MappedFieldDefinitionImpl mappedField = new MappedFieldDefinitionImpl();
			if (type == null) {
				throw new NullPointerException();
			}
			mappedField.setType(type);
			mappedField.setFields(fields);
			mappedField.setNewFields(newFields.stream()
					.map(MappedFieldDefinitionValueImpl.Builder::build)
					.collect(Collectors.toList()));
			mappedField.setSummary(summary.build());
			mappedField.setTitle(title.build());
			return mappedField;
		}

		public T done() {
			return parentBuilder;
		}
	}
}
