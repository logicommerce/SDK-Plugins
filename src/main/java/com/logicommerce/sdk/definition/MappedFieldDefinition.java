package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.MappedItemType;

/**
 * This interface is used to implement a mapped field definition data and properties. It allows to
 * link a plugin fields with LogiCommerce fields in back office configuration. 
 * 
 * @author LogiCommerce
 * @since 1.0.16
 */
public interface MappedFieldDefinition {

	/**
	 * Returns the type of the mapped field.
	 *
	 * @return a {@link com.logicommerce.sdk.enums.MappedItemType} object
	 */
	MappedItemType getType();

	/**
	 * Returns a list of fields.
	 *
	 * @since 1.0.16
	 * @return a {@link java.util.List} object
	 */
	@Deprecated(since = "2.3.0", forRemoval = true)
	List<String> getFields();

	/**
	 * Returns a list of fields.
	 *
	 * @since 2.3.0
	 * @return a {@link java.util.List} object
	 */
	List<MappedFieldDefinitionValue> getNewFields();

	/**
	 * Get the summary of the mapped field.
	 * 
	 * @since 2.1.0
	 * @return DefinitionLanguages
	 */
	DefinitionLanguages getSummary();

	/**
	 * Get the title of the mapped field.
	 * 
	 * @since 2.1.1
	 * @return DefinitionLanguages
	 */
	DefinitionLanguages getTitle();
}
