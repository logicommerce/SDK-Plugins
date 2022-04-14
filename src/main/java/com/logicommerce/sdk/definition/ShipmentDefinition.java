package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

public interface ShipmentDefinition extends ConnectorDefinition {

	@Override
	default ConnectorType getType() {
		return ConnectorType.SHIPMENT;
	}

}
