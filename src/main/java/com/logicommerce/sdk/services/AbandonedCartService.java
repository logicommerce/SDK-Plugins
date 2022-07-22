package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.Cart;

/**
 * Interface to be able to implement the abandoned cart service.<br><br>
 * Convert the abandoned carts to sales by sending timed email<br>
 * after they abandoned the shopping cart.
 *
 * @author	Logicommerce
 * @since	1.0.18
 */
public interface AbandonedCartService extends PluginService {

	/**
	 * <p>This method is called when a cart is abandoned.</p>
	 *
	 * @param 	cart a {@link com.logicommerce.sdk.models.Cart Cart} object
	 * @see		com.logicommerce.sdk.models.Cart Cart
	 * @since 	1.0.18
	 * @throws 	com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void abandon(Cart cart) throws PluginServiceException;

	/**
	 * <p>This method is called when a abandoned cart is recovered.</p>
	 *
	 * @param 	cart a {@link com.logicommerce.sdk.models.Cart Cart} object
	 * @see		com.logicommerce.sdk.models.Cart Cart
	 * @since 	1.0.18
	 * @throws 	com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void recover(Cart cart) throws PluginServiceException;

	/**
	 * <p>This method is called when a abandoned cart is finally removed.</p>
	 *
	 * @param 	cart a {@link com.logicommerce.sdk.models.Cart Cart} object
	 * @see		com.logicommerce.sdk.models.Cart Cart
	 * @since 	1.0.18
	 * @throws 	com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void remove(Cart cart) throws PluginServiceException;

}
