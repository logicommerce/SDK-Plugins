package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>TaxesDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.0
 */
public interface TaxesDefinition extends ConnectorDefinition {
	
	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.TAXES;
	}
}
