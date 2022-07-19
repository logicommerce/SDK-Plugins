package com.logicommerce.sdk.models.order;

/**
 * <p>OrderVoucher interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderVoucher {

	/**
	 * <p>getAvailableBalance.</p>
	 *
	 * @return a double
	 */
	double getAvailableBalance();

	/**
	 * <p>getCode.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCode();

	/**
	 * <p>isBalanceProcessed.</p>
	 *
	 * @return a boolean
	 */
	boolean isBalanceProcessed();

}
