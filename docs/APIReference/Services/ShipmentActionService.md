# ShipmentActionService

Servicio para las acciones de expediciones.
Extiende de **[ActionService](ActionService.md)**

## Métodos disponibles

### Ejecuta acción (executeAction)

Se llama en el momento en el que se tiene que ejecutar una acción de tipo plugin, configuradas para los cambio de estado de expedición.

parámetros

- **[OrderShipment](../OrderShipment/Order/OrderShipment.md)** orderShipment
- **String** action

Respuesta

- **[OrderActionResponse](../Model/Order/OrderActionResponse.md)**

### Obtención de la definición de las acciones asociadas al plugin.

Se llama en el momento de mostrar las acciones disponibles para la configuración del estado/substado de pedido.

parámetros

- **[OrderShipment](../Models/Order/OrderShipment.md)** order
- **String** action

Respuesta

- List<**[PluginActionDefinition](../Definitions/PluginActionDefinition.md)**>

## Interfaz

```java
public interface ShipmentActionService extends ActionService {

	OrderActionResponse executeAction(Order order, String action) throws PluginServiceException;

	List<PluginActionDefinition> getActionDefinitons(OrderShipment order, String action) throws PluginServiceException;
	
}
```
