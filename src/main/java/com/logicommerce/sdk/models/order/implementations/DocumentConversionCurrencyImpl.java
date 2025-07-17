package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.DocumentConversionCurrency;

/**
 * <p>OrderCurrencyImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.5.0
 */
public class DocumentConversionCurrencyImpl extends OrderCurrencyBaseImpl implements DocumentConversionCurrency {

	private boolean defaultCurrency;

	/**
	 * <p>Getter for the field <code>defaultCurrency</code>.</p>
	 * 
	 * @return a boolean
	 */
	public boolean getDefaultCurrency() {
		return defaultCurrency;
	}

	/**
	 * <p>Setter for the field <code>defaultCurrency</code>.</p>
	 *
	 * @param defaultCurrency a boolean
	 */
	public void setDefaultCurrency(boolean defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}

}
