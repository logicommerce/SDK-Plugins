# OrderShipment

## Descripción

Muestra las expediciones del pedido.

## Métodos

- **Integer** getId()
- **String** getPId()
- ***OrderShipmentStatusType*** getStatus()
- **int** getSubstatusId()
- **Integer** getOriginWarehouseGroupId()
- **Integer** getPhysicalLocationId()
- **LocalDate** getIncommingDate()
- **List<[OrderShipmentItem](OrderShipmentItem.md)>** getItems()
- **List<[OrderShipmentStatus](OrderShipmentStatus.md)>** getStatuses()
- **[OrderShipping](OrderShipping.md)** getShipping()
- ***ExportStatusType*** getExportStatus()

## Referencias

- **[OrderShipmentStatusType](../../Enums/README.md#OrderShipmemtStatusType)**: Enumerado
- **[ExportStatusType](../../Enums/README.md#ExportStatusType)**: Enumerado
- **[OrderShipmentItem](OrderShipmentItem.md)**
- **[OrderShipmentStatus](OrderShipmentStatus.md)**
- **[OrderShipping](OrderShipping.md)**
