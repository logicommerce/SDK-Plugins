# Recomanador

Creación de un plugin de Recomendadores.

## Definición del plugin

El archivo plugin.json tiene la siguiente definición:

```json
{
    "name": "Recommender plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "2019-07-03",
    "version": "1.1",
    "module": "com.thirdparty.recommender",

    "properties": [
        {
            "name": "endPoint",
            "type": "string",
            "defaultValue": "http://api.thirdparty.com/recommender/",
            "language": {
                "es": "URL del servidor",
                "en": "End point",
                "chi": "End point"
            }
        },
        // ...
    ],
    "lcModules": [
        {
            "type": "related_definition",
            "allowedFromTypes": ["product","category","user","basket"],
            "properties": [
                {
                    "name": "recommenderType",
                    "type": "integer",
                    "defaultValue": 1,
                    "language": {
                        "es": "Tipo de recomendación",
                        "en": "Recommender",
                        "chi": "Recommender"
                    },
                    "entryValueMode": "select",
                    "values": [
                        {
                            "value": 1,
                            "language": {
                                "es": "Básico",
                                "en": "Basic",
                                "chi": "Basic"
                            }  
                        },
                        // ...
                    ]
                },
                // ...
            ]
        }
    ]
}
```

### Configuración específica

El plugin admite configuración específica que será editable desde la pantalla de recomendadores al administrador de Logicommerce.

El tipo en este caso es **related_definition**.

Se le puede añadir la propiedad *allowedFromTypes* donde se define desde qué elementos se pueden generar los relacionados. Esta propiedad servirá para el administrador mostrar.

## Módulo

El archivo module-info.java deberá definir el *provider*.

```java
module com.thirdparty.recommender {
    requires com.logicommerce.sdk;

    provides com.logicommerce.sdk.services.RelatedItemsService
        with com.thirdparty.recommender.RelatedItems;
}
```

## Implementación

En el siguiente código se muestra parte del código de la implementación del servicio RelatedItemsService.

```java
package com.thirdparty.recommender;

import com.logicommerce.sdk.Aggregate;
import com.logicommerce.sdk.Initiator;
import com.logicommerce.sdk.Resource;
import com.logicommerce.sdk.enums.RelatedItemType;
import com.logicommerce.sdk.resources.Connection;
import com.logicommerce.sdk.services.PluginServiceException;
import com.logicommerce.sdk.services.RelatedItemsService;

public class RelatedItems implements RelatedItemsService {

    @Aggregate
    private Config config;

    @Resource
    private Connection connection;

    @Initiator
    public void init() {
        // Optional
    }

    @Override
    public List<Integer> getItems(RelatedItemType relatedItemType, Integer id) throws PluginServiceException {
        // Your code
    }

    @Override
    public List<Integer> getItems(RelatedItemType relatedItemType) throws PluginServiceException {
        // Your code
    }

    @Override
    public List<Product> updateProducts(List<Product> products) throws PluginServiceException {
        // Your code
    }

}
```

En este caso se inyecta la clase Config, propia del plugin (Ver [Configuration](Plugins/Configuration.md)).
