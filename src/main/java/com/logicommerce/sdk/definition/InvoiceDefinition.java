package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>InvoiceDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 2.7.0
 */
public interface InvoiceDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.INVOICE;
	}

}
