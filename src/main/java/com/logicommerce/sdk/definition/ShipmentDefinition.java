package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>ShipmentDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ShipmentDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.SHIPMENT;
	}

}
