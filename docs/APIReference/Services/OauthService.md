# OauthService

Servicio para la gestionar las conexiones Oauth.

Su uso es indicado en el caso de realizar un login de acceso mediante terceros.

## Métodos disponibles

### Obtener la URL Oauth

Utiliza el método: *getOauthUri*.

Método utilizado para construir la url para dar acceso a la conexión Oauth.

Mediante la URL base facilitada, el plugin puede preparar la url de acceso.

Parámetros:

- **String** redirectBaseUri : URL base de la tienda.
- **String** state: Parámetro para indicar el estado.

Devuelve: URL construida para poder conectar con el tercero y así realizar la autenticación.

### Procesar la respuesta Oauth

Se procesa mediante el método: *callback*.

El método se encarda de procesar la respuesta durante la autenticación, retornado el usuario en caso de éxito.

Parámetros:

- **String** redirectBaseUri: URL base de la tienda.
- **String** state: Parámetro para indicar el estado.
- **String** code: Parámetro facilitado por el tercero.

Devuelve: Objeto [**OauthUser**](../Models/OauthUser.md), con los datos de usuario obtenidos en la autenticación.

## Interfaz

```java
public interface OauthService extends PluginService {
		
	String getOauthUri(String redirectBaseUri, String state) throws PluginServiceException;

	OauthUser callback(String redirectBaseUri, String state, String code) throws PluginServiceException;

}
```
