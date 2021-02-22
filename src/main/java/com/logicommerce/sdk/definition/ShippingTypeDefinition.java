package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

public interface ShippingTypeDefinition extends ConnectorDefinition {

	@Override
	default ConnectorType getType() {
		return ConnectorType.SHIPPING_TYPE;
	}

}
