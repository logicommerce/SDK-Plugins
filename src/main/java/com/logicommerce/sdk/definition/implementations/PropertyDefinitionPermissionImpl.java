package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.PropertyDefinitionPermission;
import com.logicommerce.sdk.enums.PermissionType;

/**
 * <p>PropertyDefinitionPermissionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.1.1
 */
public class PropertyDefinitionPermissionImpl implements PropertyDefinitionPermission {

	private PermissionType permission;
	
	/** {@inheritDoc} */
	@Override
	public PermissionType getPermission() {
		return permission;
	}
	
	void setPermission(PermissionType permission) {
		this.permission = permission;
	}

	public static class Builder {

		private PropertyDefinitionImpl.Builder<?> parentBuilder;
		private PermissionType permission;

		Builder(PropertyDefinitionImpl.Builder<?> parentBuilder) {
			this.parentBuilder = parentBuilder;
			this.permission = PermissionType.ADMINISTRATOR_USER;
		}

		public Builder permission(PermissionType permission) {
			this.permission = permission;
			return this;
		}

		PropertyDefinitionPermission build() {
			PropertyDefinitionPermissionImpl properyDefinitionPermission = new PropertyDefinitionPermissionImpl();
			properyDefinitionPermission.setPermission(permission);
			return properyDefinitionPermission;
		}

		@SuppressWarnings("squid:S1452")
		public PropertyDefinitionImpl.Builder<?> done() {
			return parentBuilder;
		}
	}
}
