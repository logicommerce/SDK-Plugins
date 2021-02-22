package com.logicommerce.sdk.models.order;

import java.time.LocalDate;
import java.util.List;
import com.logicommerce.sdk.enums.PrevisionType;

public interface OrderItemStock {

	Integer getId();
	
	Integer getWarehouseId();
	
	Integer getWarehouseGroupId();

	int getQuantity();
	
	int getReservedQuantity();
	
	LocalDate getIncomingDate();

	int getOffsetDays();

	int getPriority();
	
	String getHash();
	
	PrevisionType getPrevisionType();
	
	List<OrderItemSubstractedStock> getSubstractedStocks();

}
