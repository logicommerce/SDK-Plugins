package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.BackorderMode;
import com.logicommerce.sdk.models.CustomTag;
import com.logicommerce.sdk.models.ProductCodes;

public interface OrderItem {

	Integer getId();

	String getPId();

	String getName();

	int getQuantity();

	OrderItemPrices getPrices();
	
	double getWeight();
	
	List<OrderDiscount> getDiscounts();

	List<OrderItemTax> getTaxes();

	List<OrderItemOption> getOptions();

	List<OrderItemStock> getStocks();

	List<CustomTag> getCustomTags();

	Integer getProductId();

	double getAffiliatePercentCommission();

	Integer getVinculatedTo();

	String getImage();

	boolean isSale();

	boolean isStockManagement();

	boolean isReverseChargeVat();

	ProductCodes getCodes();

	boolean isNoReturn();

	BackorderMode getBackOrder();

	boolean isOnRequest();

	int getOnRequestDays();

	String getLink();
}
