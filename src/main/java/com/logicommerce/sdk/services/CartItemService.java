package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.CartItem;

/**
 * <p>CartItemService interface. To Implement methods actions for a cartItem calls</p>
 *
 * @see		com.logicommerce.sdk.models.CartItem CartIem
 * @see		com.logicommerce.sdk.models.Cart Cart
 * @author 	Logicommerce
 * @since 	1.0.16
 */
public interface CartItemService extends PluginService {

	/**
	 * <p>To define some action when an item is added to the cart.</p>
	 * <p>This method is called when cart has an add item action.</p>
	 *
	 * @param 	item a {@link com.logicommerce.sdk.models.CartItem CartItem} object
	 * @see		com.logicommerce.sdk.models.CartItem CartItem
	 * @since 	1.0.16
	 * @throws 	com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void addItem(CartItem item) throws PluginServiceException;

	/**
	 * <p>To define some action when an item is updated.</p>
	 * <p>This method is called when cart has an update item action.</p>
	 * 
	 * @param 	item a {@link com.logicommerce.sdk.models.CartItem CartItem} object
	 * @see		com.logicommerce.sdk.models.CartItem CartItem
	 * @since 	1.0.16
	 * @throws 	com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void updateItem(CartItem item) throws PluginServiceException;

	/**
	 * <p>To define some action when some items are added to the cart in one time.</p>
	 * <p>This method is called when cart has an add items action.</p>
	 *
	 * @param items a {@link java.util.List List}<{@link com.logicommerce.sdk.models.CartItem CartItem}> object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void addItems(List<CartItem> items) throws PluginServiceException;

	/**
	 * <p>To define some action when some items are updated.</p>
	 * <p>This method is called when cart has an update items action.</p>
	 *
	 * @param items a {@link java.util.List List}<{@link com.logicommerce.sdk.models.CartItem CartItem}> object
	 * @see		com.logicommerce.sdk.models.CartItem CartItem
	 * @since 	1.0.16
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void updateItems(List<CartItem> items) throws PluginServiceException;

	/**
	 * <p>To define some action when an item is deleted from the cart.</p>
	 * <p>This method is called when cart has an delete item action.</p>
	 *
	 * @param itemHash a {@link java.lang.String String} object, item identificator hash
	 * @see		String
	 * @since 	1.0.16
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void deleteItem(String itemHash) throws PluginServiceException;

}
