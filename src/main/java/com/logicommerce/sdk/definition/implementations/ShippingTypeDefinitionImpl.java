package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ShippingTypeDefinition;

/**
 * <p>ShippingTypeDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ShippingTypeDefinitionImpl extends ConnectorDefinitionImpl implements ShippingTypeDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, ShippingTypeDefinition, ShippingTypeDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public ShippingTypeDefinition build() {
			ShippingTypeDefinitionImpl connector = new ShippingTypeDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
