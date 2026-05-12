package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.RewardPointDefinition;

/**
 * <p>RewardPointsDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.7.4
 */
public class RewardPointsDefinitionImpl extends ConnectorDefinitionImpl implements RewardPointDefinition {

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, RewardPointDefinition, RewardPointsDefinitionImpl> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public RewardPointDefinition build() {
			RewardPointsDefinitionImpl connector = new RewardPointsDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
