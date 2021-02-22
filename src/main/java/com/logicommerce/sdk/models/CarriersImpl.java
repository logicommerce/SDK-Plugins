package com.logicommerce.sdk.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarriersImpl implements Carriers {

	private String propertyIdentifier;

	private List<Carrier> carriers;

	public CarriersImpl(String propertyIdentifier) {
		this.propertyIdentifier = propertyIdentifier;
		this.carriers = new ArrayList<>();
	}

	@Override
	public String getPropertyIdentifier() {
		return propertyIdentifier;
	}

	@Override
	public List<Carrier> getCarriers() {
		return carriers;
	}
	
	public void addCarrier(String name, Map<String, String> additionalData) {
		carriers.add(getCarrier(name, additionalData));
	}

	private Carrier getCarrier(String name, Map<String, String> additionalData) {
		return new Carrier() {

			@Override
			public String getName() {
				return name;
			}
			
			@Override
			public Map<String, String> getAdditionalData() {
				return additionalData;
			}
		};
	}
	

}
