package com.logicommerce.sdk.definition;

import java.util.List;

/**
 * <p>ConfigDefinition interface. To implement a plugin config properties.</p>
 *
 * @see com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition
 * @see com.logicommerce.sdk.definition.MappedFieldDefinition MappedFieldDefinition
 * @see com.logicommerce.sdk.definition.PluginDefinition PluginDefinition
 * @see com.logicommerce.sdk.definition.PluginActionDefinition PluginActionDefinition
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ConfigDefinition {

	/**
	 * Get explanation of the plugin or connector.
	 * 
	 * @since 2.1.0
	 * @return DefinitionLanguages
	 */
	DefinitionLanguages getSummary();

	/**
	 * <p>Get properties from the plugin definition.</p>
	 *
	 * @see com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition
	 * @since 1.0.16
	 * @return a {@link java.util.List List}&lt;{@link com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition}&gt; object
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
	 * @return a {@link java.util.List List}&lt;{@link com.logicommerce.sdk.definition.PropertyDefinition PropertyDefinition}&gt; object
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
	 * @return a {@link java.util.List List}&lt;{@link com.logicommerce.sdk.definition.MappedFieldDefinition MappedFieldDefinition}&gt; object
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

	/**
	 * <p>Get all actinos from the plugin definition.</p>
	 *
	 * @see com.logicommerce.sdk.definition.PluginActionDefinition PluginActionDefinition
	 * @since 1.3.4
	 * @return a {@link java.util.List List}&lt;{@link com.logicommerce.sdk.definition.PluginActionDefinition MappedFieldDefinition}&gt; object
	 */
	List<PluginActionDefinition> getPluginActions();

	/**
	 * <p>Add action to the plugin definition.</p>
	 *
	 * @see com.logicommerce.sdk.definition.MappedFieldDefinition PluginActionDefinition
	 * @param pluginAction a {@link com.logicommerce.sdk.definition.PluginActionDefinition PluginActionDefinition} object
	 * @since 1.3.4
	 */
	void addPluginAction(PluginActionDefinition pluginAction);
}
