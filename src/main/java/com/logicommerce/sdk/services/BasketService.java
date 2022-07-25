package com.logicommerce.sdk.services;

/**
 * <p>BasketService interface. Interface to be able to implement the basket service.<br>
 * 	Once implemented, it allows execute some action when calculate or delete calls.</p>
 *
 * @author 	Logicommerce
 * @see		com.logicommerce.sdk.models.Cart Cart
 * @since 	1.0.16
 */
public interface BasketService extends PluginService {

	/**
	 * <p>For define some action when calculate basket call.</p>
	 * <p>This method is called when basket has a calculate action.</p>
	 * <p>It does not receive any parameters because the cart is accessible through a resource.</p>
	 * <pre>@{@link com.logicommerce.sdk.Resource Resource} {@link com.logicommerce.sdk.models.Cart Cart}</pre>
	 *
	 * @see		com.logicommerce.sdk.models.Cart Cart
	 * @throws 	com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void calculate() throws PluginServiceException;

	/**
	 * <p>addItem.</p>
	 * @since	1.0.16
	 * @param itemHash a {@link java.lang.String} object
	 * @param quantity a {@link java.lang.Integer} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	@Deprecated
	void addItem(String itemHash, Integer quantity) throws PluginServiceException;

	/**
	 * <p>updateItem.</p>
	 *
	 * @param itemHash a {@link java.lang.String} object
	 * @param quantity a {@link java.lang.Integer} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	@Deprecated
	void updateItem(String itemHash, Integer quantity) throws PluginServiceException;

	/**
	 * <p>deleteItem.</p>
	 *
	 * @param itemHash a {@link java.lang.String} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	@Deprecated
	void deleteItem(String itemHash) throws PluginServiceException;

	/**
	 * <p>For define some action when clear basket call.</p>
	 * <p>This method is called when basket has a clear action.</p>
	 *
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void clear() throws PluginServiceException;

}
