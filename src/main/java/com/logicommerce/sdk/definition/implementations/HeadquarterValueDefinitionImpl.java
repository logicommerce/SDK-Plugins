package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.HeadquarterValueDefinition;

/**
 * <p>HeadquarterValueDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class HeadquarterValueDefinitionImpl implements HeadquarterValueDefinition {

	private Integer id;
	
	/**
	 * <p>Constructor for HeadquarterValueDefinitionImpl.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public HeadquarterValueDefinitionImpl(Integer id) {
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


		public HeadquarterValueDefinition build() {
			return new HeadquarterValueDefinitionImpl(id);
		}
		
		public T done() {
			return parentBuilder;
		}

	}

}
