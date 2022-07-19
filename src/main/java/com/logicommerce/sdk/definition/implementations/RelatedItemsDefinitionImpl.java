package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.definition.RelatedItemsDefinition;

/**
 * <p>RelatedItemsDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class RelatedItemsDefinitionImpl extends ConnectorDefinitionImpl implements RelatedItemsDefinition {

	private List<String> allowedTypes;

	/** {@inheritDoc} */
	@Override
	public List<String> getAllowedTypes() {
		return allowedTypes;
	}

	/**
	 * <p>Setter for the field <code>allowedTypes</code>.</p>
	 *
	 * @param allowedTypes a {@link java.util.List} object
	 */
	public void setAllowedTypes(List<String> allowedTypes) {
		this.allowedTypes = allowedTypes;
	}

	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, RelatedItemsDefinition, RelatedItemsDefinitionImpl> {

		private List<String> allowedTypes;

		public Builder() {
			super();
			allowedTypes = new ArrayList<>();
		}

		public Builder addAllowedType(String allowedType) {
			allowedTypes.add(allowedType);
			return returnThis();
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public RelatedItemsDefinition build() {
			RelatedItemsDefinitionImpl connector = new RelatedItemsDefinitionImpl();
			setAttributes(connector);
			return connector;
		}

	}

}
