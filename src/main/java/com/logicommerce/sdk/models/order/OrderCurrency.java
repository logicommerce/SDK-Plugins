package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.CurrencyMode;

/**
 * <p>OrderCurrency interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderCurrency {
	
	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();
	
	/**
	 * <p>getMode.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.CurrencyMode} object
	 */
	CurrencyMode getMode();
	
	/**
	 * <p>getCurrencyId.</p>
	 *
	 * @return a int
	 */
	int getCurrencyId();
	
	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();
	
	/**
	 * <p>getCode.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCode();
	
	/**
	 * <p>getCodeNumber.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCodeNumber();
	
	/**
	 * <p>getSymbol.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getSymbol();
	
	/**
	 * <p>getUsdValue.</p>
	 *
	 * @return a double
	 */
	double getUsdValue();

}
