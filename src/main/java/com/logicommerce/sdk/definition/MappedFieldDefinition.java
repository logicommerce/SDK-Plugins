package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.MappedItemType;

/**
 * <p>MappedFieldDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface MappedFieldDefinition {

	/**
	 * <p>getType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.MappedItemType} object
	 */
	MappedItemType getType();

	/**
	 * <p>getFields.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.util.List} object
	 */
	List<String> getFields();

}
