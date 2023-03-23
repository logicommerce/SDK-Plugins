package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>MarketingDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.1.8
 */
public interface MarketingDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.MARKETING;
	}

}