package com.logicommerce.sdk.models.order;

/**
 * <p>The amount of one credit note of an order in the order's purchase currency
 * ({@link OrderPurchaseCurrencyAmounts#getCreditNotes()}).</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderCreditNoteAmounts {

	/**
	 * Returns the id of the credit note this amount belongs to.
	 *
	 * @return the credit note id, as in {@link OrderCreditNote#getId()}
	 */
	int getCreditNoteId();

	/**
	 * Returns the credit note's total, in minor units.
	 *
	 * @return a non-negative amount
	 */
	long getTotal();

}
