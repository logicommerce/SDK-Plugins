# WebhookService

Servicio para processar peticiones webhook

## Métodos disponibles

### shouldHandle

Comprobar si el plugin debe gestionar la petición

parámetros:

- **[RequestParams](../Models/RequestParams.md)** requestParams

Devuelve **boolean**

### process

Procesar la petición webhook.

parámetros:

- **[RequestParams](../Models/RequestParams.md)** requestParams

Devuelve respuesta **[WebhookResponse](../Models/WebhookResponse.md)**

## Interfaz

```java
public interface WebhookService extends PluginService {

	boolean shouldHandle(RequestParams requestParams) throws PluginServiceException;

	WebhookResponse process(RequestParams requestParams) throws PluginServiceException;

}
```
