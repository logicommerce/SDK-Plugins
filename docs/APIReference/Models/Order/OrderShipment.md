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
- **ExportStatusType** getExportStatus()
- **ShipmentAddress** getOriginAddress();
- **ShipmentAddress** getDestinationAddress();
- **ShipmentAddress** getDestinationUserAddress();
- **String** getHash()
- **String** getDocumentNumber()
- **String** getTrackingNumber()
- **String** getTrackingUrl()
- **String** getDocumentUrl()
- **DocumentProviderPickupPoint** getProviderPickupPoint()

## Referencias

- **[OrderShipmentStatusType](../../Enums/README.md#OrderShipmentStatusType)**: Enumerado
- **[ExportStatusType](../../Enums/README.md#ExportStatusType)**: Enumerado
- **[OrderShipmentItem](OrderShipmentItem.md)**
- **[OrderShipmentStatus](OrderShipmentStatus.md)**
- **[OrderShipping](OrderShipping.md)**
