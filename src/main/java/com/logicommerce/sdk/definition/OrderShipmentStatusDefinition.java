package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.OrderShipmentStatusType;

public interface OrderShipmentStatusDefinition {

	OrderShipmentStatusType getStatus();

	Integer getSubstatus();

}
