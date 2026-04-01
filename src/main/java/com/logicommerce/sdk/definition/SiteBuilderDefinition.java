package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>MapsDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 2.7.3
 */
public interface SiteBuilderDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.SITE_BUILDER;
	}

}
