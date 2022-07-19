package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ShipperValueDefinition;

/**
 * <p>ShipperValueDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ShipperValueDefinitionImpl implements ShipperValueDefinition {

	private Integer id;
	
	/**
	 * <p>Constructor for ShipperValueDefinitionImpl.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public ShipperValueDefinitionImpl(Integer id) {
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


		public ShipperValueDefinition build() {
			return new ShipperValueDefinitionImpl(id);
		}
		
		public T done() {
			return parentBuilder;
		}

	}

}
