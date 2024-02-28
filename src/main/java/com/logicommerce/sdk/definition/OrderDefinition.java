package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>OrderDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.3
 */
public interface OrderDefinition extends ConnectorDefinition {
	
	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.ORDER;
	}
}
