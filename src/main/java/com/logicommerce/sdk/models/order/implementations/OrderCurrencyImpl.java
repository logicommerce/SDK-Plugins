package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.CurrencyMode;
import com.logicommerce.sdk.models.order.OrderCurrency;

/**
 * <p>OrderCurrencyImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderCurrencyImpl extends OrderCurrencyBaseImpl implements OrderCurrency {

	private CurrencyMode mode;

	/**
	 * <p>Getter for the field <code>mode</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.CurrencyMode} object
	 */
	public CurrencyMode getMode() {
		return mode;
	}

	/**
	 * <p>Setter for the field <code>mode</code>.</p>
	 *
	 * @param mode a {@link com.logicommerce.sdk.enums.CurrencyMode} object
	 */
	public void setMode(CurrencyMode mode) {
		this.mode = mode;
	}

}
