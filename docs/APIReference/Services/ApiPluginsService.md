# ApiPluginsService

Servicio para la gestionar las petición custom definidas en el plugin.

## Métodos disponibles

### Invocar endpoints

Utiliza el método: *invokeEndpoint*.

Método utilizado para invocar endpoints de definidos en el propio plugin.

Parámetros:

- **[PluginEndpointRequest](../Models/PluginEndpointRequest.md)**  request : URL base de la tienda.

Devuelve: **[PluginEndpointResponse](../Models/PluginEndpointResponse.md)**.


## Interfaz

```java
public interface ApiPluginsService extends PluginService {

	PluginEndpointResponse invokeEndpoint(PluginEndpointRequest request) throws PluginServiceException;

}
```
