# PluginEndpointResponse

## Descripción

Para la respuesta en el proceso de un endpoint defindio en **[ApiPluginsService](../Services/ApiPluginsService.md)**

El body puede contener valors de distintos tipos:

- String: El body será enviado tal cual.
- Object: El cuerpo será serializado a JSON.
- InputStream: El body será enviado como un Stream.

## Métodos

- **int** getStatusCode()
- **Object** getBody()
- **Map<String, List<String>>** getHeaders()
