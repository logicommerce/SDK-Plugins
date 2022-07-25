package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderInformation;
import com.logicommerce.sdk.models.order.implementations.OrderInformationImpl;

/**
 * <p>OrderInformationBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderInformationBuilder<T> {

	private T parentBuilder;

	protected Integer id;

	protected int channelId;

	protected String transactionId;

	protected String authNumber;

	protected Integer marketplaceId;

	/**
	 * <p>Constructor for OrderInformationBuilder.</p>
	 */
	public OrderInformationBuilder() {

	}

	/**
	 * <p>Constructor for OrderInformationBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderInformationBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderInformationBuilder} object
	 */
	public OrderInformationBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>channelId.</p>
	 *
	 * @param channelId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderInformationBuilder} object
	 */
	public OrderInformationBuilder<T> channelId(int channelId) {
		this.channelId = channelId;
		return this;
	}

	/**
	 * <p>transactionId.</p>
	 *
	 * @param transactionId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderInformationBuilder} object
	 */
	public OrderInformationBuilder<T> transactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}

	/**
	 * <p>authNumber.</p>
	 *
	 * @param authNumber a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderInformationBuilder} object
	 */
	public OrderInformationBuilder<T> authNumber(String authNumber) {
		this.authNumber = authNumber;
		return this;
	}

	/**
	 * <p>marketplaceId.</p>
	 *
	 * @param marketplaceId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderInformationBuilder} object
	 */
	public OrderInformationBuilder<T> marketplaceId(Integer marketplaceId) {
		this.marketplaceId = marketplaceId;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderInformation} object
	 */
	public OrderInformation build() {
		OrderInformationImpl information = new OrderInformationImpl();
		information.setId(null);
		information.setChannelId(channelId);
		information.setTransactionId(transactionId);
		information.setAuthNumber(authNumber);
		information.setMarketplaceId(marketplaceId);
		return information;
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
