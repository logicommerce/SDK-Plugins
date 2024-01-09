package com.logicommerce.sdk.models.order;

import java.util.List;

/**
 * CreditNote interface.
 * 
 * @author Logicommerce
 * @since 1.3.0
 */
public interface CreditNote extends Document {

	/**
	 * Returns the additional items.
	 *
	 * @return a {@link List}&lt;{@link AdditionalItem}&gt; object
	 */
	List<AdditionalItem> getAdditionalItems();

}
