package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ConfirmOrderDefinition;

/**
 * <p>ConfirmOrderDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ConfirmOrderDefinitionImpl extends ConnectorDefinitionImpl implements ConfirmOrderDefinition {

		
	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, ConfirmOrderDefinition, ConfirmOrderDefinitionImpl> {
		
		public Builder() {
			super();
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public ConfirmOrderDefinition build() {
			ConfirmOrderDefinitionImpl connector = new ConfirmOrderDefinitionImpl();
			setAttributes(connector);
			return connector;
		}
		
	}

}
