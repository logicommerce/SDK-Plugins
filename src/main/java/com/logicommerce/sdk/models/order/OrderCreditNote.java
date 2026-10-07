package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;

/**
 * <p>A credit note issued for an order ({@link Order#getCreditNotes()}). Its amount is in
 * {@link OrderPurchaseCurrencyAmounts#getCreditNotes()}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderCreditNote {

	/**
	 * Returns the credit note id.
	 *
	 * @return the id
	 */
	int getId();

	/**
	 * Returns the credit note date, as stored (like {@link Document#getDate()}).
	 *
	 * @return the date
	 */
	LocalDateTime getDate();

}
