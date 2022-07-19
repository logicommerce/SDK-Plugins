package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderVoucher;

/**
 * <p>OrderVoucherImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderVoucherImpl implements OrderVoucher {
	
	private double availableBalance;

	private String code;

	private boolean balanceProcessed;

	/**
	 * <p>Getter for the field <code>availableBalance</code>.</p>
	 *
	 * @return a double
	 */
	public double getAvailableBalance() {
		return availableBalance;
	}

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <p>isBalanceProcessed.</p>
	 *
	 * @return a boolean
	 */
	public boolean isBalanceProcessed() {
		return balanceProcessed;
	}

	/**
	 * <p>Setter for the field <code>availableBalance</code>.</p>
	 *
	 * @param availableBalance a double
	 */
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Setter for the field <code>balanceProcessed</code>.</p>
	 *
	 * @param balanceProcessed a boolean
	 */
	public void setBalanceProcessed(boolean balanceProcessed) {
		this.balanceProcessed = balanceProcessed;
	}
}
