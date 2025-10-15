package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.OauthStatusType;

/**
 * <p>OauthUser interface.</p>
 *
 * @author Logicommerce
 * @since 2.6.1
 */
public interface OauthResponse {


	/**
	 * <p>getOauthUser.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.OauthUser} object
	 */
	OauthUser getOauthUser();

	/**
	 * <p>getStatus.</p>
	 *
	 * @return a {@link java.lang.Boolean} object
	 */
	boolean getStatus();

	/**
	 * <p>getStatusType.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	OauthStatusType getStatusType();

	/**
	 * <p>getMessage.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getMessage();

}
