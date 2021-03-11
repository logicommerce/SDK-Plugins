package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

public interface SearchEngineDefinition extends ConnectorDefinition {

	@Override
	default ConnectorType getType() {
		return ConnectorType.SEARCH_ENGINE;
	}

}
