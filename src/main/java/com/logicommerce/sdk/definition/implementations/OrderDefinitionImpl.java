package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.OrderDefinition;

/**
 * <p>OrderDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.4
 */
public class OrderDefinitionImpl extends ConnectorDefinitionImpl implements OrderDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, OrderDefinition, OrderDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public OrderDefinition build() {
			OrderDefinitionImpl connector = new OrderDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
