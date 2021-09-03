package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.definition.MarketplaceDefinition;
import com.logicommerce.sdk.models.Carrier;
import com.logicommerce.sdk.models.Marketplace;

public class MarketplaceDefinitionImpl extends ConnectorDefinitionImpl implements MarketplaceDefinition {

	private List<Marketplace> markerplaces;
	
	private List<Carrier> shippers;
	
	@Override
	public List<Marketplace> getMarkerplaces() {
		return markerplaces;
	}

	@Override
	public List<Carrier> getShippers() {
		return shippers;
	}
	
	public void setMarkerplaces(List<Marketplace> markerplaces) {
		this.markerplaces = markerplaces;
	}

	public void setShippers(List<Carrier> shippers) {
		this.shippers = shippers;
	}

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, MarketplaceDefinition, MarketplaceDefinitionImpl> {

		private List<String> markerplaces;
		
		private List<Carrier> shippers;
		
		public Builder() {
			super();
			markerplaces = new ArrayList<>();
			shippers = new ArrayList<>();
		}

		public Builder addMarketplace(String marketplace) {
			markerplaces.add(marketplace);
			return returnThis();
		}

		public Builder addShipper(Carrier shipper) {
			shippers.add(shipper);
			return returnThis();
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public MarketplaceDefinition build() {
			MarketplaceDefinitionImpl connector = new MarketplaceDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
