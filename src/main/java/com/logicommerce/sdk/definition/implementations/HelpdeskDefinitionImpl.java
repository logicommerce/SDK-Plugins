package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.HelpdeskDefinition;

/**
 * <p>HelpdeskDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.9.1
 */
public class HelpdeskDefinitionImpl extends ConnectorDefinitionImpl implements HelpdeskDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, HelpdeskDefinition, HelpdeskDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public HelpdeskDefinition build() {
			HelpdeskDefinitionImpl connector = new HelpdeskDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}
}
