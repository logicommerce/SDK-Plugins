package com.logicommerce.sdk.definition;

import java.util.Map;

/**
 * The DefinitionLanguages interface represents a collection of methods for retrieving language values.
 * It provides methods to get the names and values of languages.
 * 
 * @author Logicommerce
 * @since 1.0.16
 */
public interface DefinitionLanguages {

	/**
	 * Returns a map of language names and their corresponding values.
	 * 
	 * @return a map containing language names and values
	 */
	Map<String, String> getValues();

	
	/**
	 * Returns the value of the specified language.
	 * 
	 * @param language the language for which to retrieve the value
	 * @return the value of the specified language
	 */
	String getValue(String language);

}
