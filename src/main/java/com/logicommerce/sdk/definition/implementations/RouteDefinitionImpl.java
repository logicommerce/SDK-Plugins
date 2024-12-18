package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.RouteDefinition;

/**
 * <p>RouteDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.1.2
 */
public class RouteDefinitionImpl extends ConnectorDefinitionImpl implements RouteDefinition	 {
	
	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, RouteDefinition, RouteDefinitionImpl> {
		
		public Builder() {
			super();
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public RouteDefinition build() {
			RouteDefinitionImpl connector = new RouteDefinitionImpl();
			setAttributes(connector);
			return connector;
		}	
	}
}