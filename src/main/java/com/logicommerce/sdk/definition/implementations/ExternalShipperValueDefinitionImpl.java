package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.ExternalShipperValueDefinition;

public class ExternalShipperValueDefinitionImpl implements ExternalShipperValueDefinition {

	private String id;
	
	public ExternalShipperValueDefinitionImpl(String id) {
		this.id = id;
	}

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
