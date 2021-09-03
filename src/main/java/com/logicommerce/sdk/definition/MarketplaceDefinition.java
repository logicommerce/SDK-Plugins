package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.ConnectorType;
import com.logicommerce.sdk.models.Carrier;
import com.logicommerce.sdk.models.Marketplace;

public interface MarketplaceDefinition extends ConnectorDefinition {
	
	List<Marketplace> getMarkerplaces();
	
	List<Carrier> getShippers();

	@Override
	default ConnectorType getType() {
		return ConnectorType.MARKETPLACE;
	}

}
