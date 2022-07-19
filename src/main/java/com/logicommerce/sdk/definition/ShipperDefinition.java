package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>ShipperDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ShipperDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.SHIPPER;
	}
}
