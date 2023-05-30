package com.logicommerce.sdk.models.order;

/**
 * <p>OrderItemTax interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderItemTax {

	/**
	 * <p>getBase.</p>
	 *
	 * @return a double
	 */
	double getBase();

	/**
	 * <p>getTaxValue.</p>
	 *
	 * @return a double
	 */
	double getTaxValue();

	/**
	 * <p>getTaxValue.</p>
	 *
	 * @return a double
	 */
	double getTaxRate();

}
