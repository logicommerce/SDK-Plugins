package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>MailingSystemDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface MailingSystemDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.MAILING_SYSTEM;
	}

}
