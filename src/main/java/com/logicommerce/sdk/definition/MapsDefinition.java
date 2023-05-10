package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>MapsDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.1.13
 */
public interface MapsDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.MAPS;
	}

}
