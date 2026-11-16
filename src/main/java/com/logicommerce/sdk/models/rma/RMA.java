package com.logicommerce.sdk.models.rma;

import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.RMAStatusType;
import com.logicommerce.sdk.models.document.CustomerDocument;

/**
 * <p>A return merchandise authorization (RMA) of a customer
 * ({@link com.logicommerce.sdk.resources.RMAResource}). {@link #getOrderId()} is the order it returns items of.</p>
 *
 * <p>It shares the {@link #getId() id} and the {@link #getDocumentNumber() document number} with the
 * {@link com.logicommerce.sdk.models.order.OrderRMA} of its order, and adds the customer, the product, SKU and reason of
 * each line, and the amounts. The amounts are decimals in the currency of {@link #getCurrencyCode()}, not minor
 * units.</p>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public interface RMA extends CustomerDocument<RMAItem> {

	/**
	 * Returns the RMA date, as stored.
	 *
	 * @return the date
	 */
	LocalDateTime getDate();

	/**
	 * Returns the RMA status.
	 *
	 * @return the status
	 */
	RMAStatusType getStatus();

	/**
	 * Returns the subtotal, without taxes, in the currency of {@link #getCurrencyCode()}.
	 *
	 * @return the subtotal
	 */
	double getSubtotal();

	/**
	 * Returns the total, with taxes, in the currency of {@link #getCurrencyCode()}.
	 *
	 * @return the total
	 */
	double getTotal();

	/**
	 * Returns the code of the currency of the amounts, the invoicing currency of the RMA.
	 *
	 * @return the currency code, or null when the RMA has no invoicing currency
	 */
	String getCurrencyCode();

}
