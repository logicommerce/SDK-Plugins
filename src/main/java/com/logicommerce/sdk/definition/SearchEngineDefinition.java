package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>SearchEngineDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface SearchEngineDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.SEARCH_ENGINE;
	}

}
