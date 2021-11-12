package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.HeadquarterValueDefinition;

public class HeadquarterValueDefinitionImpl implements HeadquarterValueDefinition {

	private Integer id;
	
	public HeadquarterValueDefinitionImpl(Integer id) {
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


		public HeadquarterValueDefinition build() {
			return new HeadquarterValueDefinitionImpl(id);
		}
		
		public T done() {
			return parentBuilder;
		}

	}

}
