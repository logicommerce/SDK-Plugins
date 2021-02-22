package com.logicommerce.sdk.definition;

import java.util.Map;

public interface DefinitionLanguages {

	Map<String, String> getNames();

	String getName(String language);

}
