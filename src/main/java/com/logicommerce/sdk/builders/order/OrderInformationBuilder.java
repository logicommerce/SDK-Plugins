package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderInformation;
import com.logicommerce.sdk.models.order.implementations.OrderInformationImpl;

public class OrderInformationBuilder<T> {

	private T parentBuilder;

	protected Integer id;

	protected int channelId;

	protected String transactionId;

	protected String authNumber;

	protected Integer marketplaceId;

	public OrderInformationBuilder() {

	}

	public OrderInformationBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderInformationBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderInformationBuilder<T> channelId(int channelId) {
		this.channelId = channelId;
		return this;
	}

	public OrderInformationBuilder<T> transactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}

	public OrderInformationBuilder<T> authNumber(String authNumber) {
		this.authNumber = authNumber;
		return this;
	}

	public OrderInformationBuilder<T> marketplaceId(Integer marketplaceId) {
		this.marketplaceId = marketplaceId;
		return this;
	}

	public OrderInformation build() {
		OrderInformationImpl information = new OrderInformationImpl();
		information.setId(null);
		information.setChannelId(channelId);
		information.setTransactionId(transactionId);
		information.setAuthNumber(authNumber);
		information.setMarketplaceId(marketplaceId);
		return information;
	}

	public T done() {
		return parentBuilder;
	}
}