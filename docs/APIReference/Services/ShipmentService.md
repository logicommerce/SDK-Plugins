# ShipmentService

Servicio de los estados de una expedición.

## Métodos disponibles

### Procesar acción

Recibe los datos de la expedición y en retorno. El plugin puede añadir datos al OrderShipment.

**[ShipmentActionType](../Enums/README.md#ShipmentActionType)** nos informa de si la expedición se trata de una recogida, envío o se trata de un seguimiento.

Parámetros:

- **[OrderShipment](../Models/Order/OrderShipment.md)** orderShipment
- **[ShipmentActionType](../Enums/README.md#ShipmentActionType)** shipmentActionType

### Cambio de estado

Permite ejecutar acción cuando se realice un cambio de estado de un pedido.

Parámetros:

- **[OrderShipment](../Models/Order/OrderShipment.md)** orderShipment
- **[OrderShipmentStatusType](../Enums/README.md#OrderShipmentStatusType)** orderShipmentStatusType

### Obtener etiqueta envío

Retorna la etiqueta del envío en formato **[DataFile](../Models/DataFile.md)**.

Parámetros:

- **[OrderShipment](../Models/Order/OrderShipment.md)** orderShipment

## Interfaz

```java
public interface ShipmentService extends PluginService {

    OrderShipment processAction(final OrderShipment shipment, ShipmentActionType actionType) throws PluginServiceException;
    
	void changeStatus(OrderShipment orderShipment, OrderShipmentStatusType orderShipmentStatusType) throws PluginServiceException;
    
    DataFile getShipmentLabel(final OrderShipment shipment) throws PluginServiceException;

}

```
