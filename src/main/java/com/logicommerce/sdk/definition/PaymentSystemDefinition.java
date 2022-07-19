package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>PaymentSystemDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentSystemDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.PAYMENT_SYSTEM;
	}

}
