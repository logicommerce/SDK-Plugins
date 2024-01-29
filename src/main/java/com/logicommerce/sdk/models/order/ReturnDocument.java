package com.logicommerce.sdk.models.order;

import java.util.List;

/**
 * Return document interface.
 * 
 * @author Logicommerce
 * @since 1.3.1
 */
public interface ReturnDocument extends Document {

	/**
	 * Returns the additional items.
	 *
	 * @return a {@link List}&lt;{@link AdditionalItem}&gt; object
	 */
	List<AdditionalItem> getAdditionalItems();

}
