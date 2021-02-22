# SearchProducts

Creación de un plugin para la búsqueda de productos.

Este Servicio se llama a la petición de productos (GET /productos) cuando tiene definido el parámetro de búsqueda "q".

ej: `/producs? q = shirt`

## Definición del plugin

El fichero plugin.json tiene la siguiente definción:

```json
{
    "name": "Finder plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "2019-07-03",
    "version": "1.1",
    "module": "com.thirdparty.finder",

    "properties": [
        {
            "name": "endPoint",
            "type": "string",
            "defaultValue": "http://api.thirdparty.com/finder/",
            "language": {
                "es": "URL del servidor",
                "en": "End point",
                "chi": "End point"
            }
        },
        // ...
    ]
}
```

### Configuración específica

El servicio de SerchProductsService no tiene configuración específica.

## Módulo

El archivo module-info.java deberá definir el *provider* (Servicio).

```java
module com.thirdparty.finder {
    requires com.logicommerce.sdk;

    provides com.logicommerce.sdk.services.SearchProductsService
        with com.thirdparty.finder.SearchProducts;
}
```

## Implementación

En el siguiente código se muestra parte del código de la implementación del servicio [SearchProductsService](../APIReference/Services/SearchProductsService.md).

```java
package com.thirdparty.finder;

import com.logicommerce.sdk.Aggregate;
import com.logicommerce.sdk.Resource;
import com.logicommerce.sdk.resources.Connection;
import com.logicommerce.sdk.services.PluginServiceException;
import com.logicommerce.sdk.services.SearchProductsService;

public class SearchProducts implements SearchProductsService {

    @Aggregate
    private Config config;

    @Resource
    private Connection connection;

    @Override
    public List<Integer> getProducts(String q) throws PluginServiceException {
        // Your code
    }

}
```

El método getProducts devuelve una lista de enteros que son los identificadores de los productos. Beyond después se encarga de devolver los datos productos.
