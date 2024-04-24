package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.builders.LocationBuilder;
import com.logicommerce.sdk.models.order.DocumentProviderPickupPoint;
import com.logicommerce.sdk.models.order.implementations.DocumentProviderPickupPointImpl;

/**
 * <p>OrderDeliveryPhysicalLocationBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.3.8
 */
public class DocumentProviderPickupPointBuilder<T> {

	private T parentBuilder;

	private String key;

	private String name;

	private String email;

	private String city;

	private String postalCode;

	private String address;

	private String addressAdditionalInformation;

	private String number;

	private String phone;

	private String mobile;

	protected LocationBuilder<DocumentProviderPickupPointBuilder<T>> location;
	
	/**
	 * <p>Constructor for OrderDeliveryPhysicalLocationBuilder.</p>
	 */
	public DocumentProviderPickupPointBuilder() {
		location = new LocationBuilder<>(this);
	}
	
	/**
	 * <p>Constructor for OrderDeliveryPhysicalLocationBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public DocumentProviderPickupPointBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>key.</p>
	 *
	 * @param key a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentProviderPickupPointBuilder} object
	 */
	public DocumentProviderPickupPointBuilder<T> key(String key) {
		this.key = key;
		return this;
	}
		
	/**
	 * <p>email.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentProviderPickupPointBuilder} object
	 */
	public DocumentProviderPickupPointBuilder<T> email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * <p>email.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentProviderPickupPointBuilder} object
	 */
	public DocumentProviderPickupPointBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>address.</p>
	 *
	 * @param address a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentProviderPickupPointBuilder} object
	 */
	public DocumentProviderPickupPointBuilder<T> address(String address) {
		this.address = address;
		return this;
	}
	
	/**
	 * <p>city.</p>
	 *
	 * @param city a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentProviderPickupPointBuilder} object
	 */
	public DocumentProviderPickupPointBuilder<T> city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * <p>postalCode.</p>
	 *
	 * @param postalCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentProviderPickupPointBuilder} object
	 */
	public DocumentProviderPickupPointBuilder<T> postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * <p>location.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.LocationBuilder} object
	 */
	public LocationBuilder<DocumentProviderPickupPointBuilder<T>> location() {
		return location;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation} object
	 */
	public DocumentProviderPickupPoint build() {
		DocumentProviderPickupPointImpl documentProviderPickupPoint = new DocumentProviderPickupPointImpl();
		documentProviderPickupPoint.setKey(key);
		documentProviderPickupPoint.setEmail(email);
		documentProviderPickupPoint.setName(name);
		documentProviderPickupPoint.setAddress(address);
		documentProviderPickupPoint.setAddressAdditionalInformation(addressAdditionalInformation);
		documentProviderPickupPoint.setCity(city);
		documentProviderPickupPoint.setPostalCode(postalCode);
		documentProviderPickupPoint.setPhone(phone);
		documentProviderPickupPoint.setMobile(mobile);
		documentProviderPickupPoint.setNumber(number);
		documentProviderPickupPoint.setLocation(location.build());		
		return documentProviderPickupPoint;
	}
	
	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
