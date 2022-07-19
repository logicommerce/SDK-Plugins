package com.logicommerce.sdk.models;

/**
 * <p>CartTotals interface. To get cart totals different amounts values with/without taxes.</p>
 * <p>Gets Totals from cart items, payment systems and shipping type selected, discounts and vouchers applied.</p>
 *
 * @see		com.logicommerce.sdk.models.Cart Cart
 * @see		com.logicommerce.sdk.models.CartItem CartItem
 * @author 	Logicommerce
 * @since 	1.0.16
 */
public interface CartTotals {

	/**
	 * <p>Get subtotal amount from the cart, this is a sum of total without taxes of cart items in cart.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getSubtotal();

	/**
	 * <p>Get subtotal amount from the cart, this is a sum of total without taxes of cart items in cart.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getSubtotalItems();

	/**
	 * <p>Get subtotal amount of the payment system selected. This is total without taxes.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getSubtotalPaymentSystem();

	/**
	 * <p>Get subtotal amount of the shipping type selected. This is total without taxes.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getSubtotalShippings();

	/**
	 * <p>Get Total amount of the cart</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getTotal();

	/**
	 * <p>Get Total amount of applied discounts</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getTotalDiscounts();

	/**
	 * <p>Get total amount from the cart, this is a sum of total of cart items in cart.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getTotalItems();

	/**
	 * <p>Get total amount of the payment system selected.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getTotalPaymentSystem();

	/**
	 * <p>Get total amount of the shipping type selected.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getTotalShippings();

	/**
	 * <p>Get total taxes amount.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getTotalTaxes();

	/**
	 * <p>Get total amount of applied vouchers.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getTotalVouchers();

}
