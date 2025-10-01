package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.MailerDefinition;

/**
 * <p>MailerDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.6.0
 */
public class MailerDefinitionImpl extends ConnectorDefinitionImpl implements MailerDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, MailerDefinition, MailerDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public MailerDefinition build() {
			MailerDefinitionImpl connector = new MailerDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
