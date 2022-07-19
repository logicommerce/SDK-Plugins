package com.logicommerce.sdk.models.order;

/**
 * <p>OrderItemPrices interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderItemPrices {

	/**
	 * <p>getProductPrice.</p>
	 *
	 * @return a double
	 */
	double getProductPrice();

	/**
	 * <p>getOptionsPrice.</p>
	 *
	 * @return a double
	 */
	double getOptionsPrice();

	/**
	 * <p>getPreviousPrice.</p>
	 *
	 * @return a double
	 */
	double getPreviousPrice();

	/**
	 * <p>getPrice.</p>
	 *
	 * @return a double
	 */
	double getPrice();

	/**
	 * <p>getTotalTaxes.</p>
	 *
	 * @return a double
	 */
	double getTotalTaxes();

	/**
	 * <p>getTotal.</p>
	 *
	 * @return a double
	 */
	double getTotal();

}
