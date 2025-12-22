package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.InvoiceDefinition;

/**
 * <p>InvocieDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.7.0
 */
public class InvoiceDefinitionImpl extends ConnectorDefinitionImpl implements InvoiceDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, InvoiceDefinition, InvoiceDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public InvoiceDefinition build() {
			InvoiceDefinitionImpl connector = new InvoiceDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}