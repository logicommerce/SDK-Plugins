package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ExternalShipperValueDefinition;

public class ExternalShipperValueDefinitionImpl implements ExternalShipperValueDefinition {

	private Integer id;
	
	public ExternalShipperValueDefinitionImpl(Integer id) {
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


		public ExternalShipperValueDefinition build() {
			return new ExternalShipperValueDefinitionImpl(id);
		}
		
		public T done() {
			return parentBuilder;
		}

	}

}
