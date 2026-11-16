# RMA

## Descripción

Devolución (RMA) de un cliente, tal como la devuelve *[RMAResource](../../Resources/RMAResource.md)*. Extiende *[CustomerDocument](../Document/CustomerDocument.md)*`<`*[RMAItem](RMAItem.md)*`>`.

No es lo mismo que *[OrderRMA](../Order/OrderRMA.md)*, el resumen de la devolución que viene dentro del pedido (*getRMAs()* de *[Order](../Order/Order.md)*). Los dos comparten id y número de documento, pero *RMA* añade el cliente, el producto, el SKU y el motivo de cada línea, y los importes. La comparación completa está en *[RMAResource](../../Resources/RMAResource.md#relación-con-pedidos)*.

*Disponible desde la versión 2.9.1.*

## Métodos

De *[CustomerDocument](../Document/CustomerDocument.md)*:

- **int** getId(): id de la devolución. Es el mismo que *getId()* de *[OrderRMA](../Order/OrderRMA.md)* y el que usa *getRMA(int)* de *[RMAResource](../../Resources/RMAResource.md)*.
- **String** getDocumentNumber(): número de documento de la devolución, el que ve el cliente; *null* si no tiene. Es el mismo que *getDocumentNumber()* de *OrderRMA* y el que usa *getRMA(String)*.
- **Integer** getOrderId(): id del pedido del que se devuelven los productos; sirve para *getOrder(int)* de *[OrderResource](../../Resources/OrderResource.md)*. *null* si la devolución no está ligada a un pedido.
- **String** getOrderDocumentNumber(): número de documento de ese pedido, para mostrarlo (también lo busca *getOrder(String)*). *null* si la devolución no está ligada a un pedido.
- **[DocumentCustomer](../Document/DocumentCustomer.md)** getCustomer(): cliente guardado en la devolución (email y nombre, apellidos y empresa de la dirección de facturación); nunca *null*.
- **List<[RMAItem](RMAItem.md)>** getItems(): líneas devueltas, ordenadas por id; nunca *null*.

Propios de la devolución:

- **LocalDateTime** getDate(): fecha de la devolución, tal como está guardada. Es la fecha por la que filtran *fromDate* y *toDate* de *[CustomerDocumentListParam](../Document/CustomerDocumentListParam.md)*.
- **[RMAStatusType](../../Enums/README.md#RMAStatusType)** getStatus(): estado actual de la devolución. Puede ser cualquiera, también `DELETED`. No incluye el historial de estados.
- **double** getSubtotal(): subtotal sin impuestos, en la moneda de *getCurrencyCode()*. `0` si la devolución no tiene totales.
- **double** getTotal(): total con impuestos, en la moneda de *getCurrencyCode()*. `0` si la devolución no tiene totales.
- **String** getCurrencyCode(): código ISO de la moneda de los importes, la de facturación de la devolución (por ejemplo `EUR`); *null* si no tiene.

Los importes son decimales en la moneda indicada, como los totales de *[Order](../Order/Order.md)*, no unidades menores.

## Ejemplo

```java
RMA rma = rmaResource.getRMA(312);
if (rma != null && rma.getStatus() == RMAStatusType.PENDING) {
	String customerEmail = rma.getCustomer().getEmail();
	String amount = rma.getTotal() + " " + rma.getCurrencyCode();
	Order order = orderResource.getOrder(rma.getOrderId());
	for (RMAItem item : rma.getItems()) {
		String reason = item.getReason();
		...
	}
}
```

## Referencias

- **[CustomerDocument](../Document/CustomerDocument.md)**
- **[DocumentCustomer](../Document/DocumentCustomer.md)**
- **[RMAItem](RMAItem.md)**
- **[OrderRMA](../Order/OrderRMA.md)**
- **[RMAResource](../../Resources/RMAResource.md)**
- **[RMAStatusType](../../Enums/README.md#RMAStatusType)**: Enumerado
