package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ExpressCheckoutDefinition;

public class ExpressCheckoutDefinitionImpl extends ConnectorDefinitionImpl implements ExpressCheckoutDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, ExpressCheckoutDefinition, ExpressCheckoutDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public ExpressCheckoutDefinition build() {
			ExpressCheckoutDefinitionImpl connector = new ExpressCheckoutDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
