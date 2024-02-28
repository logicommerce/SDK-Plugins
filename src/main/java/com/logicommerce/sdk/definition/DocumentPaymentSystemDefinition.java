package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>DocumentPaymentSystemDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.3
 */
public interface DocumentPaymentSystemDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.DOCUMENT_PAYMENT_SYSTEM;
	}
}