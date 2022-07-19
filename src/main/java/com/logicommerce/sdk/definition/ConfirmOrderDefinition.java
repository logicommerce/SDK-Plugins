package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>ConfirmOrderDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ConfirmOrderDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.CONFIRM_ORDER;
	}

}
