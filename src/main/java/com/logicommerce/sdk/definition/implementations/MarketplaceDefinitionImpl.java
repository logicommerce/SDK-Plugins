package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.definition.MarketplaceDefinition;
import com.logicommerce.sdk.models.Carrier;
import com.logicommerce.sdk.models.Marketplace;

/**
 * <p>MarketplaceDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class MarketplaceDefinitionImpl extends ConnectorDefinitionImpl implements MarketplaceDefinition {

	private List<Marketplace> marketplaces;
	
	private List<Carrier> shippers;
	
	/** {@inheritDoc} */
	@Override
	public List<Marketplace> getMarketplaces() {
		return marketplaces;
	}

	/** {@inheritDoc} */
	@Override
	public List<Carrier> getShippers() {
		return shippers;
	}
	
	/** {@inheritDoc} */
	@Override
	public void setMarketplaces(List<Marketplace> marketplaces) {
		this.marketplaces = marketplaces;
	}

	/** {@inheritDoc} */
	@Override
	public void setShippers(List<Carrier> shippers) {
		this.shippers = shippers;
	}

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, MarketplaceDefinition, MarketplaceDefinitionImpl> {

		private List<String> marketplaces;
		
		private List<Carrier> shippers;
		
		public Builder() {
			super();
			marketplaces = new ArrayList<>();
			shippers = new ArrayList<>();
		}

		public Builder addMarketplace(String marketplace) {
			marketplaces.add(marketplace);
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
