package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

public interface MailingSystemDefinition extends ConnectorDefinition {

	@Override
	default ConnectorType getType() {
		return ConnectorType.MAILING_SYSTEM;
	}

}
