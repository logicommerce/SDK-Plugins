package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.WarehouseValueDefinition;

public class WarehouseValueDefinitionImpl implements WarehouseValueDefinition {

	private Integer id;
	
	public WarehouseValueDefinitionImpl(Integer id) {
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


		public WarehouseValueDefinition build() {
			return new WarehouseValueDefinitionImpl(id);
		}
		
		public T done() {
			return parentBuilder;
		}

	}

}
