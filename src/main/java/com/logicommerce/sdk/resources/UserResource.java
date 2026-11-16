package com.logicommerce.sdk.resources;

import com.logicommerce.sdk.models.user.RegisteredUser;

/**
 * <p>Resource to read the registered users of the commerce.</p>
 *
 * <p>A registered user is a person identified by an email. The same registered user can belong to several accounts
 * (for example, as an employee of several company accounts), so the returned {@link RegisteredUser} lists all its
 * {@link RegisteredUser#getAccounts() accounts} and the caller decides which one to use.</p>
 *
 * <p>The {@link com.logicommerce.sdk.models.user.RegisteredUserAccount#getAccountId() account id} is the
 * {@link com.logicommerce.sdk.models.order.list.OrderListParam#getUserId() user id} that lists the orders of that account
 * with {@link OrderResource}. {@link RMAResource} and {@link ShipmentResource} look for documents by the
 * {@link RegisteredUser#getEmail() email} instead.</p>
 *
 * <pre>
 * &#64;Resource
 * private UserResource userResource;
 * </pre>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public interface UserResource {

	/**
	 * Returns the registered user with the given email. Blanks around the email are ignored.
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.user.RegisteredUser} object, or null when the email is null or
	 *         blank or no registered user has it
	 * @throws PluginResourceException if the registered user cannot be read
	 */
	RegisteredUser getUser(String email) throws PluginResourceException;

}
