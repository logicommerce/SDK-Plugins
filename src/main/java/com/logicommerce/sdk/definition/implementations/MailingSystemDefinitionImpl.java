package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.MailingSystemDefinition;

/**
 * <p>MailingSystemDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class MailingSystemDefinitionImpl extends ConnectorDefinitionImpl implements MailingSystemDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, MailingSystemDefinition, MailingSystemDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public MailingSystemDefinition build() {
			MailingSystemDefinitionImpl connector = new MailingSystemDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}
}
