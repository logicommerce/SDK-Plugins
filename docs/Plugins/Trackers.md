# Trackers

Creación de un plugin para la creacion de scripts de seguimento de navegación.

## Definición del plugin

El fichero plugin.json tiene la siguiente definción:

```json
{
    "name": "Tracker plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "202-06-08",
    "version": "1.1",
    "module": "com.thirdparty.tracker",

    "properties": [
        // ...
    ]
}
```

### Configuración específica

El servicio de Tracker no tiene configuración específica.

## Módulo

El archivo module-info.java deberá definir el *provider* (Servicio).

```java
module com.thirdparty.tracker {
    requires com.logicommerce.sdk;

    provides com.logicommerce.sdk.services.DefinitionService
        with com.thirdparty.tracker.Definition;

    provides com.logicommerce.sdk.services.TrackerService
        with com.thirdparty.tracker.Tracker;

}
```

## Implementación

En el siguiente código se muestra parte del código de la implementación del servicio [TrackerService](../APIReference/Services/TrackerService.md).

```java
package com.thirdparty.tracker;

import com.logicommerce.sdk.Aggregate;
import com.logicommerce.sdk.services.PluginServiceException;
import com.logicommerce.sdk.services.TrackerService;

public class Tracker implements TrackerService {

    @Aggregate
    private Config config;

    @Override
    public List<TrackerResponse> getTrackers(TrackerPageType pageType, TrackerPosition position) throws PluginServiceException {
        return new ArrayList<>();
    }
```

El método getTrackers devuelve una lista de respuestas de tracker.

Los arguments [TrackerPageType](../APIReference/Enums/README.md#TrackerPageType) y [TrackerPosition](../APIReference/Enums/README.md#TrackerPosition), definen donde y quando devolver el tracker.
