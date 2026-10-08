package com.logicommerce.sdk.services;

/**
 * <p>Interface to be able to react when the token of a basket is rotated.</p>
 *
 * <p>When a basket becomes authenticated (login, or registration that logs the customer in), the platform gives it a
 * new token. Plugins that keep records keyed by the basket token implement this service to update them. Every plugin
 * that provides this service is notified.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketTokenService extends PluginService {

	/**
	 * <p>This method is called after the token of a basket has been rotated.</p>
	 *
	 * <p>The basket and its plugin {@link com.logicommerce.sdk.resources.Storage Storage} already use the new token, and
	 * the previous token no longer resolves to the basket. It is called before {@link UserService#login()}, in the same
	 * request, so it must be fast. It is not called on logout or when the basket is replaced or regenerated.</p>
	 *
	 * <p>The tokens are the raw basket tokens, without the basket id suffix that
	 * {@link com.logicommerce.sdk.models.Cart#getToken() Cart.getToken()} adds. Tokens are credentials: never log them.
	 * Any exception thrown is logged and ignored.</p>
	 *
	 * @param previousToken the token the basket had before the rotation
	 * @param newToken the token the basket has from now on
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 * @since 2.8.5
	 */
	void tokenRotated(String previousToken, String newToken) throws PluginServiceException;

}
