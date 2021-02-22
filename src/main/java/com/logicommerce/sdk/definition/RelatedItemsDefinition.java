package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.ConnectorType;

public interface RelatedItemsDefinition extends ConnectorDefinition {

	List<String> getAllowedTypes();
	
	@Override
	default ConnectorType getType() {
		return ConnectorType.RELATED_DEFINITION;
	}

}
