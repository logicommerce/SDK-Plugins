package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.builders.GeographicalZoneBuilder;
import com.logicommerce.sdk.enums.DeliveryType;
import com.logicommerce.sdk.models.order.OrderDelivery;
import com.logicommerce.sdk.models.order.implementations.OrderDeliveryImpl;

/**
 * <p>OrderDeliveryBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderDeliveryBuilder<T> {
	
	private T parentBuilder;
	
	protected DeliveryType type;
	
	protected OrderDeliveryPhysicalLocationBuilder<OrderDeliveryBuilder<T>> physicalLocation;
	
	protected List<OrderShipmentBuilder<OrderDeliveryBuilder<T>>> shipments;
		
	protected GeographicalZoneBuilder<OrderDeliveryBuilder<T>> geographicalZone;
	
	/**
	 * <p>Constructor for OrderDeliveryBuilder.</p>
	 */
	public OrderDeliveryBuilder() {		
		geographicalZone = new GeographicalZoneBuilder<>(this);
		shipments = new ArrayList<>();
		physicalLocation = new OrderDeliveryPhysicalLocationBuilder<>(this);
		type = DeliveryType.SHIPPING;
	}
	
	/**
	 * <p>Constructor for OrderDeliveryBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderDeliveryBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>type.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.DeliveryType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryBuilder} object
	 */
	public OrderDeliveryBuilder<T> type(DeliveryType type) {
		this.type = type;
		return this;
	}
	
	/**
	 * <p>geographicalZone.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.GeographicalZoneBuilder} object
	 */
	public GeographicalZoneBuilder<OrderDeliveryBuilder<T>> geographicalZone() {
		return this.geographicalZone;
	}
	
	/**
	 * <p>physicalLocation.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryPhysicalLocationBuilder} object
	 */
	public OrderDeliveryPhysicalLocationBuilder<OrderDeliveryBuilder<T>> physicalLocation() {
		return this.physicalLocation;
	}
	
	/**
	 * <p>shipments.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShipmentBuilder} object
	 */
	public OrderShipmentBuilder<OrderDeliveryBuilder<T>> shipments() {
		OrderShipmentBuilder<OrderDeliveryBuilder<T>> shipment = new OrderShipmentBuilder<>(this);
		shipments.add(shipment);
		return shipment;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderDelivery} object
	 */
	public OrderDelivery build() {
		OrderDeliveryImpl delivery  = new OrderDeliveryImpl();
		delivery.setGeographicalZone(geographicalZone.build());
		delivery.setPhysicalLocation(physicalLocation.build());
		delivery.setShipments(shipments.stream().map(OrderShipmentBuilder::build).collect(Collectors.toList()));
		delivery.setType(type);
		return delivery;
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
