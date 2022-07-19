package com.logicommerce.sdk.builders.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.builders.ShipmentAddressBuilder;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.models.order.OrderShipment;
import com.logicommerce.sdk.models.order.implementations.OrderShipmentImpl;

/**
 * <p>OrderShipmentBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	protected Integer substatus;

	/**
	 * <p>Constructor for OrderShipmentBuilder.</p>
	 */
	public OrderShipmentBuilder() {
		items = new ArrayList<>();
		statuses = new ArrayList<>();
		shipping = new OrderShippingBuilder<>(this);
		originAddress = new ShipmentAddressBuilder<>(this);
		destinationAddress = new ShipmentAddressBuilder<>(this);
		incomingDate = LocalDate.now();
		exportStatusType = ExportStatusType.PENDING_TO_SEND;
		substatus = 0;
	}

	/**
	 * <p>Constructor for OrderShipmentBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderShipmentBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentBuilder} object
	 */
	public OrderShipmentBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>pId.</p>
	 *
	 * @param pId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentBuilder} object
	 */
	public OrderShipmentBuilder<T> pId(String pId) {
		this.pId = pId;
		return this;
	}

	/**
	 * <p>status.</p>
	 *
	 * @param status a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentBuilder} object
	 */
	public OrderShipmentBuilder<T> status(String status) {
		this.status = status;
		return this;
	}


	/**
	 * <p>status.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentStatusBuilder} object
	 */
	public OrderShipmentStatusBuilder<OrderShipmentBuilder<T>> status() {
		OrderShipmentStatusBuilder<OrderShipmentBuilder<T>> statusItem = new OrderShipmentStatusBuilder<>(this);
		statuses.add(statusItem);
		return statusItem;
	}

	public OrderShipmentBuilder<T> incomingDate(LocalDate incomingDate) {
		this.incomingDate = incomingDate;
		return this;
	}

	/**
	 * <p>originAddress.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<OrderShipmentBuilder<T>> originAddress() {
		ShipmentAddressBuilder<OrderShipmentBuilder<T>> address = new ShipmentAddressBuilder<>(this);
		this.originAddress = address;
		return address;
	}

	/**
	 * <p>destinationAddress.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.ShipmentAddressBuilder} object
	 */
	public ShipmentAddressBuilder<OrderShipmentBuilder<T>> destinationAddress() {
		ShipmentAddressBuilder<OrderShipmentBuilder<T>> address = new ShipmentAddressBuilder<>(this);
		this.destinationAddress = address;
		return address;
	}

	/**
	 * <p>item.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentItemBuilder} object
	 */
	public OrderShipmentItemBuilder<OrderShipmentBuilder<T>> item() {
		OrderShipmentItemBuilder<OrderShipmentBuilder<T>> item = new OrderShipmentItemBuilder<>(this);
		items.add(item);
		return item;
	}

	/**
	 * <p>exportStatusType.</p>
	 *
	 * @param exportStatusType a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentBuilder} object
	 */
	public OrderShipmentBuilder<T> exportStatusType(ExportStatusType exportStatusType) {
		this.exportStatusType = exportStatusType;
		return this;
	}

	/**
	 * <p>shipping.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<OrderShipmentBuilder<T>> shipping() {
		return shipping;
	}

	/**
	 * <p>trackingNumber.</p>
	 *
	 * @param trackingNumber a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentBuilder} object
	 */
	public OrderShipmentBuilder<T> trackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
		return this;
	}

	/**
	 * <p>substatus.</p>
	 *
	 * @param substatus a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentBuilder} object
	 */
	public OrderShipmentBuilder<T> substatus(Integer substatus) {
		this.substatus = substatus;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShipment} object
	 */
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
		shipment.setSubstatus(substatus);
		return shipment;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
