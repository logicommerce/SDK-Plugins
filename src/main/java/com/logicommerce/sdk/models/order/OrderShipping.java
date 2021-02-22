package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.ShippingCalculation;
import com.logicommerce.sdk.models.ElementProperty;

public interface OrderShipping {

	Integer getId();

	int getShippingTypeId();

	String getName();
	
	boolean isCashOnDelivery();

	Double getPrice();

	String getShippingTypeName();

	Integer getShippingSectionId();

	ShippingCalculation getShippingCalculation();

	String getShipperPId();

	String getShippingTypePId();

	List<OrderItemTax> getTaxes();

	List<OrderDiscount> getDiscounts();

	OrderShippingTracking getTracking();

	void setTracking(OrderShippingTracking tracking);

	List<ElementProperty> getProperties();

	void addProperty(ElementProperty property);

	void addProperty(String name, String value);

}
