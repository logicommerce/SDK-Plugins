package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.ConnectorType;

public interface ShipperDefinition extends ConnectorDefinition {

	@Override
	default ConnectorType getType() {
		return ConnectorType.SHIPPER;
	}

	List<StatusCodeDefinition> getStatusCodes();

	void setStatusCodes(List<StatusCodeDefinition> statusCodes);

}
