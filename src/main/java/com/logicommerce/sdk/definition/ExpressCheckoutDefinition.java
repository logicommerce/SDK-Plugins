package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * This interface represents the definition for an express checkout connector.
 * It extends the ConnectorDefinition interface.
 * 
 * @see ConnectorDefinition
 * @author LogiCommerce
 * @since 1.3.5
 */
public interface ExpressCheckoutDefinition extends ConnectorDefinition {

	/**
	 * Returns the type of the connector, which is ConnectorType.EXPRESS_CHECKOUT.
	 * 
	 * @return The type of the connector.
	 */
	@Override
	default ConnectorType getType() {
		return ConnectorType.EXPRESS_CHECKOUT;
	}
}
