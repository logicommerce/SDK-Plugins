package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ShipperDefinition;

/**
 * <p>ShipperDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ShipperDefinitionImpl extends ConnectorDefinitionImpl implements ShipperDefinition {

		
	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, ShipperDefinition, ShipperDefinitionImpl> {
		
		public Builder() {
			super();
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public ShipperDefinition build() {
			ShipperDefinitionImpl connector = new ShipperDefinitionImpl();
			setAttributes(connector);
			return connector;
		}
		
	}

}
