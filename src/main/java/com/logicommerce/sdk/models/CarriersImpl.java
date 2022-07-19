package com.logicommerce.sdk.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>CarriersImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class CarriersImpl implements Carriers {

	private String propertyIdentifier;

	private List<Carrier> carriers;

	/**
	 * <p>Constructor for CarriersImpl.</p>
	 *
	 * @param propertyIdentifier a {@link java.lang.String} object
	 */
	public CarriersImpl(String propertyIdentifier) {
		this.propertyIdentifier = propertyIdentifier;
		this.carriers = new ArrayList<>();
	}

	/** {@inheritDoc} */
	@Override
	public String getPropertyIdentifier() {
		return propertyIdentifier;
	}

	/** {@inheritDoc} */
	@Override
	public List<Carrier> getCarriers() {
		return carriers;
	}
	
	/**
	 * <p>addCarrier.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param additionalData a {@link java.util.Map} object
	 */
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
