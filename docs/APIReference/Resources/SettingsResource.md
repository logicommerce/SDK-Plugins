# SettingsResource

## Descripción

El recurso permite consultar los datos de configuración de la tienda. 

## Métodos

- **Integer** getCommerceId()
- **Integer** getEnviromentId()
- **String** getApiBackUrl()
- **String** getApiFrontUrl()
- **String** getApiPluginsUrl()
- **String** getDefaultStoreUrl(): URL por defecto de la tienda, la que se usa cuando nada selecciona un país, idioma o
  grupo. No depende de las cabeceras de la petición (a diferencia de *getStoreUrl* de *[Navigator](Navigator.md)*).
  Es absoluta (esquema, host y una ruta opcional) y sin barra final: se le añaden las rutas de la tienda. Devuelve
  *null* si la plataforma no la proporciona: la implementación por defecto del método devuelve *null* para versiones de
  la plataforma que no la tienen, y la plataforma que incluye esta versión del SDK la sobrescribe. *Disponible desde la
  versión 2.8.5.*
