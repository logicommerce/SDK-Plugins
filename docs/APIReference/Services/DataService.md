# DataService

Servicio para la obtención de datos que los plugins puedan necesitar para el frente.

Este servicio se llama desde el recurso REST /pluginData con los parámetros definidos por el plugin más el parámetro *plugin* que hace referencia al nombre del plugin (obligatorio).

## Métodos disponibles

### Get Data

parámetros:

- **Map<String, String> params**: El plugin define qué quiere recibir como parámetros.

Devuelve un mapa de objetos (Map<String, Object>) que se mostrará como un JSON a la salida de la petición REST.

## Interfaz

```java
public interface DataService extends PluginService {

    Map<String, Object> getData(Map<String, String> params) throws PluginServiceException;

}
```
