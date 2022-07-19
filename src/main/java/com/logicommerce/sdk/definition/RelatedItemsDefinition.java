package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>RelatedItemsDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface RelatedItemsDefinition extends ConnectorDefinition {

	/**
	 * <p>getAllowedTypes.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<String> getAllowedTypes();
	
	/** {@inheritDoc} */
	@Override
	default ConnectorType getType() {
		return ConnectorType.RELATED_DEFINITION;
	}

}
