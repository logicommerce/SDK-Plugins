# CustomerDocument

## Descripción

Datos comunes de los documentos de un cliente que devuelven *[RMAResource](../../Resources/RMAResource.md)* (*[RMA](../RMA/RMA.md)*) y *[ShipmentResource](../../Resources/ShipmentResource.md)* (*[Shipment](../Shipment/Shipment.md)*). Es genérico en el tipo de sus líneas: `CustomerDocument<I extends DocumentItem>`.

| Implementación | Tipo de las líneas |
|---|---|
| *[RMA](../RMA/RMA.md)* | *[RMAItem](../RMA/RMAItem.md)* (con el motivo de devolución) |
| *[Shipment](../Shipment/Shipment.md)* | *[DocumentItem](DocumentItem.md)* |

Permite tratar devoluciones y envíos con el mismo código, por ejemplo para comprobar el cliente o enlazar con el pedido. Para enlazar se usan los ids (*getId()*, *getOrderId()*); los números de documento son los que ve el cliente. Los datos propios de cada uno (estado, fechas, importes, seguimiento) están en *RMA* y *Shipment*.

Los documentos se buscan por el email guardado en ellos (ver *[CustomerDocumentListParam](CustomerDocumentListParam.md)*).

*Disponible desde la versión 2.9.1.*

## Métodos

- **int** getId(): id del documento. En una devolución es el id de la devolución; en un envío, el id del envío.
- **String** getDocumentNumber(): número de documento que ve el cliente; *null* si no tiene. En una devolución es su número de documento; en un envío, el número de su **albarán**, que solo existe si se ha generado.
- **Integer** getOrderId(): id del pedido al que pertenece; *null* si no está ligado a un pedido. Sirve para *getOrder(int)* de *[OrderResource](../../Resources/OrderResource.md)*.
- **String** getOrderDocumentNumber(): número de documento de ese pedido, para mostrarlo (también lo busca *getOrder(String)*); *null* si no está ligado a un pedido.
- **[DocumentCustomer](DocumentCustomer.md)** getCustomer(): cliente guardado en el documento (en un envío, el de su pedido); nunca *null*. Su email es el que comparan los listados.
- **List<I>** getItems(): líneas de producto, ordenadas por id; nunca *null*.

| Método | *[RMA](../RMA/RMA.md)* | *[Shipment](../Shipment/Shipment.md)* |
|---|---|---|
| *getId()* | Id de la devolución | Id del envío |
| *getDocumentNumber()* | Número de la devolución | Número del albarán (*null* si no hay) |
| *getOrderId()*, *getOrderDocumentNumber()* | Pedido del que se devuelven los productos | Pedido del envío |
| *getCustomer()* | Cliente de la devolución | Cliente del pedido |
| *getItems()* | Líneas devueltas | Líneas enviadas |

## Comprobar el cliente

*RMAResource* y *ShipmentResource* no comprueban a qué cliente pertenece un documento leído por id o por número. Antes de mostrarlo a un cliente, el plugin debe comparar su email:

```java
private static boolean isCustomerDocument(String email, CustomerDocument<?> document) {
	String documentEmail = document.getCustomer().getEmail();
	return documentEmail != null && documentEmail.trim().equalsIgnoreCase(email.trim());
}

RMA rma = rmaResource.getRMA(rmaId);
if (rma == null || !isCustomerDocument(email, rma)) {
	...
}

Shipment shipment = shipmentResource.getShipment(shipmentId);
if (shipment == null || !isCustomerDocument(email, shipment)) {
	...
}
```

## Referencias

- **[DocumentCustomer](DocumentCustomer.md)**
- **[DocumentItem](DocumentItem.md)**
- **[CustomerDocumentListParam](CustomerDocumentListParam.md)**
- **[RMA](../RMA/RMA.md)**
- **[Shipment](../Shipment/Shipment.md)**
