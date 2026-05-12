package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>RewardPointDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 2.7.4
 */
public interface RewardPointDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.REWARD_POINTS;
	}

}
