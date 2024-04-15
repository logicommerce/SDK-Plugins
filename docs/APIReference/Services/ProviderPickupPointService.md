# ProviderPickupPointService

Servicio para los puntos de recogida

## Métodos disponibles

### Obtener listado de puntos de recogida

Se utilizada para obtener un listado de puntos de recogida.

parámetros:

- **[PickupPointFilter](../Models/ProviderPickupPoint/PickupPointFilter.md)** order

Devuelve listado de ProviderPickupPoint en función del filtro facilitado.

### Validar punto de recogida

Se llama cuando se está generando el pedido.

parámetros:

- **[ProviderPickupPoint](../Models/ProviderPickupPoint/ProviderPickupPoint.md)** order
- **double** weight: Peso del los productos a enviar.

Devuelve verdadero si el punto de recogida está disponible, falso en caso contrario.

## Interfíce

```java
public interface ProviderPickupPointService extends PluginService {

	List<ProviderPickupPoint> getPickupPoints(PickupPointFilter filter)  throws PluginServiceException;

	boolean validatePickupPoint(ProviderPickupPoint pickupPoint, double weight)  throws PluginServiceException;

}
```
