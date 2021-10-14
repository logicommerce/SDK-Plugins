package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

public interface OauthDefinition extends ConnectorDefinition {
	
	@Override
	default ConnectorType getType() {
		return ConnectorType.OAUTH;
	}

}
