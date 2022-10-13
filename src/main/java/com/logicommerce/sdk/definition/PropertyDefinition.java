package com.logicommerce.sdk.definition;

import java.util.List;

/**
 * <p>PropertyDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PropertyDefinition {

	/**
	 * <p>getIdentifier.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getIdentifier();

	/**
	 * <p>getType.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getType();

	/**
	 * <p>isRequired.</p>
	 *
	 * @return a boolean
	 */
	boolean isRequired();

	/**
	 * <p>getDefaultValue.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getDefaultValue();
	
	/**
	 * <p>isLanguageValue.</p>
	 *
	 * @return a boolean
	 */
	boolean isLanguageValue();
	
	/**
	 * <p>isMultipleValue.</p>
	 *
	 * @return a boolean
	 */
	boolean isMultipleValue();

	/**
	 * <p>getEntryValueMode.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getEntryValueMode();

	/**
	 * <p>getValues.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<PropertyDefinitionValue> getValues();

	/**
	 * <p>getLanguages.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	DefinitionLanguages getLanguages();
	
	/**
	 * <p>getReference.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getReference();
	
	/**
	 * <p>getPermission.</p>
	 * 
	 * @since 1.1.1
	 * @return a {@link com.logicommerce.sdk.enums.PermissionType} object
	 */
	List<PropertyDefinitionPermission> getPermissions();

}
