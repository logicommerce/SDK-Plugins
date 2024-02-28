package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>DocumentShipmentDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.3
 */
public interface DocumentShipmentDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.DOCUMENT_SHIPMENT;
	}
}