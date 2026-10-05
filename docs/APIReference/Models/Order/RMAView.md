# RMAView

## Descripción

Devolución (RMA) de un pedido (*getRMAs()* de *[OrderView](OrderView.md)*).

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getId()
- **RMAStatusType** getStatus()
- **Instant** getDate(): UTC.
- **List<[RowQuantity](RowQuantity.md)>** getRows(): cantidades devueltas por fila.

## Referencias

- **[RMAStatusType](../../Enums/README.md#RMAStatusType)**: Enumerado
