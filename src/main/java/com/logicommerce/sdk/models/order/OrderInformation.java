package com.logicommerce.sdk.models.order;

public interface OrderInformation {

	Integer getId();

	int getChannelId();

	Integer getAffiliateId();

	String getTransactionId();

	String getAuthNumber();

	String getAffiliateCode();

	boolean isCommissionPaid();

	Integer getMarketplaceId();

}
