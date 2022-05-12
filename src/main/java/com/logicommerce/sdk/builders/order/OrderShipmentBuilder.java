package com.logicommerce.sdk.builders.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.builders.ShipmentAddressBuilder;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.models.order.OrderShipment;
import com.logicommerce.sdk.models.order.implementations.OrderShipmentImpl;

public class OrderShipmentBuilder<T> {

	private T parentBuilder;

	protected Integer id;

	protected String pId;

	protected String status;

	protected LocalDate incomingDate;

	protected List<OrderShipmentItemBuilder<OrderShipmentBuilder<T>>> items;

	protected List<OrderShipmentStatusBuilder<OrderShipmentBuilder<T>>> statuses;

	protected OrderShippingBuilder<OrderShipmentBuilder<T>> shipping;
	
	protected ShipmentAddressBuilder<OrderShipmentBuilder<T>> originAddress;

	protected ShipmentAddressBuilder<OrderShipmentBuilder<T>> destinationAddress;
	
	protected ExportStatusType exportStatusType;
	
	protected String trackingNumber;

	public OrderShipmentBuilder() {
		items = new ArrayList<>();
		statuses = new ArrayList<>();
		shipping = new OrderShippingBuilder<>(this);
		originAddress = new ShipmentAddressBuilder<>(this);
		destinationAddress = new ShipmentAddressBuilder<>(this);
		incomingDate = LocalDate.now();
		exportStatusType = ExportStatusType.PENDING_TO_SEND;
	}

	public OrderShipmentBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderShipmentBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderShipmentBuilder<T> pId(String pId) {
		this.pId = pId;
		return this;
	}

	public OrderShipmentBuilder<T> status(String status) {
		this.status = status;
		return this;
	}

	public OrderShipmentBuilder<T> incomingDate(LocalDate incomingDate) {
		this.incomingDate = incomingDate;
		return this;
	}
	
	public ShipmentAddressBuilder<OrderShipmentBuilder<T>> originAddress() {
		ShipmentAddressBuilder<OrderShipmentBuilder<T>> originAddress = new ShipmentAddressBuilder<>(this); 
		this.originAddress = originAddress;
		return originAddress;
	}
	
	public ShipmentAddressBuilder<OrderShipmentBuilder<T>> destinationAddress() {
		ShipmentAddressBuilder<OrderShipmentBuilder<T>> destinationAddress = new ShipmentAddressBuilder<>(this); 
		this.destinationAddress = destinationAddress;
		return destinationAddress;
	}

	public OrderShipmentItemBuilder<OrderShipmentBuilder<T>> item() {
		OrderShipmentItemBuilder<OrderShipmentBuilder<T>> item = new OrderShipmentItemBuilder<>(this);
		items.add(item);
		return item;
	}

	public OrderShipmentStatusBuilder<OrderShipmentBuilder<T>> status() {
		OrderShipmentStatusBuilder<OrderShipmentBuilder<T>> statusItem = new OrderShipmentStatusBuilder<>(this);
		statuses.add(statusItem);
		return statusItem;
	}
	
	public OrderShipmentBuilder<T> exportStatusType(ExportStatusType exportStatusType) {
		this.exportStatusType = exportStatusType;
		return this;
	}

	public OrderShippingBuilder<OrderShipmentBuilder<T>> shipping() {
		return shipping;
	}
	
	public OrderShipmentBuilder<T> trackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
		return this;
	}

	public OrderShipment build() {
		OrderShipmentImpl shipment = new OrderShipmentImpl();
		shipment.setId(null);
		shipment.setPId(pId);
		shipment.setStatus(status);
		shipment.setDestinationAddress(destinationAddress.build());
		shipment.setOriginAddress(originAddress.build());
		shipment.setIncomingDate(incomingDate);
		shipment.setItems(items.stream().map(OrderShipmentItemBuilder::build).collect(Collectors.toList()));
		shipment.setStatuses(statuses.stream().map(OrderShipmentStatusBuilder::build).collect(Collectors.toList()));
		shipment.setShipping(shipping.build());
		shipment.setExportStatus(exportStatusType);
		shipment.setTrackingNumber(trackingNumber);

		return shipment;
	}

	public T done() {
		return parentBuilder;
	}
}