package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>OauthDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OauthDefinition extends ConnectorDefinition {
	
	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.OAUTH;
	}

}
