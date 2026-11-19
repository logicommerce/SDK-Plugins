# PluginEndpointRequest

## Descripción

Para la petición en el proceso de un endpoint defindio en **[ApiPluginsService](../Services/ApiPluginsService.md)**

Se recibe parametros relacionados con la petición.

## Métodos

- **String** getHttpMethod()
- **String** getEndpointPath()
- **String** getBody()
- **Map<String, List<String>>** getHeaders()
- **Map<String, List<String>>** getQueryParams()
- **[ApiPluginsAuthenticationType](../Enums/README.md#ApiPluginsAuthenticationType)** getAuthenticationType(): tipo de la definición de autenticación de api-plugins que ha autenticado la petición. Lo informa LogiCommerce, por lo que quien llama no puede falsearlo. Sirve para limitar un endpoint a un tipo de llamante, por ejemplo `JWT` para la tienda y `HEADER` para un tercero. *Disponible desde la versión 2.9.1.*
