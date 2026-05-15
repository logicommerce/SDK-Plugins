package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>ViesValidatorDefinition interface.</p>
 *
 * @author LogiCommerce
 * @since 2.7.5
 */
public interface ViesValidatorDefinition extends ConnectorDefinition {
	
	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.VIES_VALIDATOR;
	}

}
