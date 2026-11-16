# OrderRMA

## Descripción

Devolución (RMA) de un pedido (*getRMAs()* de *[Order](Order.md)*). Solo la rellena *[OrderResource](../../Resources/OrderResource.md)*; en los pedidos que reciben los hooks y en los que construye un plugin, *getRMAs()* es `null`.

Es una versión resumida de la devolución. Para el detalle completo (cliente, motivo de cada línea, SKU y totales) se usa *getId()* con *getRMA(int)* de *[RMAResource](../../Resources/RMAResource.md)*, que devuelve un *[RMA](../RMA/RMA.md)*.

*Disponible desde la versión 2.9.0.*

## Métodos

- **int** getId(): id de la devolución, el que usa *getRMA(int)* de *[RMAResource](../../Resources/RMAResource.md)*.
- **String** getDocumentNumber(): número de documento de la devolución, el que ve el cliente (también lo busca *getRMA(String)*); *null* si no tiene. *Disponible desde la versión 2.9.1.*
- **[RMAStatusType](../../Enums/README.md#RMAStatusType)** getStatus(): estado.
- **LocalDateTime** getDate(): fecha, tal como está guardada (como *getDate()* de *[Document](Document.md)*).
- **List<[OrderRMAItem](OrderRMAItem.md)>** getItems(): elementos devueltos, uno por fila de la devolución; nunca *null*.

## Ejemplo

```java
Order order = orderResource.getOrder(4521);
for (OrderRMA orderRMA : order.getRMAs()) {
	RMA rma = rmaResource.getRMA(orderRMA.getId());
	...
}
```

## Referencias

- **[OrderRMAItem](OrderRMAItem.md)**
- **[RMA](../RMA/RMA.md)**
- **[RMAResource](../../Resources/RMAResource.md)**
- **[RMAStatusType](../../Enums/README.md#RMAStatusType)**: Enumerado
