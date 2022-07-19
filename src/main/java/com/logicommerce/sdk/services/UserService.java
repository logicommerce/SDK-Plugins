package com.logicommerce.sdk.services;

/**
 * <p>UserService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface UserService extends PluginService {

	/**
	 * <p>upsert.</p>
	 *
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void upsert() throws PluginServiceException;

	/**
	 * <p>delete.</p>
	 *
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void delete() throws PluginServiceException;

	/**
	 * <p>login.</p>
	 *
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void login() throws PluginServiceException;

	/**
	 * <p>logout.</p>
	 *
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void logout() throws PluginServiceException;

}
