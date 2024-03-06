package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>TaxesDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.4
 */
public interface RMADefinition extends ConnectorDefinition {
	
	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.RMA;
	}
}
