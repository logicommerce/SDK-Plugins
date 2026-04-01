package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.SiteBuilderDefinition;

/**
 * <p>MailingSystemDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.7.3
 */
public class SiteBuilderDefinitionImpl extends ConnectorDefinitionImpl implements SiteBuilderDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, SiteBuilderDefinition, SiteBuilderDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public SiteBuilderDefinition build() {
			SiteBuilderDefinitionImpl connector = new SiteBuilderDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}
}
