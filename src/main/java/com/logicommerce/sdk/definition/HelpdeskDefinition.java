package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>HelpdeskDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 2.9.1
 */
public interface HelpdeskDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.HELPDESK;
	}

}
