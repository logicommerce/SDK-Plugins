package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.OauthConnectDefinition;

public class OauthConnectDefinitionImpl extends ConnectorDefinitionImpl implements OauthConnectDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, OauthConnectDefinition, OauthConnectDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public OauthConnectDefinition build() {
			OauthConnectDefinitionImpl connector = new OauthConnectDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
