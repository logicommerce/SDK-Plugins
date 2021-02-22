# Connection

## Descripción

Recurso para ejecutar peticiones HTTP.

Este recurso permite construir una petición web y devuelve un resultado con un objeto tipo *Response*.

Los métodos *get*, *post*, *put*, *delete* son "finales" y devuelven un objeto de tipo *Response*.

El resto son mutables y están pensados para que se puedan concatenar (como un builder) y generar la petición.

## Mètodes

- **Connection** init(String endPoint)
- **Connection** authorization(String authorization)
- **Connection** path(String path)
- **Connection** contentType(String contentType)
- **Connection** acceptType(String acceptType)
- **Connection** header(String name, String value)
- **Connection** cookie(String name, String value)
- **Connection** params(String params)
- **[Response](Response.md)** get() throws **[PluginResourceException](PluginResourceException.md)**
- **[Response](Response.md)** post(String body) throws **[PluginResourceException](PluginResourceException.md)**
- **[Response](Response.md)** put(String body) throws **[PluginResourceException](PluginResourceException.md)**
- **[Response](Response.md)** delete() throws **[PluginResourceException](PluginResourceException.md)**

## Referències

- **[Response](Response.md)**
- **[PluginResourceException](PluginResourceException.md)**
