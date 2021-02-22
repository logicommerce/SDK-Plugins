package com.logicommerce.sdk.definition;

import java.util.List;

public interface PropertyDefinition {

	String getIdentifier();

	String getType();

	boolean isRequired();

	String getDefaultValue();
	
	boolean isLanguageValue();
	
	String getEntryValueMode();

	List<PropertyDefinitionValue> getValues();

	DefinitionLanguages getLanguages();

}
