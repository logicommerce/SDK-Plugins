
package com.logicommerce.sdk.definition;

import java.util.List;

/**
 * PropertyDefinition interface provides methods to define and retrieve properties.
 *
 * @author LogiCommerce
 * @since 1.0.16
 */
public interface PropertyDefinition {

	/**
	 * Retrieves the identifier of the property. The identifier is a unique string that 
	 * represents the property.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getIdentifier();

	/**
	 * Retrieves the type of the property.<br>
	 * The type is a string that represents the data type of the property and will be used to
	 * define and validate the value of the property in the plugin configuration on LogiCommerce
	 * backoffice.<br>
	 * <br>
	 * The type can be one of the following:
	 * <ul>
	 *   <li>boolean</li>
	 *   <li>integer</li>
	 *   <li>double</li>
	 *   <li>string</li>
	 *   <li>textarea</li>
	 *   <li>password</li>
	 *   <li>date</li>
	 *   <li>datetime</li>
	 *   <li>checkbox</li>
	 *   <li>channelvalue: A channel value.</li>
	 *   <li>countrySelector: A country selector value.</li>
	 *   <li>documentStatuses: A document statuses value.</li>
	 *   <li>externalshippervalue: An external shipper value.</li>
	 *   <li>headquartervalue: A headquarter value.</li>
	 *   <li>paymentvalue: A payment value.</li>
	 *   <li>shippervalue: A shipper value.</li>
	 *   <li>accountvalue: A account value.</li>
	 *   <li>warehousevalue: A warehouse value.</li>
	 * </ul>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getType();

	/**
	 * Retrieves the label of the property. The label is a string that represents the name of the 
	 * property. It will be displayed in the plugin configuration in the LogiCommerce back office.
	 *
	 * @return a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	DefinitionLanguages getLanguages();

	/**
	 * Retrieves the hint of the property. The hint is a string that represents the description of 
	 * the property and will be displayed in the plugin configuration on LogiCommerce backoffice as 
	 * a tooltip.
	 * 
	 * @since 2.1.0
	 * @return DefinitionLanguages
	 */
	DefinitionLanguages getHint();

	/**
	 * Retrieves the required status of the property. The required status is a boolean that 
	 * represents if the property is required or not.
	 *
	 * @return a boolean
	 */
	boolean isRequired();

	/**
	 * Retrieves the default value of the property. The default value is a string that represents
	 * the default value of the property.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getDefaultValue();
	
	/**
	 * Determines if the property is a language value. A language value is a property that has
	 * multiple values for different languages.
	 *
	 * @return a boolean
	 */
	boolean isLanguageValue();
	
	/**
	 * Determines if the property is a multiple value. A multiple value is a property that has
	 * multiple values.
	 *
	 * @return a boolean
	 */
	boolean isMultipleValue();

	/**
	 * Retrieves the entry value mode of the property. The entry value mode is a string that
	 * represents the mode of the property value entry. The entry value mode can be one of the
	 * following:
	 * <ul>
	 *  <li>single</li>
	 *  <li>radio (deprecated)</li>
	 *  <li>multiple</li>
	 *  <li>select (deprecated)</li>
	 * </ul>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getEntryValueMode();

	/**
	 * Retrieves the possible values of the property.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<PropertyDefinitionValue> getValues();
	
	/**
	 * Retrieves the reference of the property. The reference is a string that represents the
	 * reference of the property.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getReference();
	
	/**
	 * Retrieves the permissions of the property.
	 * 
	 * @since 1.1.1
	 * @return a {@link com.logicommerce.sdk.enums.PermissionType} object
	 */
	List<PropertyDefinitionPermission> getPermissions();

}
