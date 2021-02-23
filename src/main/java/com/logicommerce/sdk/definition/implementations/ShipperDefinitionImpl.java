package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.definition.ShipperDefinition;
import com.logicommerce.sdk.definition.StatusCodeDefinition;

public class ShipperDefinitionImpl extends ConnectorDefinitionImpl implements ShipperDefinition {

	private List<StatusCodeDefinition> statusCodes;

	@Override
	public List<StatusCodeDefinition> getStatusCodes() {
		return statusCodes;
	}

	@Override
	public void setStatusCodes(List<StatusCodeDefinition> statusCodes) {
		this.statusCodes = statusCodes;
	}
	
	public static class Builder extends ConnectorDefinitionImpl.Builder<Builder, ShipperDefinition, ShipperDefinitionImpl> {
		
		private List<StatusCodeDefinitionImpl.Builder> statusCodes;
		
		public Builder() {
			super();
			statusCodes = new ArrayList<>();
		}
		
		public StatusCodeDefinitionImpl.Builder statusCode() {
			StatusCodeDefinitionImpl.Builder statusCode = new StatusCodeDefinitionImpl.Builder(returnThis());
			statusCodes.add(statusCode );
			return statusCode;
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		public ShipperDefinition build() {
			ShipperDefinitionImpl connector = new ShipperDefinitionImpl();
			connector.setStatusCodes(statusCodes.stream().map(StatusCodeDefinitionImpl.Builder::build).collect(Collectors.toList()));
			setAttributes(connector);
			return connector;
		}
		
	}

}
