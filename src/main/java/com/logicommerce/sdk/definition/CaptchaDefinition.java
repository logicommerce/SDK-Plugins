package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>CaptchaDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.1.13
 */
public interface CaptchaDefinition extends ConnectorDefinition {

	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.CAPTCHA;
	}

}
