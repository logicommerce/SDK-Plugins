package com.logicommerce.sdk.definition;

import java.util.List;
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

}
