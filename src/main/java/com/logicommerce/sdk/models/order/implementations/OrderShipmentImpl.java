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

/**
 * <p>OrderShipmentImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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
	
	private String trackingUrl;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>pId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getPId() {
		return pId;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getStatus() {
		return status;
	}

	/** {@inheritDoc} */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * <p>Getter for the field <code>originAddress</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.ShipmentAddress} object
	 */
	public ShipmentAddress getOriginAddress() {
		return originAddress;
	}

	/**
	 * <p>Getter for the field <code>destinationAddress</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.ShipmentAddress} object
	 */
	public ShipmentAddress getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * <p>Getter for the field <code>incomingDate</code>.</p>
	 *
	 * @return a {@link java.time.LocalDate} object
	 */
	public LocalDate getIncomingDate() {
		return incomingDate;
	}

	/**
	 * <p>Getter for the field <code>items</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderShipmentItem> getItems() {
		return items;
	}

	/**
	 * <p>Getter for the field <code>statuses</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderShipmentStatus> getStatuses() {
		return statuses;
	}

	/**
	 * <p>Getter for the field <code>shipping</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShipping} object
	 */
	public OrderShipping getShipping() {
		return shipping;
	}

	/**
	 * <p>Getter for the field <code>hash</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * <p>Getter for the field <code>exportStatus</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 */
	public ExportStatusType getExportStatus() {
		return exportStatus;
	}

	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <p>Setter for the field <code>pId</code>.</p>
	 *
	 * @param pId a {@link java.lang.String} object
	 */
	public void setPId(String pId) {
		this.pId = pId;
	}

	/**
	 * <p>Setter for the field <code>incomingDate</code>.</p>
	 *
	 * @param incomingDate a {@link java.time.LocalDate} object
	 */
	public void setIncomingDate(LocalDate incomingDate) {
		this.incomingDate = incomingDate;
	}

	/**
	 * <p>Setter for the field <code>items</code>.</p>
	 *
	 * @param items a {@link java.util.List} object
	 */
	public void setItems(List<OrderShipmentItem> items) {
		this.items = items;
	}

	/**
	 * <p>Setter for the field <code>statuses</code>.</p>
	 *
	 * @param statuses a {@link java.util.List} object
	 */
	public void setStatuses(List<OrderShipmentStatus> statuses) {
		this.statuses = statuses;
	}

	/**
	 * <p>Setter for the field <code>shipping</code>.</p>
	 *
	 * @param shipping a {@link com.logicommerce.sdk.models.order.OrderShipping} object
	 */
	public void setShipping(OrderShipping shipping) {
		this.shipping = shipping;
	}

	/**
	 * <p>Setter for the field <code>exportStatus</code>.</p>
	 *
	 * @param exportStatus a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 */
	public void setExportStatus(ExportStatusType exportStatus) {
		this.exportStatus = exportStatus;
	}

	/**
	 * <p>Getter for the field <code>originWarehouseGroupId</code>.</p>
	 *
	 * @return a int
	 */
	public int getOriginWarehouseGroupId() {
		return originWarehouseGroupId;
	}

	/**
	 * <p>Setter for the field <code>originWarehouseGroupId</code>.</p>
	 *
	 * @param originWarehouseGroupId a int
	 */
	public void setOriginWarehouseGroupId(int originWarehouseGroupId) {
		this.originWarehouseGroupId = originWarehouseGroupId;
	}

	/**
	 * <p>Setter for the field <code>originAddress</code>.</p>
	 *
	 * @param originAddress a {@link com.logicommerce.sdk.models.order.ShipmentAddress} object
	 */
	public void setOriginAddress(ShipmentAddress originAddress) {
		this.originAddress = originAddress;
	}

	/**
	 * <p>Setter for the field <code>destinationAddress</code>.</p>
	 *
	 * @param destinationAddress a {@link com.logicommerce.sdk.models.order.ShipmentAddress} object
	 */
	public void setDestinationAddress(ShipmentAddress destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	 * <p>Setter for the field <code>hash</code>.</p>
	 *
	 * @param hash a {@link java.lang.String} object
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}

	/** {@inheritDoc} */
	@Override
	public String getTrackingNumber() {
		return trackingNumber;
	}

	/** {@inheritDoc} */
	@Override
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	/** {@inheritDoc} */
	@Override
	public String getDocumentNumber() {
		return documentNumber;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getSubstatus() {
		return substatus;
	}

	/**
	 * <p>Setter for the field <code>substatus</code>.</p>
	 *
	 * @param substatus a {@link java.lang.Integer} object
	 */
	public void setSubstatus(Integer substatus) {
		this.substatus = substatus;
	}

	/** {@inheritDoc} */
	@Override
	public void setTrackingUrl(String trackingUrl) {
		this.trackingUrl = trackingUrl;		
	}

	/** {@inheritDoc} */
	@Override
	public String getTrackingUrl() {
		return trackingUrl;
	}
}
