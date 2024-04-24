package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.DocumentPaymentSystemDefinition;

/**
 * <p>DocumentPaymentSystemDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.4
 */
public class DocumentPaymentSystemDefinitionImpl extends ConnectorDefinitionImpl implements DocumentPaymentSystemDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, 
		DocumentPaymentSystemDefinition, DocumentPaymentSystemDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public DocumentPaymentSystemDefinition build() {
			DocumentPaymentSystemDefinitionImpl connector = new DocumentPaymentSystemDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
