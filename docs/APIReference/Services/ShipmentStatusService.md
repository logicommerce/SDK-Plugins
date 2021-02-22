# ShipmentStatusService

Servicio de los estados de una expedición.

## Métodos disponibles

### Cambio de estado

Parameters

- **[OrderShipment](../Models/Order/OrderShipment.md)** orderShipment
- **[OrderShipmentStatusType](../Enums/README.md#OrderShipmentStatusType)** orderShipmentStatusType



## Interfaz

```java
public interface ShipmentStatusService extends PluginService {

	void changeStatus(OrderShipment orderShipment, OrderShipmentStatusType orderShipmentStatusType) throws PluginServiceException;

}

```
