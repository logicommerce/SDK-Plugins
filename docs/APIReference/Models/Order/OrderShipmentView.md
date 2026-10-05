# OrderShipmentView

## Descripción

Envío de un pedido. Importes en unidades menores de la moneda de compra.

*Disponible desde la versión 2.8.5.*

## Métodos

- **int** getId()
- **OrderShipmentStatusType** getStatus(): estado, o *null* si el estado de la plataforma no tiene equivalente (`NONE`).
- **List<[RowQuantity](RowQuantity.md)>** getRows(): cantidades enviadas por fila.
- **int** getShippingTypeId()
- **String** getShippingTypeName(): nombre del tipo de envío, o *null*.
- **String** getShipperName(): nombre del transportista, o *null*.
- **long** getShippingPrice(): precio del envío antes de sus descuentos.
- **List<[Allocation](../Basket/Allocation.md)>** getShippingDiscounts(): descuentos de envío repartidos a este envío.
- **String** getTrackingNumber(): número de seguimiento escrito por un plugin de transportista, o *null*.
- **String** getTrackingUrl(): URL de seguimiento tal como está guardada, o *null*. La plataforma le asigna la URL de seguimiento genérica del transportista al crear el pedido, y un plugin de transportista puede sustituirla, así que sin *getTrackingNumber()* puede no identificar ningún envío.
- **LocalDate** getIncomingDate(): fecha prevista de disponibilidad de la mercancía, o *null*.
- **List<[StatusHistory](StatusHistory.md)>** getStatusHistory(): historial de estados del envío, en orden cronológico.

## Referencias

- **[OrderShipmentStatusType](../../Enums/README.md#OrderShipmentStatusType)**: Enumerado
