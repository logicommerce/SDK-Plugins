package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.PaymentSystemDefinition;

public class PaymentSystemDefinitionImpl extends ConnectorDefinitionImpl implements PaymentSystemDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, PaymentSystemDefinition, PaymentSystemDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public PaymentSystemDefinition build() {
			PaymentSystemDefinitionImpl connector = new PaymentSystemDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
