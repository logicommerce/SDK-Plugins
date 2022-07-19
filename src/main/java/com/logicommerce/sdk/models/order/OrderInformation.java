package com.logicommerce.sdk.models.order;

/**
 * <p>OrderInformation interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderInformation {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getChannelId.</p>
	 *
	 * @return a int
	 */
	int getChannelId();

	/**
	 * <p>getTransactionId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getTransactionId();

	/**
	 * <p>getAuthNumber.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getAuthNumber();

	/**
	 * <p>getMarketplaceId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getMarketplaceId();

}
