package com.logicommerce.sdk.models.order;

import java.time.Instant;

/**
 * <p>A credit note issued for an order ({@link OrderView#getCreditNotes()}).</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface CreditNoteView {

	/**
	 * Returns the credit note id.
	 *
	 * @return the id
	 */
	int getId();

	/**
	 * Returns the credit note date.
	 *
	 * @return the date (UTC)
	 */
	Instant getDate();

	/**
	 * Returns the credited amount, in minor units of the order's purchase currency ({@link OrderView#getCurrencyCode()}).
	 *
	 * @return a non-negative amount
	 */
	long getTotal();

}
