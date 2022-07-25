package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.OauthDefinition;

/**
 * <p>OauthDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OauthDefinitionImpl extends ConnectorDefinitionImpl implements OauthDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, OauthDefinition, OauthDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public OauthDefinition build() {
			OauthDefinitionImpl connector = new OauthDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
