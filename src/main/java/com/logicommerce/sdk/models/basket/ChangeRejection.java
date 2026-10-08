package com.logicommerce.sdk.models.basket;

import com.logicommerce.sdk.enums.RejectionCode;

/**
 * <p>A requested basket change that could not be applied ({@link BasketView#getRejections()}). The other valid
 * changes of the same call are still applied.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface ChangeRejection {

	/**
	 * <p>The part of the requested changes a rejection refers to.</p>
	 *
	 * @author Logicommerce
	 * @since 2.8.5
	 */
	enum Target {
		/**
		 * A requested row ({@link BasketChanges#getRows()}).
		 */
		ROW,
		/**
		 * The customer ({@link BasketChanges#getCustomer()}).
		 */
		CUSTOMER,
		/**
		 * The country ({@link BasketChanges#getCountryCode()} or {@link BasketContext#getCountryCode()}).
		 */
		COUNTRY,
		/**
		 * The currency hint ({@link BasketChanges#getCurrencyHint()} or {@link BasketContext#getCurrencyHint()}).
		 */
		CURRENCY
	}

	/**
	 * Returns what the rejection refers to.
	 *
	 * @return the target
	 */
	Target getTarget();

	/**
	 * Returns, for a {@link Target#ROW}, the position of the row in the requested {@link BasketChanges#getRows()}.
	 *
	 * @return the 0-based position, or -1 for any other target
	 */
	int getIndex();

	/**
	 * Returns why the change was rejected.
	 *
	 * @return the code
	 */
	RejectionCode getCode();

	/**
	 * Returns diagnostic detail for logs, not meant to be shown to buyers.
	 *
	 * @return the detail, or null
	 */
	String getDetail();

}
