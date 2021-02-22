# PickupService

Servicio sólo disponible desde las llamadas de API-BACK.

Su función es hacer la llamada pickup de envío o retorno de las expediciones.

## Métodos disponibles

### Pickup request

Recibe los datos de la expedición y en retorno. El plugin puede añadir datos del OrderShipment.

## Interface

```java
public interface PickupService extends PluginService {

    void pickupRequest(OrderShipment orderShipment, boolean refund) throws PluginServiceException;

}
```
