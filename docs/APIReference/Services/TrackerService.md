# TrackerService

Servicio para la generación de trackers

## Métodos disponibles

### Obtener los trackers

Procesa el formulario recibido con el método * getTrackers *.

parámetros:

- ***[TrackerPageType](../Enums/README.md#TrackerPageType)*** scope: enumera que dice a qué ámbito va el tracker
- ***[TrackerPosition](../Enums/README.md#TrackerPosition)*** position: Posición dentro del código donde se ubicará el tracker

Devuelve una lista de **[TrackerResponse](../Models/TrackerResponse.md)**

## Interfaz

```java
public interface TrackerService extends PluginService {

    List<TrackerResponse> getTrackers(TrackerPageType scope, TrackerPosition position) throws PluginServiceException;

}
```
