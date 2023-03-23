package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.MarketingDefinition;

/**
 * <p>MarketingDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.1.8
 */
public class MarketingDefinitionImpl extends ConnectorDefinitionImpl implements MarketingDefinition {
	
	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, MarketingDefinition, MarketingDefinitionImpl> {
		
		public Builder() {
			super();
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public MarketingDefinition build() {
			MarketingDefinitionImpl connector = new MarketingDefinitionImpl();
			setAttributes(connector);
			return connector;
		}	
	}
}