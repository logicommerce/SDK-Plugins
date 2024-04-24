package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.PickupPointProviderDefinition;

/**
 * <p>PickupPointProviderDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.7
 */
public class PickupPointProviderDefinitionImpl extends ConnectorDefinitionImpl implements PickupPointProviderDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, 
		PickupPointProviderDefinition, PickupPointProviderDefinitionImpl> {
		
		public Builder() {
			super();
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public PickupPointProviderDefinition build() {
			PickupPointProviderDefinitionImpl connector = new PickupPointProviderDefinitionImpl();
			setAttributes(connector);
			return connector;
		}
		
	}

}
