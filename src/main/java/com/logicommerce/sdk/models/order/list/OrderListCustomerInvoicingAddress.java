package com.logicommerce.sdk.models.order.list;

/**
 * Customer invoicing address of an order in order listings.
 *
 * @author LogiCommerce
 * @since 2.8.5
 */
public interface OrderListCustomerInvoicingAddress extends OrderListCustomerAddress {

	/**
	 * Returns if the equivalence surcharge applies.
	 *
	 * @return a boolean
	 */
	boolean isRe();

	/**
	 * Returns if taxes apply.
	 *
	 * @return a boolean
	 */
	boolean isTax();

}
