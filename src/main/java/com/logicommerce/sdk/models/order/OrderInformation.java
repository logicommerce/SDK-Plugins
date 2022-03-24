package com.logicommerce.sdk.models.order;

public interface OrderInformation {

	Integer getId();

	int getChannelId();

	String getTransactionId();

	String getAuthNumber();

	boolean isCommissionPaid();

	Integer getMarketplaceId();

}
