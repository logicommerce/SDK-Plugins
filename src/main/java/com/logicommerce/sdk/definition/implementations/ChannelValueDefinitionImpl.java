package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ChannelValueDefinition;

/**
 * <p>ChannelValueDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ChannelValueDefinitionImpl implements ChannelValueDefinition {

	private Integer id;
	
	/**
	 * <p>Constructor for ChannelValueDefinitionImpl.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public ChannelValueDefinitionImpl(Integer id) {
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


		public ChannelValueDefinition build() {
			return new ChannelValueDefinitionImpl(id);
		}
		
		public T done() {
			return parentBuilder;
		}

	}

}
