package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.ConnectorType;
import com.logicommerce.sdk.models.Carrier;
import com.logicommerce.sdk.models.Marketplace;

public interface MarketplaceDefinition extends ConnectorDefinition {
	
	List<Marketplace> getMarketplaces();
	
	List<Carrier> getShippers();
	
	void setMarketplaces(List<Marketplace> marketplaces);

	void setShippers(List<Carrier> shippers);

	@Override
	default ConnectorType getType() {
		return ConnectorType.MARKETPLACE;
	}

}
