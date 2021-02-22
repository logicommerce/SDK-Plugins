# Newsletter

Recibe las órdenes de suscripción, desuscripción y consulta a un sistema de mailing.

## Configuración

No requiere de una configuración específica. Ejemplo de archivo plugin.json:

```json
{
    "name": "Newsletter plugin",
    "description": "The plugin description",
    "author": "Larry Fisher",
    "date": "2019-07-25",
    "version": "1.1",
    "module": "com.thirdparty.mailing",

    "properties": [
        {
            "name": "endPoint",
            "type": "string",
            "defaultValue": "http://api.thirdparty.com/mailing/",
            "language": {
                "es": "URL del servidor",
                "en": "End point",
                "chi": "End point"
            }
        },{
            "name": "apiKey",
            "type": "string",
            "required": true,
            "language": {
                "es": "API key",
                "en": "API key",
                "chi": "API key"
            }
        }
        // ...
    ]
}
```

## Módulo

El archivo module-info.java deberá definir el *provider*.

```java
module com.thirdparty.mailing {
    requires com.logicommerce.sdk;

    provides com.logicommerce.sdk.services.NewsletterService
        with com.thirdparty.mailing.Newsletter;
}
```

## Implementación

En el siguiente código se muestra parte del código de la implementación del servicio NewsletterService.

```java
public class Newsletter implements NewsletterService {

    @Aggregate
    private Configuration configuration;

    @Aggregate
    private ContactService contactService;

    @Override
    public void subscribe(String email) throws PluginServiceException {
        // Your code
    }

    @Override
    public void unsubscribe(String email) throws PluginServiceException {
        // Your code
    }

    @Override
    public boolean isSubscribed(String email) throws PluginServiceException {
        // Your code
    }

}
```

En este caso se inyecta la clase Configuration para obtener la configuración del plugin (definida en plugin.json). Ver [Configuration](Configuration.md).
