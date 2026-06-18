package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>TaxIdValidatorDefinition interface.</p>
 *
 * @author LogiCommerce
 * @since 2.7.6
 */
public interface TaxIdValidatorDefinition extends ConnectorDefinition {
	
	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.TAX_ID_VALIDATOR;
	}

}
