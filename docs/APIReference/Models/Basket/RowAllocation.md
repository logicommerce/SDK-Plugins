# RowAllocation

## Descripción

Parte de un descuento que corresponde a una fila, vista desde el descuento: el mismo importe que el
*[Allocation](Allocation.md)* de ese descuento en esa fila.

*Disponible desde la versión 2.8.5.*

## Métodos

- **String** getRowHash(): hash de la fila.
- **long** getAmount(): importe descontado, no negativo, redondeado una vez.
