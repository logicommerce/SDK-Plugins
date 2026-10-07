# RowAllocation

## Descripción

Parte de un descuento que corresponde a una fila, vista desde el descuento: el mismo importe que el
*[Allocation](Allocation.md)* de ese descuento en esa fila.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getRowHash(): hash de la fila, como en *getHash()* de *[BasketRowView](BasketRowView.md)* o de *[OrderItemAmounts](../Order/OrderItemAmounts.md)*.
- **long** getAmount(): importe descontado, no negativo, redondeado una vez.
