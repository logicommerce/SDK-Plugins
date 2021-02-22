package com.logicommerce.sdk.definition;

import java.util.Map;
import com.logicommerce.sdk.enums.ConnectorType;

public interface ConnectorDefinition extends ConfigDefinition {

	ConnectorType getType();

	Map<String, Object> getAdditionalData();

}
