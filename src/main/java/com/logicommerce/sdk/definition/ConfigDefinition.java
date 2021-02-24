package com.logicommerce.sdk.definition;

import java.util.List;

public interface ConfigDefinition {

	List<PropertyDefinition> getProperties();

	void addProperty(PropertyDefinition property);

	boolean hasAdditionalProperties();

	List<PropertyDefinition> getAdditionalProperties();

	void addAdditionalProperty(PropertyDefinition property);

	List<MappedFieldDefinition> getMappedFields();

	void addMappedField(MappedFieldDefinition mappedField);

}
