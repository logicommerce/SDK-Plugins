package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.SearchEngineDefinition;

public class SearchEngineDefinitionImpl extends ConnectorDefinitionImpl implements SearchEngineDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, SearchEngineDefinition, SearchEngineDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public SearchEngineDefinition build() {
			SearchEngineDefinitionImpl connector = new SearchEngineDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
