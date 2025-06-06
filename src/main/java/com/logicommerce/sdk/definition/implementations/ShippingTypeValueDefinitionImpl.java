package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ShippingTypeValueDefinition;

/**
 * <p>ShippingTypeValueDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.4.2
 */
public class ShippingTypeValueDefinitionImpl implements ShippingTypeValueDefinition {

	private Integer id;

	/**
	 * <p>Constructor for ShippingTypeValueDefinitionImpl.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public ShippingTypeValueDefinitionImpl(Integer id) {
		this.id = id;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getId() {
		return id;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private Integer id;

		public Builder() {

		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> id(Integer id) {
			this.id = id;
			return this;
		}

		public ShippingTypeValueDefinition build() {
			return new ShippingTypeValueDefinitionImpl(id);
		}

		public T done() {
			return parentBuilder;
		}

	}

}
