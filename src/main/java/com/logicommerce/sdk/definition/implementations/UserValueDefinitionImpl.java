package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.UserValueDefinition;

public class UserValueDefinitionImpl implements UserValueDefinition {

	private Integer id;
	
	public UserValueDefinitionImpl(Integer id) {
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


		public UserValueDefinition build() {
			return new UserValueDefinitionImpl(id);
		}
		
		public T done() {
			return parentBuilder;
		}

	}

}