# BasketTokenService

Servicio para reaccionar cuando se rota el token de una cesta.

Cuando una cesta pasa a estar autenticada (login, registro que deja al cliente logueado o login pendiente de escoger
cuenta), la plataforma le asigna un token nuevo para que un token conocido antes del login no pueda acceder a la sesión
autenticada. Los plugins que guardan sus propios registros indexados por el token de la cesta implementan este servicio
para apuntar esos registros al token nuevo.

Se notifica a todos los plugins que proporcionan este servicio, no solo al primero.

## Métodos disponibles

### Token rotado.

Se llama después de rotar el token de una cesta.

Cuando se ejecuta, la plataforma ya ha movido al token nuevo la cesta, el *[Storage](../Resources/Storage.md)* del
plugin asociado a la cesta, el stock bloqueado y el comparador de productos, y el token anterior ya no resuelve a la
cesta.

Se ejecuta antes de *login* de *[UserService](UserService.md)*, dentro de la misma petición, así que tiene que ser rápido.
No se llama en el logout, cuando la cesta se sustituye por otra cesta del mismo usuario ni cuando se regenera la cesta.

Los tokens son los tokens de la cesta tal cual, no el identificador externo que devuelve *getToken* de
*[Cart](../Models/Cart.md)*, que además incluye el id de la cesta. Los tokens son credenciales: no se deben escribir
nunca en los logs. Un *[Cart](../Models/Cart.md)* inyectado en el plugin es una copia tomada cuando se cargó el plugin
para la petición.

Cualquier excepción que se lance se registra en el log y se ignora: no interrumpe el login.

parámetros:

- ***String*** previousToken: Token que tenía la cesta antes de la rotación.
- ***String*** newToken: Token que tiene la cesta a partir de ahora.


## Interfaz

```java

public interface BasketTokenService extends PluginService {

	void tokenRotated(String previousToken, String newToken) throws PluginServiceException;

}

```
