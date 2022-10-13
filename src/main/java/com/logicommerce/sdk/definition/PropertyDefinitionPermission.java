package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.PermissionType;

/**
 * <p>PropertyDefinitionPermission interface.</p>
 *
 * @author Logicommerce
 * @since 1.1.1
 */
public interface PropertyDefinitionPermission {

	/**
	 * <p>getPermissions: </p>
	 * <p> - LC_SUPER_ADMINISTRATOR_USER<br> - LC_ADMINISTRATOR_USER<br> - SUPER_ADMINISTRATOR_USER<br> - ADMINISTRATOR_USER </p>
	 * @return a {@link com.logicommerce.sdk.enums.PermissionType} object
	 */
	PermissionType getPermission();

}
