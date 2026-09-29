package com.logicommerce.sdk.services;

/**
 * <p>Interface to be able to react when the token of a basket is rotated.</p>
 *
 * <p>When a basket becomes authenticated (login, registration that logs the customer in, or a login that is pending the
 * choice of an account), the platform gives it a new token so that a token known before the login can no longer reach
 * the authenticated session. Plugins that keep their own records keyed by the basket token implement this service to
 * point those records to the new token.</p>
 *
 * <p>Every plugin that provides this service is notified, not only the first one.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketTokenService extends PluginService {

	/**
	 * <p>This method is called after the token of a basket has been rotated.</p>
	 *
	 * <p>When it runs, the platform has already moved the basket, the plugin
	 * {@link com.logicommerce.sdk.resources.Storage Storage} of the basket, its locked stock and its product comparison to
	 * the new token, and the previous token no longer resolves to the basket. It is called before
	 * {@link UserService#login()}, inside the same request, so it must be fast. It is not called on logout, when the
	 * basket is replaced by another basket of the same user, or when the basket is regenerated.</p>
	 *
	 * <p>The tokens are the raw basket tokens, not the external cart identifier returned by
	 * {@link com.logicommerce.sdk.models.Cart#getToken() Cart.getToken()}, which also includes the basket id. Tokens are
	 * credentials: never log them. A {@link com.logicommerce.sdk.models.Cart Cart} injected into the plugin is a snapshot
	 * taken when the plugin was loaded for the request.</p>
	 *
	 * <p>Any exception thrown is logged and ignored: the login is not interrupted.</p>
	 *
	 * @param previousToken the token the basket had before the rotation
	 * @param newToken the token the basket has from now on
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 * @since 2.8.5
	 */
	void tokenRotated(String previousToken, String newToken) throws PluginServiceException;

}
