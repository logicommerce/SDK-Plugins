package com.logicommerce.sdk.models.order;

import java.time.LocalDate;
import java.util.List;
import com.logicommerce.sdk.enums.ExportStatusType;

public interface OrderShipment {

	Integer getId();

	String getPId();

	String getStatus();

	void setStatus(String status);

	ShipmentAddress getOriginAddress();

	ShipmentAddress getDestinationAddress();

	LocalDate getIncomingDate();

	List<OrderShipmentItem> getItems();

	List<OrderShipmentStatus> getStatuses();

	OrderShipping getShipping();

	ExportStatusType getExportStatus();

	String getHash();

}
