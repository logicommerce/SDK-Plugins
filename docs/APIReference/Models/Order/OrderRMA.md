# OrderRMA

## Descripción

Devolución (RMA) de un pedido (*getRMAs()* de *[Order](Order.md)*).

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getId(): id de la devolución.
- **[RMAStatusType](../../Enums/README.md#RMAStatusType)** getStatus(): estado.
- **LocalDateTime** getDate(): fecha, tal como está guardada (como *getDate()* de *[Document](Document.md)*).
- **List<[OrderRMAItem](OrderRMAItem.md)>** getItems(): elementos devueltos, uno por fila de la devolución; nunca *null*.

## Referencias

- **[RMAStatusType](../../Enums/README.md#RMAStatusType)**: Enumerado
