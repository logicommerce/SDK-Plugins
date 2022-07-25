package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.CustomTagsDefinition;

/**
 * <p>CustomTagDefintionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class CustomTagDefintionImpl extends ConnectorDefinitionImpl implements CustomTagsDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, CustomTagsDefinition, CustomTagDefintionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public CustomTagsDefinition build() {
			CustomTagDefintionImpl connector = new CustomTagDefintionImpl();
			setAttributes(connector);
			return connector;
		}

	}
}
