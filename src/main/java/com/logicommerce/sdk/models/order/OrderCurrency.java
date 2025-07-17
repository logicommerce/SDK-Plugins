package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.CurrencyMode;

/**
 * <p>OrderCurrency interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderCurrency extends OrderCurrencyBase {
	
	/**
	 * <p>getMode.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.CurrencyMode} object
	 */
	CurrencyMode getMode();

}
