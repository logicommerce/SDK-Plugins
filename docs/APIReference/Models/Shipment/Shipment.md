# Shipment

## Descripción

Envío de un pedido de un cliente, tal como lo devuelve *[ShipmentResource](../../Resources/ShipmentResource.md)*. Extiende *[CustomerDocument](../Document/CustomerDocument.md)*`<`*[DocumentItem](../Document/DocumentItem.md)*`>`.

Un pedido puede tener varios envíos (por ejemplo, uno por almacén de salida), así que el número del pedido no identifica un envío. Un envío se identifica por su id o por el número de su albarán.

No es lo mismo que *[OrderShipment](../Order/OrderShipment.md)*, el envío que viene dentro del pedido (*getDelivery().getShipments()* de *[Order](../Order/Order.md)*). Los dos comparten el id, pero *getDocumentNumber()* de *OrderShipment* es el número del **pedido**. La comparación completa está en *[ShipmentResource](../../Resources/ShipmentResource.md#relación-con-pedidos)*.

*Disponible desde la versión 2.9.1.*

## Métodos

De *[CustomerDocument](../Document/CustomerDocument.md)*:

- **int** getId(): id del envío. Es el mismo que *getId()* de *[OrderShipment](../Order/OrderShipment.md)* y el que usa *getShipment(int)* de *[ShipmentResource](../../Resources/ShipmentResource.md)*.
- **String** getDocumentNumber(): número del **albarán** del envío; *null* si todavía no se ha generado. Si el envío tiene varios albaranes (entregas parciales), es el del primero. Es el que usa *getShipment(String)*.
- **Integer** getOrderId(): id del pedido del envío; sirve para *getOrder(int)* de *[OrderResource](../../Resources/OrderResource.md)*.
- **String** getOrderDocumentNumber(): número de documento del pedido del envío, para mostrarlo (también lo busca *getOrder(String)*).
- **[DocumentCustomer](../Document/DocumentCustomer.md)** getCustomer(): cliente guardado en el pedido (email y nombre, apellidos y empresa de la dirección de facturación); nunca *null*.
- **List<[DocumentItem](../Document/DocumentItem.md)>** getItems(): líneas del envío, ordenadas por id; nunca *null*. *getQuantity()* es la cantidad enviada en este envío, que puede ser menor que la de la línea del pedido. El producto, el nombre y el SKU son los de la línea del pedido.

Propios del envío:

- **LocalDateTime** getOrderDate(): fecha del pedido del envío. Es la fecha por la que filtran *fromDate* y *toDate* de *[CustomerDocumentListParam](../Document/CustomerDocumentListParam.md)*.
- **[OrderShipmentStatusType](../../Enums/README.md#OrderShipmentStatusType)** getStatus(): estado actual del envío (`PENDING`, `PROCESSING`, `SHIPPED`, `DELIVERED` o `INCIDENTS`); *null* si el envío todavía no tiene estado. No incluye el historial de estados.
- **LocalDate** getIncomingDate(): fecha prevista de llegada de la mercancía al almacén de salida; *null* si no está informada. No es la fecha de entrega al cliente.
- **String** getShippingName(): nombre del servicio de envío guardado en el pedido; *null* si el envío no tiene servicio de envío.
- **String** getShippingTypeName(): nombre del tipo de envío guardado en el pedido; *null* si el envío no tiene servicio de envío.
- **String** getShipperPId(): id público del transportista; *null* si no está informado.
- **String** getTrackingNumber(): número de seguimiento; *null* si no tiene.
- **String** getTrackingUrl(): URL de seguimiento del transportista; *null* si no tiene.

## Albaranes

Los albaranes no se generan solos al enviar un pedido. Se crean desde la API de back (`POST /orderShipments/{id}/deliveryNote`) o con la acción *Crear albarán* (`CREATE_DELIVERYNOTE`) de un subestado de envío. Si la tienda no los genera, *getDocumentNumber()* es siempre *null* y el envío solo se puede leer por id.

## Ejemplo

```java
Shipment shipment = shipmentResource.getShipment(1532);
if (shipment != null && shipment.getStatus() == OrderShipmentStatusType.SHIPPED) {
	String trackingUrl = shipment.getTrackingUrl();
	String deliveryNote = shipment.getDocumentNumber();
	Order order = orderResource.getOrder(shipment.getOrderId());
	for (DocumentItem item : shipment.getItems()) {
		String sku = item.getSku();
		int sentQuantity = item.getQuantity();
		...
	}
}
```

## Referencias

- **[CustomerDocument](../Document/CustomerDocument.md)**
- **[DocumentCustomer](../Document/DocumentCustomer.md)**
- **[DocumentItem](../Document/DocumentItem.md)**
- **[OrderShipment](../Order/OrderShipment.md)**
- **[ShipmentResource](../../Resources/ShipmentResource.md)**
- **[OrderShipmentStatusType](../../Enums/README.md#OrderShipmentStatusType)**: Enumerado
