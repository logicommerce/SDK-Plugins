# OrderActionService

Servicio para las acciones de pedido.
Extiende de **[ActionService](ActionService.md)**

## Métodos disponibles

### Ejecuta acción (executeAction)

Se llama en el momento en el que se tiene que ejecutar una acción de tipo plugin, configuradas para los cambio de estado de pedido.

parámetros

- **[Order](../Models/Order/Order.md)** order
- **String** action

Respuesta

- **[OrderActionResponse](../Model/Order/OrderActionResponse.md)**

### Obtención de la definición de las acciones asociadas al plugin.

Se llama en el momento de mostrar las acciones disponibles para la configuración del estado/substado de pedido.

parámetros

- **[Order](../Models/Order/Order.md)** order
- List<**[ConnectorType](../../Enums/README.md#ConnectorType)**> connectorType

Respuesta

- List<**[PluginActionDefinition](../Definitions/PluginActionDefinition.md)**>

## Interfaz

```java
public interface OrderActionService extends ActionService {

	OrderActionResponse executeAction(Order order, String action) throws PluginServiceException;

	List<PluginActionDefinition> getActionDefinitons(Order order, List<ConnectorType> connectorType) throws PluginServiceException;
	
}
```
