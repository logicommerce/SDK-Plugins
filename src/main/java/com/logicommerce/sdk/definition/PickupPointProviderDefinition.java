package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>PickupPointProviderDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.7
 */
public interface PickupPointProviderDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.PICKUP_POINT_PROVIDER;
	}
}