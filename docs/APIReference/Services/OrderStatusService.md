# OrderStatusService

Servicio para la gestión de los estados del pedido.

Cuando se haya ejecutado un cambio de estado en un pedido, se llamará al método *changeStatus* de este servicio.

## Métodos disponibles

### Cambio de estado

Utiliza el método *changeStatus*.

Parámetros:

- **[Order](../Models/Order/Order.md)** order
- **[OrderStatusType](../Enums/README.md#OrderStatusType)** previousStatusType

No se espera respuesta.

## Interfaz

```java
public interface OrderStatusService extends PluginService {

    void changeStatus(Order order, OrderStatusType previousStatusType) throws PluginServiceException;

}
```
