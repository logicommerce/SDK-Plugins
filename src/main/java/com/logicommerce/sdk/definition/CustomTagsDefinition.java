package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>CustomTagsDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface CustomTagsDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.CUSTOM_TAG;
	}

}
