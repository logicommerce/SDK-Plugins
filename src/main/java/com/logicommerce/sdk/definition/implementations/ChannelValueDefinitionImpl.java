package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ChannelValueDefinition;

public class ChannelValueDefinitionImpl implements ChannelValueDefinition {

	private Integer id;
	
	public ChannelValueDefinitionImpl(Integer id) {
		this.id = id;
	}

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
