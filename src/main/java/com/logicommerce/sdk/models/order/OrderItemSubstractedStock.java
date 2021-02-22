package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.PrevisionType;

public interface OrderItemSubstractedStock {

	Integer getId();
	
	int getQuantity();
	
	Integer getProductCombinationStockId();
	
	PrevisionType getPrevisionType();

}
