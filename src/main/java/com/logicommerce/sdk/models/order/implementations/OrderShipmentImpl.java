package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDate;
import java.util.List;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.models.order.OrderShipment;
import com.logicommerce.sdk.models.order.OrderShipmentItem;
import com.logicommerce.sdk.models.order.OrderShipmentStatus;
import com.logicommerce.sdk.models.order.OrderShipping;
import com.logicommerce.sdk.models.order.ShipmentAddress;
import com.logicommerce.utilities.annotations.NoMappable;
import com.logicommerce.utilities.annotations.Uses;

public class OrderShipmentImpl implements OrderShipment {

	private Integer id;

	private String pId;

	@NoMappable
	private String status;

	private int originWarehouseGroupId;

	@NoMappable
	@Uses(value = ShipmentAddressImpl.class)
	private ShipmentAddress originAddress;

	@NoMappable
	@Uses(value = ShipmentAddressImpl.class)
	private ShipmentAddress destinationAddress;

	private LocalDate incomingDate;

	private ExportStatusType exportStatus;

	@Uses(value = OrderShipmentItemImpl.class)
	private List<OrderShipmentItem> items;

	@Uses(value = OrderShipmentStatusImpl.class)
	private List<OrderShipmentStatus> statuses;
	
	@Uses(value = OrderShippingImpl.class)
	private OrderShipping shipping;

	private String hash;
	
	private String trackingNumber;
	
	private String documentNumber;
	
	private Integer substatus;

	public Integer getId() {
		return id;
	}

	public String getPId() {
		return pId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ShipmentAddress getOriginAddress() {
		return originAddress;
	}

	public ShipmentAddress getDestinationAddress() {
		return destinationAddress;
	}

	public LocalDate getIncomingDate() {
		return incomingDate;
	}

	public List<OrderShipmentItem> getItems() {
		return items;
	}

	public List<OrderShipmentStatus> getStatuses() {
		return statuses;
	}

	public OrderShipping getShipping() {
		return shipping;
	}

	public String getHash() {
		return hash;
	}

	public ExportStatusType getExportStatus() {
		return exportStatus;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPId(String pId) {
		this.pId = pId;
	}

	public void setIncomingDate(LocalDate incomingDate) {
		this.incomingDate = incomingDate;
	}

	public void setItems(List<OrderShipmentItem> items) {
		this.items = items;
	}

	public void setStatuses(List<OrderShipmentStatus> statuses) {
		this.statuses = statuses;
	}

	public void setShipping(OrderShipping shipping) {
		this.shipping = shipping;
	}

	public void setExportStatus(ExportStatusType exportStatus) {
		this.exportStatus = exportStatus;
	}

	public int getOriginWarehouseGroupId() {
		return originWarehouseGroupId;
	}

	public void setOriginWarehouseGroupId(int originWarehouseGroupId) {
		this.originWarehouseGroupId = originWarehouseGroupId;
	}

	public void setOriginAddress(ShipmentAddress originAddress) {
		this.originAddress = originAddress;
	}

	public void setDestinationAddress(ShipmentAddress destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	@Override
	public String getTrackingNumber() {
		return trackingNumber;
	}

	@Override
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	@Override
	public String getDocumentNumber() {
		return documentNumber;
	}

	@Override
	public Integer getSubstatus() {
		return substatus;
	}

	public void setSubstatus(Integer substatus) {
		this.substatus = substatus;
	}
}