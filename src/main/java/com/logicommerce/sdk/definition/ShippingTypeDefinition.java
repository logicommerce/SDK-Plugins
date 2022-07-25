package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>ShippingTypeDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ShippingTypeDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.SHIPPING_TYPE;
	}

}
