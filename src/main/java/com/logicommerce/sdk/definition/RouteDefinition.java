package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>RouteDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 2.1.2
 */
public interface RouteDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.ROUTE;
	}

}
