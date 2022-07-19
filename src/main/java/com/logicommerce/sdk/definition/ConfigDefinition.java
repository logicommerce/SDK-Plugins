package com.logicommerce.sdk.definition;

import java.util.List;

/**
 * <p>ConfigDefinition interface. To implement a plugin config properties.</p>
 *
 * @see com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition
 * @see com.logicommerce.sdk.definition.MappedFieldDefinition MappedFieldDefinition
 * @see com.logicommerce.sdk.definition.PluginDefinition PluginDefinition
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ConfigDefinition {

	/**
	 * <p>Get properties from the plugin definition.</p>
	 *
	 * @see com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition
	 * @since 1.0.16
	 * @return a {@link java.util.List List}<{@link com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition}> object
	 */
	List<PropertyDefinition> getProperties();

	/**
	 * <p>add property to the plugin definition.</p>
	 *
	 * @see com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition
	 * @param property a {@link com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition} object
	 * @since 1.0.16
	 */
	void addProperty(PropertyDefinition property);

	/**
	 * <p>Return true if plguin definition has additional properties.</p>
	 *
	 * @since 1.0.16
	 * @return a boolean
	 */
	boolean hasAdditionalProperties();

	/**
	 * <p>Get additional properties from plugin definition.</p>
	 *
	 * @see com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition
	 * @since 1.0.16
	 * @return a {@link java.util.List List}<{@link com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition}> object
	 */
	List<PropertyDefinition> getAdditionalProperties();

	/**
	 * <p>Add additional property to the plugin definition.</p>
	 *
	 * @see com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition
	 * @param property a {@link com.logicommerce.sdk.definition.PropertyDefinition} object
	 * @since 1.0.16
	 */
	void addAdditionalProperty(PropertyDefinition property);

	/**
	 * <p>Get all mapped fields from the plugin definition.</p>
	 *
	 * @see com.logicommerce.sdk.definition.MappedFieldDefinition MappedFieldDefinition
	 * @since 1.0.16
	 * @return a {@link java.util.List List}<{@link com.logicommerce.sdk.definition.MappedFieldDefinition MappedFieldDefinition}> object
	 */
	List<MappedFieldDefinition> getMappedFields();

	/**
	 * <p>Add mapped field to the plugin definition.</p>
	 *
	 * @see com.logicommerce.sdk.definition.MappedFieldDefinition MappedFieldDefinition
	 * @param mappedField a {@link com.logicommerce.sdk.definition.MappedFieldDefinition MappedFieldDefinition} object
	 * @since 1.0.16
	 */
	void addMappedField(MappedFieldDefinition mappedField);

}
