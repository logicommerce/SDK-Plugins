package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.StatusCodeDefinition;

public class StatusCodeDefinitionImpl implements StatusCodeDefinition {

	private String code;
	private DefinitionLanguages languages;

	public StatusCodeDefinitionImpl(String code, DefinitionLanguages languages) {
		this.code = code;
		this.languages = languages;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public DefinitionLanguages getLanguages() {
		return languages;
	}
	
	public static class Builder {

		private ShipperDefinitionImpl.Builder parentBuilder;
		private String code;
		private DefinitionLanguagesImpl.Builder<Builder> languages;
		
		public Builder() {}
		
		public Builder(ShipperDefinitionImpl.Builder parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder code(String code) {
			this.code = code;
			return this;
		}

		public DefinitionLanguagesImpl.Builder<Builder> languages() {
			this.languages = new DefinitionLanguagesImpl.Builder<>(this);
			return languages;
		}

		public StatusCodeDefinition build() {
			return new StatusCodeDefinitionImpl(code, languages.build());
		}
		
		public ShipperDefinitionImpl.Builder done() {
			return parentBuilder;
		}

	}

}
