# TrackerService

Servicio para la generación de trackers

## Métodos disponibles

### Obtener los trackers

Procesa el formulario recibido con el método *getTrackers*.

parámetros:

- ***[WidgetPageType](../Enums/README.md#WidgetPageType)*** pageType: tipo de página donde se ubicará el tracker.

Devuelve una lista de **[TrackerResponse](../Models/TrackerResponse.md)**

## Interfaz

```java
public interface TrackerService extends PluginService {

    List<TrackerResponse> getTrackers(WidgetPageType pageType) throws PluginServiceException;

}
```
