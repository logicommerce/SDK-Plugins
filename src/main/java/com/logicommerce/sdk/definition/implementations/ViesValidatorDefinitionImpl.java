package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ViesValidatorDefinition;

/**
 * <p>ViesValidatorDefinitionImpl class.</p>
 *
 * @author LogiCommerce
 * @since 2.7.5
 */
public class ViesValidatorDefinitionImpl extends ConnectorDefinitionImpl implements ViesValidatorDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, ViesValidatorDefinition, ViesValidatorDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public ViesValidatorDefinition build() {
			ViesValidatorDefinitionImpl connector = new ViesValidatorDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
