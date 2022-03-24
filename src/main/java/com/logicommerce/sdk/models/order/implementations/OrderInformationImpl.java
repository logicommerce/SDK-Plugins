package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderInformation;

public class OrderInformationImpl implements OrderInformation {

	private Integer id;

	private int channelId;

	private String transactionId;

	private String authNumber;

	private Integer marketplaceId;

	private boolean commissionPaid;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public int getChannelId() {
		return channelId;
	}

	@Override
	public String getTransactionId() {
		return transactionId;
	}

	@Override
	public String getAuthNumber() {
		return authNumber;
	}

	@Override
	public Integer getMarketplaceId() {
		return marketplaceId;
	}

	@Override
	public boolean isCommissionPaid() {
		return commissionPaid;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public void setAuthNumber(String authNumber) {
		this.authNumber = authNumber;
	}

	public void setMarketplaceId(Integer marketplaceId) {
		this.marketplaceId = marketplaceId;
	}

	public void setCommissionPaid(boolean commissionPaid) {
		this.commissionPaid = commissionPaid;
	}
}