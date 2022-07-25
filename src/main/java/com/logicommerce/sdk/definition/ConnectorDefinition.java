package com.logicommerce.sdk.definition;

import java.util.Map;
import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>ConnectorDefinition interface. To implement a plugin connnector definition properties</p>
 * <p>Extends the functionality of configDefinition.</p>
 * <p>Returns the plugin connector properties definition of a LogiCommerce module.</p>
 * <p>Note that to get the values ​​defined in Logicommerce, they must be captured with
 * <strong>@Property</strong> or <strong>@PropertyLanguage</strong> annotations and will
 * only be available to your services.</p>
 *
 * @see com.logicommerce.sdk.definition.ConfigDefinition ConfigDefinition
 * @see com.logicommerce.sdk.definition.PluginDefinition PluginDefinition
 * @see com.logicommerce.sdk.Property Property
 * @see com.logicommerce.sdk.PropertyLanguage PropertyLanguage
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ConnectorDefinition extends ConfigDefinition {

	/**
	 * <p>Get connector type value.</p>
	 *
	 * @see com.logicommerce.sdk.enums.ConnectorType ConnectorType
	 * @since 1.0.16
	 * @return a {@link com.logicommerce.sdk.enums.ConnectorType ConnectorType} object
	 */
	ConnectorType getType();

	/**
	 * <p>Get additional data.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.util.Map Map}&lt;{@link java.lang.String String}, {@link java.lang.Object Object}&gt; object
	 */
	Map<String, Object> getAdditionalData();

}
