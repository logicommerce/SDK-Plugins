package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

public interface ConfirmOrderDefinition extends ConnectorDefinition {

	@Override
	default ConnectorType getType() {
		return ConnectorType.CONFIRM_ORDER;
	}

}
