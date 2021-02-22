package com.logicommerce.sdk.definition;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.enums.MappedItemType;

public class MappedFieldDefinitionBuilder {

	private MappedItemType type;
	private List<String> fields;
	
	public MappedFieldDefinitionBuilder() {
		fields(null);
	}
	
	public MappedFieldDefinitionBuilder type(MappedItemType type) {
		this.type = type;
		return this;
	}
	
	public MappedFieldDefinitionBuilder addField(String field) {
		this.fields.add(field);
		return this;
	}
	
	public MappedFieldDefinitionBuilder fields(List<String> fields) {
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
}
