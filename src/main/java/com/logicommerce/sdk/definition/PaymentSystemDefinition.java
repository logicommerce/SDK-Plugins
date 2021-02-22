package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

public interface PaymentSystemDefinition extends ConnectorDefinition {

	@Override
	default ConnectorType getType() {
		return ConnectorType.PAYMENT_SYSTEM;
	}

}
