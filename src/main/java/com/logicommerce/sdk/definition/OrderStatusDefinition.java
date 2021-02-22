package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.OrderStatusType;

public interface OrderStatusDefinition {

	OrderStatusType getStatus();

	Integer getSubstatus();

}
