package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ExternalShipperValueDefinition;

/**
 * <p>ExternalShipperValueDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ExternalShipperValueDefinitionImpl implements ExternalShipperValueDefinition {

	private String id;
	
	/**
	 * <p>Constructor for ExternalShipperValueDefinitionImpl.</p>
	 *
	 * @param id a {@link java.lang.String} object
	 */
	public ExternalShipperValueDefinitionImpl(String id) {
		this.id = id;
	}

	/** {@inheritDoc} */
	@Override
	public String getId() {
		return id;
	}
	
	public static class Builder<T> {

		private T parentBuilder;
		private String id;

		public Builder() {

		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> id(String id) {
			this.id = id;
			return this;
		}


		public ExternalShipperValueDefinition build() {
			return new ExternalShipperValueDefinitionImpl(id);
		}
		
		public T done() {
			return parentBuilder;
		}

	}

}
