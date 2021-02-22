package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderBaseStatus<T> {

	Integer getId();

	List<OrderStatusAction> getActions();

	LocalDateTime getCurrentDateTime();
	
	T getStatus();

	int getSubstatusId();

}
