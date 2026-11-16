package com.logicommerce.sdk.models.rma;

import com.logicommerce.sdk.models.document.DocumentItem;

/**
 * <p>A returned product line of an {@link RMA}.</p>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public interface RMAItem extends DocumentItem {

	/**
	 * Returns the description of the return reason the customer chose, as stored in the RMA.
	 *
	 * @return the reason, or null when the line has none
	 */
	String getReason();

	/**
	 * Returns the comment the customer added to the return reason.
	 *
	 * @return the comment, or null when the line has none
	 */
	String getReasonComment();

}
