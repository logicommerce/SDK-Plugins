# Navigator

## Descripción

El recurso permite consultar los datos de navegación del usuario y también añadir, eliminar o modificar las cookies.

## Métodos

- **String** getUserAgent()
- **String** getUrl()
- **String** getReferer()
- **String** getLanguage()
- **String** getCurrency()
- **String** getDefaultCurrency()
- **String** getPageType()
- **String** getCookie(String name)
- **void** setCookie(String name, String value)
- **void** removeCookie(String name)
- **String** getCookies()
- **String** getIp();
- **URL** getStoreUrl();
