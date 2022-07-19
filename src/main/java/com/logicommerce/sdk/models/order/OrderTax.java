package com.logicommerce.sdk.models.order;

/**
 * <p>OrderTax interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderTax {

	/**
	 * <p>getTaxRate.</p>
	 *
	 * @return a double
	 */
	double getTaxRate();

	/**
	 * <p>getReRate.</p>
	 *
	 * @return a double
	 */
	double getReRate();

	/**
	 * <p>getBase.</p>
	 *
	 * @return a double
	 */
	double getBase();

	/**
	 * <p>getTaxPrice.</p>
	 *
	 * @return a double
	 */
	double getTaxPrice();

	/**
	 * <p>getRePrice.</p>
	 *
	 * @return a double
	 */
	double getRePrice();

	/**
	 * <p>getTotalPrice.</p>
	 *
	 * @return a double
	 */
	double getTotalPrice();

	/**
	 * <p>getBaseWithoutDiscounts.</p>
	 *
	 * @return a double
	 */
	double getBaseWithoutDiscounts();

	/**
	 * <p>getDiscount.</p>
	 *
	 * @return a double
	 */
	double getDiscount();

}
