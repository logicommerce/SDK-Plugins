package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * This interface represents the definition for an mailer connector.
 * It extends the ConnectorDefinition interface.
 * 
 * @see ConnectorDefinition
 * @author LogiCommerce
 * @since 2.6.0
 */
public interface MailerDefinition extends ConnectorDefinition {

	/**
	 * Returns the type of the connector, which is ConnectorType.MAILER.
	 * 
	 * @return The type of the connector.
	 */
	@Override
	default ConnectorType getType() {
		return ConnectorType.MAILER;
	}
}
